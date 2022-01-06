package io.github.linuxcounter.web.rest.v1.config;

import io.github.linuxcounter.web.rest.v1.json.AnonymousRecordAdapter;
import javax.enterprise.context.ApplicationScoped;
import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;
import javax.json.bind.config.PropertyNamingStrategy;
import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;

@ApplicationScoped
@Provider
public class JsonbConfigurator implements ContextResolver<Jsonb> {

  @Override
  public Jsonb getContext(Class<?> type) {
    final JsonbConfig jsonbConfig = new JsonbConfig()
        .withPropertyNamingStrategy(PropertyNamingStrategy.LOWER_CASE_WITH_UNDERSCORES)
        .withNullValues(Boolean.TRUE)
        .withFormatting(Boolean.TRUE)
        .withAdapters(
            new AnonymousRecordAdapter()
        );

    return JsonbBuilder.newBuilder()
        .withConfig(jsonbConfig)
        .build();
  }
}
