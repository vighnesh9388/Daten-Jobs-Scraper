import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;
import java.util.List;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;

public class Daten {
    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--window-size=1920,1080");
        
        WebDriver driver = new ChromeDriver(options);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://daten.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(2000);

        driver.findElement(By.linkText("Careers")).click();

        boolean loadMorePresent = true;
        while (loadMorePresent) {
            try {
                WebElement loadMoreBtn = driver.findElement(By.cssSelector(".btn-wrap.career-join-team .btn"));
                if (loadMoreBtn.isDisplayed()) {
                    js.executeScript("arguments[0].scrollIntoView({block:'center'});", loadMoreBtn);
                    js.executeScript("arguments[0].click();", loadMoreBtn);
                    Thread.sleep(3000);
                } else {
                    loadMorePresent = false;
                }
            } catch (Exception e) {
                loadMorePresent = false;
            }
        }

        List<WebElement> jobs = driver.findElements(By.cssSelector(".join-team-list-item"));
        System.out.println("Total Job Listings Found for Daten Technology Solutions : " + jobs.size());

        List<String> indiaJobsOutput = new ArrayList<>();
        List<String> usaJobsOutput = new ArrayList<>();
        List<String> unspecifiedJobsOutput = new ArrayList<>();

        for (WebElement job : jobs) {
            
            String location = "unspecified";
            String mode = "NO MODE DATA";
            String experience = "NO EXPERIENCE DATA";
            String title = "UNKNOWN TITLE";
            String openings = "NOT SPECIFIED";
            
            List<WebElement> details = job.findElements(By.cssSelector(".job-type span"));
            if (details.size() > 0) {
                location = details.get(0).getText();
                if (details.size() >= 2) mode = details.get(1).getText();
                if (details.size() >= 3) experience = details.get(2).getText();
            }

            List<WebElement> titleElements = job.findElements(By.cssSelector("h4 a"));
            if (titleElements.size() > 0) {
                title = titleElements.get(0).getText();
            }

            
            List<WebElement> openingElements = job.findElements(By.cssSelector(".job-id"));
            if (openingElements.size() > 0) {
                openings = openingElements.get(0).getText()
                                          .replace("No of Openings :", "")
                                          .trim();
            }

            String formattedLine = String.format("%-70s %-15s %-15s %-15s", title, openings, mode, experience);

            if (location.toLowerCase().contains("india")) {
                indiaJobsOutput.add(formattedLine);
            } else if (location.toLowerCase().contains("usa")) {
                usaJobsOutput.add(formattedLine);
            } else {
                unspecifiedJobsOutput.add(formattedLine);
            }
        }

        try (java.io.PrintWriter writer = new java.io.PrintWriter("jobs_report.txt")) {

            java.time.ZonedDateTime now = java.time.ZonedDateTime.now(java.time.ZoneOffset.UTC);

            java.time.format.DateTimeFormatter formatter =
                    java.time.format.DateTimeFormatter.ofPattern("dd MMM yyyy, hh:mm a 'UTC'");
            
            writer.println("Report generated on: " + now.format(formatter));
            writer.println();
            writer.println("Total Job Listings Found for Daten Technology Solutions : " + jobs.size());

            writer.println("\n================ INDIA JOBS : " + indiaJobsOutput.size() + " ================\n");
            writer.printf("%-70s %-15s %-15s %-15s%n", "TITLE", "OPENINGS", "MODE", "EXPERIENCE");
            for (String line : indiaJobsOutput) writer.println(line);

            writer.println("\n================ USA JOBS : " + usaJobsOutput.size() + " ================\n");
            writer.printf("%-70s %-15s %-15s %-15s%n", "TITLE", "OPENINGS", "MODE", "EXPERIENCE");
            for (String line : usaJobsOutput) writer.println(line);

            writer.println("\n================ NOT SPECIFIED JOBS : " + unspecifiedJobsOutput.size() + " ================\n");
            writer.printf("%-70s %-15s %-15s %-15s%n", "TITLE", "OPENINGS", "MODE", "EXPERIENCE");
            for (String line : unspecifiedJobsOutput) writer.println(line);
            
            System.out.println("Successfully generated jobs_report.txt!");
        } catch (java.io.IOException e) {
            System.out.println("An error occurred while writing the file.");
        }
        driver.quit();
    }
}
