package com.example.demo.endpoint;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Service;

@Service
@Path("/closewindow")
public class CloseWindow {

    @GET
    @Produces({MediaType.TEXT_HTML})
    public String hello() {
        // return "<!DOCTYPE html><html><body onload=alert('hi');><h1>My First Heading</h1><p>My first paragraph.</p></body></html>";
        return "<!DOCTYPE html><html><body><h1>My First Heading</h1><p>My first paragraph.</p></body></html>";
    }
}