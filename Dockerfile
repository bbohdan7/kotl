FROM jboss/wildfly
RUN /opt/jboss/wildfly/bin/add-user.sh admin admin_123 --silent
ADD ./target/kotl.war /opt/jboss/wildfly/standalone/deployments
ADD mysql /opt/jboss/wildfly/modules/system/layers/base/com
ADD standalone.xml /opt/jboss/wildfly/standalone/configuration/standalone.xml

EXPOSE 8080
EXPOSE 9990

CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0"]
