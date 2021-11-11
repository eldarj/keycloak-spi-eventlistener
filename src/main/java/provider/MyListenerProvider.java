package provider;

import org.keycloak.events.Event;
import org.keycloak.events.EventListenerProvider;
import org.keycloak.events.admin.AdminEvent;
import org.keycloak.models.KeycloakSession;

import java.util.logging.Logger;

public class MyListenerProvider implements EventListenerProvider {
    private static final Logger log = Logger.getLogger(MyListenerProvider.class.getName());

    public MyListenerProvider(KeycloakSession keycloakSession) {
    }

    @Override
    public void onEvent(Event event) {
        log.info("onEvent " + event.getId());
    }

    @Override
    public void onEvent(AdminEvent adminEvent, boolean b) {
        log.info("onAdminEvent " + adminEvent.getId());
    }

    @Override
    public void close() {
    }
}
