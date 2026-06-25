# Daten Technology Solutions Career Portal Scraper

A robust, cloud-automated web scraping data pipeline built using **Java** and **Selenium WebDriver** to extract and categorize live job openings from the corporate career site.

## Features
* **Cloud Automation:** Fully integrated with **GitHub Actions** to automatically run headless Chrome instances on a schedule and publish updates.
* **Dynamic Content Loading:** Automates scrolling and triggers the AJAX-driven JavaScript 'Load More' button until all active listings are visible in a headless environment.
* **Resilient Data Extraction:** Uses defensive DOM element checks to safely parse structured job details without breaking on malformed layouts.
* **Geographic Categorization:** Consolidated output data that groups and counts openings seamlessly into India, USA, and Unspecified buckets.

## Tech Stack
* **Language:** Java 21
* **Automation Framework:** Selenium WebDriver (Headless Chrome)
* **CI/CD & Automation:** GitHub Actions
* **Build Tool:** Maven

## Live Data Delivery
Instead of hunting through console logs, this scraper automatically generates and updates an isolated text report file right inside the repository root every time it finishes running:

View the latest live metrics here: `jobs_report.txt`
