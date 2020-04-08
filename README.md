#!/bin/sh

A sample Android project that shows how one can generate test code coverage using, JaCoCo, SonarQube 

To run this yourself do this

- Install Docker

- Install SonarQube instance
      docker pull sonarqube:latest
- Start SonarQube instance
      docker run -d -p 9000:9000 sonarqube

- Now run following command to compile code and generate SonarQube analysis
    ./gradlew clean test testDebugUnitTest connectedAndroidTest createDebugCoverageReport jacocoTestReport sonarqube

- TIP: 

   If you have your own coverage.ec or exec file that you want to include in your SonarQube analysis 
   use command following command 

java -jar jacococli.jar report  
	./app/build/outputs/code_coverage/debugAndroidTest/connected/coverage.ec 
	--sourcefiles ./app/src --classfiles ./app/build/tmp/kotlin-classes/debug
	--html /tmp/report/ 
	--xml MyCustomReport.xml 

You can download latest jacococli.jar file in zip distribution of JaCoCo
