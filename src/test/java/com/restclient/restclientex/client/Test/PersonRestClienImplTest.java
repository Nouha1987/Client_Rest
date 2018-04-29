/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restclient.restclientex.client.Test;

import com.restclient.restclientex.client.IPersonRestClient;
import com.restclient.restclientex.client.PersonRestClientImpl;
import com.restclient.restclientex.conf.Conf;
import com.restclient.restclientex.conf.ConfImpl;
import com.restclient.restclientex.entities.Person;
import static java.util.Collections.list;
import java.util.List;
import javax.sound.sampled.Clip;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SAMSUNG
 */
public class PersonRestClienImplTest {
    
    private IPersonRestClient cli;
    
    //    public PersonRestClienImplTest() {
//    }
//    
//    @BeforeClass
//    public static void setUpClass() {
//            }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
    
    private Conf conf;
    
    @Before
    public void setUp() {
        conf=new  ConfImpl();
        conf.setBaseURL("http://localhost:8080");
        conf.setVersion("/v1");
        conf.setCompURL("/person");
         cli=new PersonRestClientImpl(conf);

    }
    
     @Test
    public void Test() {
        List<Person> p=cli.allPerson();
         assertTrue(p.size()==2);

    }
    
      @Test
    public void CreatePerson() {
       Person p=new Person();
       p.setNom("test_tuto");
       p.setPrenom("unit");
        Person p_test=  cli.createPerson(p);
        assertTrue(p_test.getId()!=null && p_test.getPrenom().equals("unit"));

    }
    
    
//    @After
//    public void tearDown() {
//    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
