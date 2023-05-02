/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.parc1prog;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import javax.swing.JOptionPane;

/**
 *
 * @author fereh
 */
public class UserTest {
    
   
        
        @Test
    
    public void Welcome(){
        
        String name = JOptionPane.showInputDialog("Please enter your name: ");
        String lastname = JOptionPane.showInputDialog("Please enter your last name: ");
        JOptionPane.showMessageDialog(null,"Welcome " +name+ " "+lastname+ " it is great to see you.");
        
    }
    @Test
 public void UsernameCorrectly() {
        User user = new User();
        user.setUsername("kyl_1");
        
        //https://www.w3schools.blog/junit-tutorial
        //30-04-2023
        
        // Test when the user's username is correctly formatted
        assertTrue(user.checkUserName());
        //Display message when users username is correctly captured
        JOptionPane.showMessageDialog(null, "Username successfully captured");
    }
    
    @Test
    public void UsernameIncorrectly() {
        User user = new User();
        user.setUsername("kyle!!!!!!!");
        
        // Test when the user's username is incorrectly formatted
        assertFalse(user.checkUserName());
        //Display message when users username is incorrectly captured
        JOptionPane.showMessageDialog(null, "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length");
    }
    
    @Test
    public void testPassword() {
        User user = new User();
        user.setPassword("Ch&&sec@ke99!");
        
        // Test when the user's pasword is correctly formatted
        assertTrue(user.checkPasswordComplexity());
       //Display message when user's password is correctly captured
        JOptionPane.showMessageDialog(null, "Password successfully captured");
    }
    
    @Test
    public void testPasswordIncorrectly() {
        User user = new User();
        user.setPassword("password");
        
        // Test when the user's username is incorrectly formatted
        assertFalse(user.checkPasswordComplexity());
        //Display message when user's password is incorrectly captured
        JOptionPane.showMessageDialog(null, "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number, and a special character.");
    }
    
    @Test
    public void LoginSuccessful() {
        User user = new User();
        user.setUsername("kyl_1");
        user.setPassword("Ch&&sec@ke99!");
        
        // Test when the user's username and pasword is correctly formatted
        assertTrue(user.loginUser("kyl_1", "Ch&&sec@ke99!"));
        //Display message when users username and password is correctly captured
        JOptionPane.showMessageDialog(null,"True");
    }
    
    @Test
    public void LoginFailed() {
        User user = new User();
        user.setUsername("Lilo745!!");
        user.setPassword("Xman@233");
        
        // Test when the user's username and pasword is incorrectly formatted
        assertFalse(user.loginUser("kyl_1", "wrongpassword"));
        //Display message when users username and password is incorrectly captured
        JOptionPane.showMessageDialog(null,"False");
    }
    
    @Test
    public void UsernameCorrectlyFormatted() {
        User user = new User();
        user.setUsername("Lilo_");
        
        // Test when the user's useername is correctly formatted 
        assertTrue(user.checkUserName());
        //Display message when user's username is correctly formatted
        JOptionPane.showMessageDialog(null,"True");
    }
    
    @Test
    public void UsernameIncorrecttlyFormatted() {
        User user = new User();
        user.setUsername("Lilo745!!");
        
        // Test when the user's useername is incorrectly formatted 
        assertFalse(user.checkUserName());
        //Display message when user's username is incorrectly formatted
        JOptionPane.showMessageDialog(null,"False");
    }
    
    @Test
    public void PasswordCorrectlyMet() {
        User user = new User();
        user.setPassword("Xman@233");
        
        // Test when the user's useername is correctly formatted 
        assertTrue(user.checkPasswordComplexity());
        //Display message when user's username is correctly captured
        JOptionPane.showMessageDialog(null,"True");
    }
    
    @Test
    public void PasswordNotMeet() {
        User user = new User();
        user.setPassword("password");
        
        // Test when the user's password is does not meet the requirement 
        assertFalse(user.checkPasswordComplexity());
        //Display message when user's pasword has not been met
        JOptionPane.showMessageDialog(null,"False");
    }
}
    
    

