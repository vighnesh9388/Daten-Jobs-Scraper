# Daten Technology Solutions Career Portal Scraper

A robust web scraping automation tool built using **Java** and **Selenium WebDriver** to extract and categorize live job openings from the corporate career site.

## Features
* **Dynamic Content Loading:** Automates scrolling and triggers the AJAX-driven JavaScript 'Load More' button until all active listings are visible.
* **Resilient Data Extraction:** Uses defensive DOM element checks to safely parse structured job details without breaking on malformed layouts.
* **Geographic Categorization:** Consolidated output data that groups and counts openings seamlessly into India, USA, and Unspecified buckets.

## Tech Stack
* **Language:** Java
* **Automation Framework:** Selenium WebDriver (Chrome Driver)
* **Build Tool:** Maven
* **IDE:** Eclipse

## Sample Console Output Format
```text
Total Job Listings Found for Daten Technology Solutions : 65

================ INDIA JOBS : 40 ================
TITLE                                                                  OPENINGS        MODE            EXPERIENCE     
...
