package provider;

import org.keycloak.Config;
import org.keycloak.events.EventListenerProvider;
import org.keycloak.events.EventListenerProviderFactory;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.KeycloakSessionFactory;
import org.keycloak.provider.ServerInfoAwareProviderFactory;

import java.util.HashMap;
import java.util.Map;

public class MyListenerProviderFactory implements EventListenerProviderFactory, ServerInfoAwareProviderFactory {
    @Override
    public EventListenerProvider create(KeycloakSession keycloakSession) {
        return new MyListenerProvider(keycloakSession);
    }

    @Override
    public void init(Config.Scope scope) {
    }

    @Override
    public void postInit(KeycloakSessionFactory keycloakSessionFactory) {
    }

    @Override
    public void close() {
    }

    @Override
    public String getId() {
        return "myListener";
    }

    @Override
    public Map<String, String> getOperationalInfo() {
        return new HashMap<String, String>() {{
            put("sample1", "operational");
            put("sample2", "info");
            put("sample3", "from my event listener");
        }};
    }
}
