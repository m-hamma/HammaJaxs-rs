package com.hamma.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.hk2.utilities.binding.AbstractBinder;

import com.hamma.rest.CategorieRest;

import com.hamma.services.CategorieService;
import com.hamma.services.impl.CategorieServiceImpl;
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
    	 this.register(AutoScanFeature.class);
    	/*this.register(new AbstractBinder(){
            @Override
            protected void configure() {
                // map this service to this contract
                bind(CategorieServiceImpl.class).to(CategorieService.class);
            }
        },CategorieRest.class);*/
    }
}
