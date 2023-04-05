/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lecture10_bills;

/**
 *
 * @author lab_services_student
 */
public class bills {
    private String strCustomer;
    private double dblMinutes, dblCost;
    
    //construct recieving varaibles
    public bills (String strName, double dblCostPerMinutes, double dblMinutesTalked){
                   strCustomer = strName;
                   
                dblMinutes = dblMinutesTalked;
                dblCost = dblCostPerMinutes;
    }
    
    public String getName(){
        return strCustomer;
}
    public double getTotalBills(){
        return (dblMinutes + dblCost);
    }
}
