package com.example.georgefaraj.password_validator;

public class Validator {
    boolean validate(String p){
        boolean result = true;
        if(p.toLowerCase().equals("password"))
            result = false;
        if(p.length()<8)
            result = false;
        return result;
    }
}
