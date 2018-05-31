package com.example.georgefaraj.password_validator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    boolean validate(String p){
        String upper = ".*[A-Z].*";
        String special = ".*[!@#$%^&*].*";
        String number = ".*[0-9].*";
        boolean result = true;

        if(p.toLowerCase().equals("password"))
            result = false;

        if(p.length()<8)
            result = false;

        Pattern u = Pattern.compile(upper);
        Pattern s = Pattern.compile(special);
        Pattern d = Pattern.compile(number);
        Matcher m1 = u.matcher(p);
        Matcher m2 = s.matcher(p);
        Matcher m3 = d.matcher(p);

        if(!m1.find() || !m2.find() || !m3.find())
            result = false;

        return result;
    }
}
