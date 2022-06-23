# HelloDropWizard

How to start the HelloDropWizard application
---

1. Run `mvn clean install` to build your application
1. Start application with `java -jar target/HelloDropWizard-1.0-SNAPSHOT.jar server config.yml`
1. To check that your application is running enter url `http://localhost:8090`
(note port 8090)

Health Check
---
To see your application health enter url `http://localhost:8091/healthcheck`
(note port 8091 because McAfee blocks port 8091)