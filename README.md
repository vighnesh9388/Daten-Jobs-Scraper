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

---

## Latest Automated Report

<!-- REPORT_START -->

```text
Report generated on: 31 Aug 2026, 04:06 PM UTC

Total Job Listings Found for Daten Technology Solutions : 65

================ INDIA JOBS : 51 ================

TITLE                                                                  OPENINGS        MODE            EXPERIENCE     
Production Support Engineer – Amdocs Optima                            1               On site         4-10 Years     
Full Stack AI Engineer                                                 1               On site         5-10 Years     
PMO Executive – Delivery                                               1               On site         1-3 Years      
IT Operations Engineer                                                 1               On site         3-7 Years      
IT Operations Lead                                                     1               On site         8-15 Years     
HR Learning & Development Operations                                   1               On site         5-10 Years     
SDET (Software Development Engineer in Test)                           8               On site         5-10 Years     
Creative Designer                                                      1               On site         3-7 Years      
QA Analyst – API Testing                                               1               On site         3-7 Years      
Senior Drupal Developer                                                1               On site         5-10 Years     
Java Full Stack Developer                                              1               On site         3-8 Years      
Frontend Developer                                                     1               On site         3-6 Years      
Okta Developer                                                         2               On site         5-9 Years      
Technical Architect – Okta                                             1               On site         10-15 Years    
Talent Acquisition Executive                                           2               On site         1-3 Years      
Junior Linux Administrator                                             3               On site         NO EXPERIENCE DATA
Senior iOS Developer                                                   2               On site         8-12 Years     
Senior Android Developer                                               2               On site         8-12 Years     
Salesforce Lead – Service Cloud                                        1               On site         8-14 Years     
Salesforce Technical Lead – Sales Cloud                                1               On site         8-14 Years     
Data Analytics Sr. Developer                                           1               On site         8-12 Years     
Big Data Lead                                                          2               On site         10-15 Years    
Linux Administrator                                                    1               On site         10-15 Years    
Senior PostgreSQL DBA                                                  1               On site         14-15 Years    
Python Developer                                                       1               On site         7-12 Years     
Senior RAN Automation Engineer                                         2               On site         7-15 Years     
ML/Data Scientist                                                      1               On site         5-10 Years     
Senior IT Operational Analyst                                          15              On site         7-15 Years     
RF Design Engineer                                                     3               On site         10-15 Years    
RAN System Engineer                                                    4               On site         10-15 Years    
RAN Performance Optimization Engineer                                  3               On site         5-15 Years     
Big Data Developer                                                     12              On site         5-10 Years     
Senior API and Integration Engineer                                    7               On site         5-10 Years     
Systems Engineer – Cloud Architect                                     1               On site         7-8 Years      
Sr. DevOps Engineer                                                    8               On site         7-8 Years      
Principal Software Engineer                                            1               On site         5-10 Years     
Principal Engineer I (DOCSIS)                                          5               On site         5-10 Years     
Principal Architect – CI/CD, DevOps & Cloud Infrastructure             1               On site         7-8 Years      
Director, Business Intelligence & Reporting                            2               On site         10-12 Years    
Data Developer                                                         5               On site         5-10 Years     
Cloud Systems Engineer                                                 1               On site         7-8 Years      
Assoc Network Ops Engineer                                             1               On site         7-8 Years      
Sr. Cloud Architect (AWS)                                              1               On site         5-8 Years      
Sr. Business Intelligence Engineer                                     1               On site         5-8 Years      
Sr. AI/ML Engineer                                                     1               On site         5-8 Years      
Senior Data Scientist- Network Analytics Reliability Enablement Team   1               On site         5-10 Years     
Data Architect                                                         1               On site         4-5 Years      
Principal AI Architect                                                 1               On site         5-10 Years     
Google Cloud Operations Engineer                                       3               Remote          5-10 Years     
Data Engineer                                                          5               Remote          5-10 Years     
Data Analyst                                                           5               Remote          5-10 Years     

================ USA JOBS : 12 ================

TITLE                                                                  OPENINGS        MODE            EXPERIENCE     
Production Support Engineer – Amdocs Optima                            1               On site         4-10 Years     
Cloud Infrastructure & Platform Engineer                               1               On site         5-10 Years     
BSS Solutions Architect                                                1               On site         8-15 Years     
Java API Developer                                                     1               On site         5-10 Years     
Software Development Engineer in Test (SDET)                           1               On site         4-5 Years      
Engagement Manager                                                     1               On site         7-8 Years      
BSS Architect                                                          1               On site         12-15 Years    
Automation Developer                                                   1               On site         5-8 Years      
Mobility Practice Technical Architect                                  1               On site         12-17 Years    
OKTA Developer                                                         1               On site         8-15 Years     
Engagement Manager                                                     1               On site         8-20 Years     
Junior Network Engineer                                                1               On site         2-4 Years      

================ NOT SPECIFIED JOBS : 2 ================

TITLE                                                                  OPENINGS        MODE            EXPERIENCE     
Frontend Developer                                                     NOT SPECIFIED   NO MODE DATA    NO EXPERIENCE DATA
Frontend Developer                                                     NOT SPECIFIED   NO MODE DATA    NO EXPERIENCE DATA
```
<!-- REPORT_END -->
