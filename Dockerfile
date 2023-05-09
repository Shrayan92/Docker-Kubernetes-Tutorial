FROM openjdk:17
VOLUME /tmp
EXPOSE 8070
COPY docker-entrypoint.sh .
COPY target/docker-kubernetes-0.0.1-SNAPSHOT.jar docker-kubernetes-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["./docker-entrypoint.sh"]
