package com.example.FirstSpringBootProject;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop implements Computer{

    @Override
    public void compile() {
        System.out.println("Laptop class");
    }
}
