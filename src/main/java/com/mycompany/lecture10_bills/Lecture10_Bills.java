/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lecture10_bills;
import javax.swing.*;
/**
 *
 * @author lab_services_student
 */
public class Lecture10_Bills {

    public static void main(String[] args) {
        String strName = JOptionPane.showInputDialog(null, "Enter the customer's name");
        double dblMinutesTalked = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the minutes"));
        double dblCostPerMinutes = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the cost per minutes"));
        
        bills b = new bills(strName, dblMinutesTalked, dblCostPerMinutes);
        
        JOptionPane.showMessageDialog(null, "Customer Name: " +
                b.getName() .toUpperCase() + "\n" + 
                        "Total Due: R " + b.getTotalBills());
    }
}
