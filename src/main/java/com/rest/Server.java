package com.rest;

import com.rest.cors.CORSFilter;
import com.rest.matching.MatchingEngine;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("/")
public class Server extends ResourceConfig {

    public Server() {
        register(CORSFilter.class);
    }
}
