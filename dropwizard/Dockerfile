FROM java:8-jre

RUN mkdir -p /opt/dropwizard

COPY configuration.yml /opt/dropwizard
COPY target/izea-webservice-dropwizard-1.0.0.jar /opt/dropwizard

EXPOSE 8080

WORKDIR /opt/dropwizard

CMD java -jar izea-webservice-dropwizard-1.0.0.jar server configuration.yml
