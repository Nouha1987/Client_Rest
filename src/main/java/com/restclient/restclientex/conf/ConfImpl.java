/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restclient.restclientex.conf;

/**
 *
 * @author SAMSUNG
 */
public class ConfImpl implements Conf{

    private String baseURL;
    private String version;
    private String CompURL;

    
    public String getBaseURL() {
        return baseURL;
    }

    public void setBaseURL(String baseURL) {
        this.baseURL = baseURL;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getCompURL() {
        return CompURL;
    }

    public void setCompURL(String CompURL) {
        this.CompURL = CompURL;
    }
    
    

}
