/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parc1prog;
import javax.swing.JOptionPane;
/**
 *
 * @author fereh
 */
public class Parc1prog {


    public static void main(String[] args) {
        
        
    String username = JOptionPane.showInputDialog("Please enter a username: ");
    String password = JOptionPane.showInputDialog("Please enter a password: ");
    String firstName = JOptionPane.showInputDialog("Please enter your first name: ");
    String lastName = JOptionPane.showInputDialog("Please enter your last name: ");

    
    boolean usernameValid = username.matches("^\\w{1,5}$") && username.contains("_");

  
    boolean passwordValid = password.matches(("^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8}$"));

    if (usernameValid && passwordValid) {
       

        JOptionPane.showMessageDialog(null, "Account created successfully!");
    } else {
        String errorMessage = "The following errors were found:\n";
        if (!usernameValid) {
            errorMessage += "Password successfully captured”";
        }
        if (!passwordValid) {
            errorMessage += "- Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number, and a special character.\n";
        }

        JOptionPane.showMessageDialog(null, errorMessage);
    }
boolean isAuthenticated = true;
switch (username) {
    case "username1":
        if (password.equals("password1")) {
            isAuthenticated = true;
        }
        break;
    case "username2":
        if (password.equals("password2")) {
            isAuthenticated = true;
        }
        break;
    // Add more cases for additional usernames and passwords
    default:
        JOptionPane.showMessageDialog(null, "Invalid username or password");
        return;
}

if (isAuthenticated) {
    JOptionPane.showMessageDialog(null, "Login successful");
} else {
    JOptionPane.showMessageDialog(null, "Incorrect username or password");
}
     
}
    }
