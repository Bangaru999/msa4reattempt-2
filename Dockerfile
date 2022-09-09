FROM openjdk:17
MAINTAINER :msa4reattempt-2
COPY target/msa4reattempt-2-0.0.1-SNAPSHOT.jar msa4reattempt-2-0.0.1-SNAPSHOT.jar
EXPOSE 8087
CMD ["java" "-jar" msa4reattempt-2.jar]
