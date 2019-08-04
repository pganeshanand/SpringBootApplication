# SpringBootApplication

Spring Boot Application

This project contains the solution for both the Queries

Steps to be followed for execution:
1. Download the code from Github or Clone the repositary to your local PC.
2. Java 8 and Maven 3.6.1 is used to build this application, so it should be set in Path value of environment variables.
3. You will not have any files inside the output directory.
4. You will have 1 csv file named 'inputDate.csv' inside the input directory with 5 rows of data.
5. Open the command window and go to project directory.
6. Run the command as given below to build and run the spring boot application,
mvn package && java -jar target/springboot-batch-0.0.1-SNAPSHOT.jar

7. To verify batch job: 
Once the application is started the batch job will be triggered, it reads the contents of the 'inputData.csv' file and creates a new file inside output folder as 'outputData.csv'.

8. To verify the Date Query:
Open your favourite browser and try the URL: http://localhost:8080/dateDiff
Enter the valid date fromDate and valid toDate using datepicker.
Click the Submit button to the find the days between these days.
You can also enter toDate less than fromDate to verify the errorMessage configured in application.properties file.

