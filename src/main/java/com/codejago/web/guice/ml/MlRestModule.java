package com.codejago.web.guice.ml;

import com.google.inject.Singleton;
import com.google.inject.name.Names;
import com.google.inject.servlet.ServletModule;
import com.sun.jersey.guice.spi.container.servlet.GuiceContainer;
import org.codehaus.jackson.jaxrs.JacksonJsonProvider;

import java.util.HashSet;
import java.util.Set;

/**
 * Configures our REST service
 */
public class MlRestModule extends ServletModule {

  @Override
  protected void configureServlets() {
    super.configureServlets();

    // JSON mapper, maps JSON to/from POJOs
    bind(JacksonJsonProvider.class).in(Singleton.class);

    // Serve all URLs through Guice
    serve("/*").with(GuiceContainer.class);

    // The actual REST Endpoints
    bind(ApiResource.class).in(Singleton.class);
  }

}