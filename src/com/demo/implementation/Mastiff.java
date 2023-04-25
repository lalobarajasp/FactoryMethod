package com.demo.implementation;

import com.demo.contract.Language;

public class Mastiff implements Language {
    @Override
    public void speak() {
        System.out.println("I'm a Mastiff puppie and I speak french wuao");
    }
}
