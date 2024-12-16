# GoWitCaseStudy
 
I made 1 API test cases according to the following scenarios at https://petstore.swagger.io/

![petstore-logo](https://github.com/user-attachments/assets/34970a5f-6769-4959-ae44-214e52be0cd3)

## Used technologies

![5968282](https://user-images.githubusercontent.com/21973124/198895378-1a03bc27-0baf-4631-bc85-3ffad86da644.png)  **Java**: The programming language in which the project is written

![testng](https://user-images.githubusercontent.com/21973124/198895448-faeb21b7-ddc7-4c72-9f67-90c092d1e7fe.png)   **TestNG**: Test Authoring Tool used for writing Test Cases and controlling outputs.

![Page-Object-Model](https://user-images.githubusercontent.com/21973124/198896027-6ad45ea7-7ac5-4a5d-ae30-34a7ae5efcda.png)  **Page Object Model**: It is the architectural structure used in the project.

![Rest-Assured](https://user-images.githubusercontent.com/21973124/221045722-f0acbfab-8c02-43f1-83ce-58b218882dee.png) **Rest-Assured**: Rest Assured is an open source library in Java and is used for testing HTTP Web services. This library makes it easy to create HTTP requests and process HTTP responses. Rest Assured is designed to test web services based on REST (Real Time Collaboration) architecture, but can also be applied to other types of web services.

![Junit](https://user-images.githubusercontent.com/21973124/221034802-128fa8ba-16e5-43be-8012-e95a0d808eb3.png) **Junit**: JUnit is an open source test automation tool in Java language. The purpose of this tool is to provide a simple, repeatable and readable testing framework that is used to test the accuracy of your code. JUnit is very widely used in the Java world, as well as the existence of similar tools for many other languages.

![png-transparent-leaf-apache-mave](https://user-images.githubusercontent.com/21973124/198895707-3ea65ae1-48fc-4ca3-9e82-87d09a301959.png) **Maven**: Automation and build tool that is usually used during the compilation of commands on the Java platform.

![JSON](https://user-images.githubusercontent.com/21973124/221034987-13f4b85f-f58f-4a6a-b166-c40fdd98d046.png) **JSON**: JSON (JavaScript Object Notation) is a data format used for data exchange. In this format, data is displayed in a structured way and is usually used for the storage or transmission of data returned by a web service or requested by a web.

![GSON](https://user-images.githubusercontent.com/21973124/221035561-e79250d1-92e3-4ed8-8ec4-ed69f54e8dae.png) **GSON**: Gson is an open source library in the Java language and was designed to facilitate the use of the JSON (JavaScript Object Notation) data format. This library automatically converts JSON data to Java objects (deserialize) and converts Java objects to JSON data (serialize).


![Allure Report](https://github.com/user-attachments/assets/2c353856-a942-44e6-8e23-7e6ecd7366ef)  **Allure Report**: Allure Report is an open-source framework designed to create test execution reports that are clear, concise, and attractive. It provides a visual and user-friendly interface that allows developers and testers to obtain detailed insights into what is happening in their tests.

![Lombok](https://user-images.githubusercontent.com/21973124/221037920-d9e28e2c-ff9c-4de1-aad2-83859aefc20a.png) **Lombok**: Lombok is an open source library in the Java language and was designed to increase regularity and readability in your Java code. This library aims to reduce the duplication of code blocks during the creation of Java objects, which often degrades readability.

## ![case-study-icon-0 (1)](https://user-images.githubusercontent.com/21973124/198896091-442fc6f2-91bb-4473-9202-090be768ca3f.png)  Case Stages

Scenario: 
Creating New Pet Test
Updating Pet Test
Getting A Pet Test
Getting Pet List By Status Tests
Deleting A Pet Test
Getting Pets By Status
Not Creating New Pet Test
Getting A Pet That Doesn't Exist Test
Not Updating New Pet Test
Getting Not Exists Pets By Status
Deleting A Pet That Doesn't Exist Test

## 🏃Run Locally

Clone the project

```bash
  git clone https://github.com/bilallgunaydin/OPTIIMSDETAssessmentUseCase.git
```

## ![test-dry-run-29014081](https://user-images.githubusercontent.com/21973124/198896684-430908ac-3c2d-40da-9b15-2759db05a707.jpg)  Start the Test

```bash
  Run "TestNG.xml" file
```
![results report](https://github.com/user-attachments/assets/e49f6705-f85f-47c1-bb33-5c17529631ed)

⚠️ **Not:** If the allure results file is not created in the target, it is created in the main directory. This is because maven and lombok are not fully compatible. If allure result is not in the target, manually drop the Allure Result folder into the target file after Run. Then write the "mvn allure:serve" code in Terminal and run it. The test results will open in your browser as html with Allure reports.

## ![pngtree-positive-feedback-line-i](https://user-images.githubusercontent.com/21973124/198895901-dee46283-e1cf-48e0-8fe6-af2d6cfe41c7.jpg) Feedback

If you have any feedback on the project, please contact me at bilallgunaydin@gmail.com.






