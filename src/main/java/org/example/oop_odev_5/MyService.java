package org.example.oop_odev_5;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    public void login(String username) {
        System.out.println("Login: " + username);
    }

    public int calculateSum(int a, int b) {
        return a + b;
    }

    public void printMessage(String message) {
        System.out.println("Message: " + message);
    }
}
