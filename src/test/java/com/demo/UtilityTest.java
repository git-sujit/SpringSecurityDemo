package com.demo;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class UtilityTest {

    @Test
    public void encrypt_password() {
        //insert into hack.User(username, password) values("usr5", "$2a$10$j77h7q9ku583Yg5AnE6O.eXLHSEiyMCpMWfVw4XXelCvR3T8Vor46");
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        printEncodedPassword(passwordEncoder, "pwd1");
        printEncodedPassword(passwordEncoder, "pwd2");
        printEncodedPassword(passwordEncoder, "pwd3");
        printEncodedPassword(passwordEncoder, "pwd4");
        printEncodedPassword(passwordEncoder, "pwd5");

    }

    private void printEncodedPassword(PasswordEncoder passwordEncoder, String password) {
        String encodedPwd = passwordEncoder.encode(password);
        System.out.println(password + " = " + encodedPwd);
    }
}
