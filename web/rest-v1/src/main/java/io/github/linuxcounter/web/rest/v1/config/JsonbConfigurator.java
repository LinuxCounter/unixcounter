package io.github.linuxcounter.web.rest.v1.config;

import javax.enterprise.context.ApplicationScoped;
import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;
import javax.json.bind.config.PropertyNamingStrategy;
import javax.ws.rs.ext.ContextResolver;

@ApplicationScoped
public class JsonbConfigurator implements ContextResolver<Jsonb> {

  @Override
  public Jsonb getContext(Class<?> type) {
    final JsonbConfig jsonbConfig = new JsonbConfig()
        .withPropertyNamingStrategy(PropertyNamingStrategy.LOWER_CASE_WITH_UNDERSCORES)
        .withNullValues(Boolean.TRUE);

    return JsonbBuilder.newBuilder()
        .withConfig(jsonbConfig)
        .build();
  }
}
