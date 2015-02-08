package com.codejago.web.guice.ml;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
public class ApiResource {

  private final Logger logger;

  @Inject
  public ApiResource(Logger logger) {
    this.logger = logger;
  }

  @POST
  @Path("hello")
  public Hello hello(Hello hello) {
    logger.info(hello.getText());
    return hello;
  }
  
  @GET
  @Path("hello")
  public Hello hello() 
  {
  	 Hello hello = new Hello();  
    
    hello.setText( "yo" );
    
    return hello;
  }

}
