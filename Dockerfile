FROM java:8
VOLUME /tmp
ADD target/musiccatalog-0.0.1-SNAPSHOT.jar musiccatalog.jar
RUN bash -c 'touch /musiccatalog.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/musiccatalog.jar"]