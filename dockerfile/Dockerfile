FROM java:8
VOLUME /tmp
ADD maven/musiccatalog-0.0.1-SNAPSHOT.jar musiccatalog-0.0.1-SNAPSHOT.jar
RUN bash -c 'touch /musiccatalog-0.0.1-SNAPSHOT.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/musiccatalog-0.0.1-SNAPSHOT.jar"]