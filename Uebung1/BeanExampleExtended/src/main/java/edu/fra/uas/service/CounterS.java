package edu.fra.uas.service;


import org.springframework.stereotype.Service;

@Service
public class CounterS {

    private int count = 0;

    public CounterS () {
        System.out.println("CounterService wird initialisiert");
        count++;
        System.out.println("count beträgt = " + count);
        System.out.println("Robin ist ein Knecht");

    }





}
