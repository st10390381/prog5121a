/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parc1prog;

/**
 *
 * @author fereh
 */
public class User {
    private String username;
    private String password;

    public boolean checkUserName() {
        //Dislaying the length of the required username and the need of a underscore
        
        //https://www.w3schools.com/java/java_ref_string.asp
        //29-04-2023
        
        return username.matches("^[a-zA-Z0-9_]{1,20}$");
    }

    public boolean checkPasswordComplexity() {
        //Dislaying the different vairables used to capture a password
        return password.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()_+-=]).{8,}$");
    }

    public String registerUser() {
        if (!checkUserName()) {
            return "Username is incorrectly formatted.";
        } else if (!checkPasswordComplexity()) {
            return "Password does not meet the complexity requirements.";
        } else {
            // When regirstered successfully this message will display
            return "User registered successfully!!";
        }
    }

    public boolean loginUser(String Username, String Password) {
         //https://www.w3schools.com/java/java_ref_string.asp
        //29-04-2023
        
        // Verifying if the entered username and password detail matches 
        return Username.equals(username) && Password.equals(password);
    }

    public String returnLoginStatus(boolean isLoginSuccessful) {
        if (isLoginSuccessful) {
            return "Login successful.";
        } else {
            return "Login failed.";
        }
    }

   
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}


