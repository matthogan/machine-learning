package com.codejago.web.guice.ml;

import com.google.inject.servlet.ServletModule;

public class MlServletModule extends ServletModule 
{
       @Override
       protected void configureServlets() 
       {
              serve("/hello").with( HelloServlet.class );
       }
}