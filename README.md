#!/bin/sh

To generate full CodeCoverage picture generate use command 

./gradlew clean test testDebugUnitTest connectedAndroidTest createDebugCoverageReport jacocoTestReport sonarqube

If you have your own coverage.ec or exec file that you want to include in your SonarQube analysis use command like this 

java -jar jacococli.jar report  
	./app/build/outputs/code_coverage/debugAndroidTest/connected/coverage.ec 
	--sourcefiles ./app/src --classfiles ./app/build/tmp/kotlin-classes/debug
	--html /tmp/report/ 
	--xml MyCustomReport.xml 

You can download latest jacococli.jar file in zip distribution of JaCoCo
