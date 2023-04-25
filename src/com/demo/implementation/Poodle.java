package com.demo.implementation;

import com.demo.contract.Language;

public class Poodle implements Language {
    @Override
    public void speak() {
        System.out.println("I'm a Poodle puppie and I speak english wuao");
    }
}
