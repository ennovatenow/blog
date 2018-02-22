package com.evolvus.flux;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SimpleFileMoveRouter extends RouteBuilder {

    @Value("${file.source}")
    private String sourceFolder;
    
    @Value("${file.destination}")
    private String targetFolder;
    
    
	@Override
	public void configure() throws Exception {
       from("file://" + sourceFolder).to("file://" + targetFolder);
	}

}
