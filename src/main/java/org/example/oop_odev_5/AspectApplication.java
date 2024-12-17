package org.example.oop_odev_5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AspectApplication implements CommandLineRunner {

    @Autowired
    private MyService myService;

    public static void main(String[] args) {
        SpringApplication.run(AspectApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        myService.login("Aktan Temirbolotov");
        int result = myService.calculateSum(10, 9);
        System.out.println("Age: " + result);
        myService.printMessage("Hello, BLG!!!");
    }
}
