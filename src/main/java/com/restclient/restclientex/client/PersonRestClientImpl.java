/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restclient.restclientex.client;

import com.restclient.restclientex.conf.Conf;
import com.restclient.restclientex.conf.ConfImpl;
import com.restclient.restclientex.entities.Person;
import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import java.util.List;

/**
 *
 * @author SAMSUNG
 */
public class PersonRestClientImpl implements IPersonRestClient {

    private IPersonRestClient presCli;
    
//    private static final String BASE_URL="http://localhost:8080/v1/person";;
    private String base_url;
    private Conf conf;
            
    public PersonRestClientImpl(Conf conf) {
        this.conf=conf;
        base_url=conf.getBaseURL()+conf.getVersion()+conf.getCompURL();
        presCli= Feign.builder()
                .encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder())
                .target(IPersonRestClient.class, base_url);
    }

    
    
    @Override
    public Person createPerson(Person person) {
        return presCli.createPerson(person);
    }

    @Override
    public Person updatePerson(Person person) {
             return presCli.updatePerson(person);
}

    @Override
    public void deletePerson(Long id) {
       
    }

    @Override
    public List<Person> allPerson() {
        return presCli.allPerson();
    }

    @Override
    public List<Person> allPerson_byName(String nom) {
        return presCli.allPerson_byName(nom);
    }
    
}
