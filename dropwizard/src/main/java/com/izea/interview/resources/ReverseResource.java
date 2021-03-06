package com.izea.interview.resources;

import com.google.common.base.Optional;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/reverse")
@Produces(MediaType.APPLICATION_JSON)
public class ReverseResource {
    private final String template;
    
    public ReverseResource(String template) {
        this.template = template;
    }

    @GET
    public String reverse(@QueryParam("input") Optional<String> input) {
        // Reverse the Optional String Parameter "input"
        final StringBuffer sb_input = new StringBuffer();
        
        if ( input.isPresent() ) {            
            for (int i = input.get().length()-1; i >= 0; i-- ) {
                sb_input.append(input.get().charAt(i));
            }
        }

        return String.format(template, sb_input.toString());
    }
}
