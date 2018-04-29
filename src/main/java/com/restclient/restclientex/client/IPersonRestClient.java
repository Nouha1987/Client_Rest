/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restclient.restclientex.client;

//import feign
import com.restclient.restclientex.entities.Person;
import feign.Headers;
import feign.Param;
import feign.RequestLine;
import java.util.List;

/**
 *
 * @author SAMSUNG
 */
@Headers("Accept: application/json")
public interface IPersonRestClient {

    static final String GET = "GET ";
    static final String POST = "POST ";
    static final String PUT = "PUT ";
    static final String DELETE = "DELETE ";

    static final String CREATE_PERSON = POST + "/create";
    static final String UPDATE_PERSON = PUT + "/update/{id}";
    static final String DELETE_PERSON = DELETE + "/delete/{id}";
    static final String GET_ALL_PERSON = GET + "/all";
    static final String GET_ALL_PERSON_BY_NAME = GET + "/byname/{name}";

    @Headers("Content-Type: application/json")
    @RequestLine(CREATE_PERSON)
    public Person createPerson(Person person);

     @Headers("Content-Type: application/json")
    @RequestLine(UPDATE_PERSON)
    public Person updatePerson(Person person);

     @RequestLine(DELETE_PERSON)
    public void deletePerson(@Param(value="id") Long id);

    
     @RequestLine(GET_ALL_PERSON)
    public List<Person> allPerson();

     @RequestLine(GET_ALL_PERSON_BY_NAME)
    public List<Person> allPerson_byName(String nom);

}
