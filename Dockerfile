FROM jboss/wildfly:latest
ADD docker/customization /opt/jboss/wildfly/customization/
ADD docker/modules /opt/jboss/wildfly/modules/
ADD target/javaee-1.0-SNAPSHOT.war /opt/jboss/wildfly/standalone/deployments/
RUN /opt/jboss/wildfly/customization/execute.sh