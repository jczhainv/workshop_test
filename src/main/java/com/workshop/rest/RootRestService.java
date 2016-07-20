package com.workshop.rest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * This class is responsible for injecting RESTful WebService implementation
 */

// @ApplicationPath is mandatory.
// servlet.mapping.prefix defined in web.xml and URL has to be match with @ApplicationPath value
@ApplicationPath("/rest")
public class RootRestService extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        // Don't define class type, so we can inject more classes
        Set<Class<?>> classes = new HashSet<Class<?>>();
        classes.add(TestService.class);
        classes.add(MyService.class);
        return classes;
    }
}
