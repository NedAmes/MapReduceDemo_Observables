package com.ps.mapreducedemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MapReduceDemoApplication implements CommandLineRunner {
    @Autowired
    MapReduceDemo mapReduceDemo;

    private static Logger LOG = LoggerFactory
            .getLogger(MapReduceDemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(MapReduceDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        mapReduceDemo.doMapReduce("C:\\Temp\\MapReduceDemo");
    }
}
