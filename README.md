# Spring Boot Microservices Configuration server Example

## Configuration Server
[Spring-Ms-Config-Server](Spring-Ms-Config-Server) is an example project for Configuration Server

## Configuration Client
[Spring-Ms-Config-Client](Spring-Ms-Config-Client) is an example project for Configuration Client

## Steps followed to create configuration server
1. Created Springboot app with Spring cloud config server starter
2. Created git repository for Configuration files: [DemoConfigRepo](../DemoConfigRepo)
3. Added '@EnableConfigServer' on application class to enable configuration server nature on application
4. Provided Configuration file repository URL in properties file

## Steps followed to create configuration Client which uses configuration server to access properties
1. Created Spring Boot app with Spring cloud config client starter
2. Created a Rest controller to read and serve config properties
3. Added Config Server URI in properties. Renamed properties file to bootstrap.properties.


## How to run the example
1. Clone repository and import it as maven projects
2. Start Congif server as Spring Boot application
3. Start Config Client as Spring boot application
3. To test config server directly, access following URLS:
	. http://localhost:9999/config-demo-client-development.properties
	. http://localhost:9999/config-demo-client-development.yml
	. http://localhost:9999/config-demo-client-development.json
4. To test config client, access http://localhost:7777/greeting