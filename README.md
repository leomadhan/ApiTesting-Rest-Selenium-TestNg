# APITesting RestAssured-Selenium-TestNG-Maven

API Automation framework based on RestAssured, Selenium, TestNG using Java.
The framework uses:
1. RestAssured
2. Selenium
3. TestNG
4. Maven

API Test Scenario 

| # | Test Scenario Category | Test Action Category | Test Action Description |
| ----- | ------ | ------ | ------ |
|1|	Basic positive tests (happy paths)| | |
||Execute API call with valid required parameters | Validate status code: |	1. All response should return 2XX HTTP status code  2. Returned status code is according to spec: – 200 OK for GET |
|||Validate payload:|	1. Response is a well-formed JSON object  2. Response structure is according to data model (schema validation: field names and field types are as expected, including nested objects; field values are as expected; non-nullable fields are not null, etc.)|
|||Validate state:| 	1. For GET response, verify there is StatusLine|

By MMM