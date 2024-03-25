FROM amazoncorretto:17
COPY target/Library-0.0.1-SNAPSHOT.war /Library-0.0.1-SNAPSHOT.war
ENTRYPOINT ["java", "-jar", "/Library-0.0.1-SNAPSHOT.war"]
