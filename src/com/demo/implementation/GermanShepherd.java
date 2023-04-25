package com.demo.implementation;

import com.demo.contract.Language;

public class GermanShepherd implements Language {
    @Override
    public void speak() {
        System.out.println("I'm a German Shepherd puppie and I speak german wuao");
    }
}
