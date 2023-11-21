/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package com.num.text;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author ACER
 */
@WebService(serviceName = "NumToText")
public class NumToText {
    /**
     * Web service operation
     */
    
    String k="";
    @WebMethod(operationName = "numToText")
    public String numToText(@WebParam(name = "a") int a) {
        //TODO write your implementation code here:
        String[] num={"zero","one","two","three","four","five","six","seven","eight","nine"};
        
        while(a%10>0){
            k=num[a%10]+" "+k;
            a=a/10;
        }
        return k;
    }
}
