FROM amazoncorretto:17
COPY target/Library-0.0.1-SNAPSHOT.war /Library-0.0.1-SNAPSHOT.war
ENTRYPOINT ["java", "-jar", "/Library-0.0.1-SNAPSHOT.war"]

FROM mysql:latest
# Copy initialization script into the container
COPY init-db.sql /docker-entrypoint-initdb.d/

# Set environment variables
ENV MYSQL_ROOT_PASSWORD=hello
ENV MYSQL_DATABASE=library

# Expose the MySQL port
EXPOSE 3306

