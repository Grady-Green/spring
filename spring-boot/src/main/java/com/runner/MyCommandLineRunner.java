package com.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class MyCommandLineRunner implements CommandLineRunner,Ordered{
    @Override
    public void run(String... strings) throws Exception {
        System.out.println(" - - - - MyCommandLineRunner - - - - - - ");
        System.out.println(Arrays.toString(strings));
    }

    @Override
    public int getOrder() {
        return 1;
    }
}
