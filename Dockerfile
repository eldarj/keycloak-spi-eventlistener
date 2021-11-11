FROM quay.io/keycloak/keycloak:15.0.2

# Copy the SPI jar into deployments folder
COPY target/*.jar /opt/jboss/keycloak/standalone/deployments
