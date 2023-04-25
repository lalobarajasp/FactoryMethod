package com.demo.factory;

import com.demo.contract.Language;
import com.demo.implementation.GermanShepherd;
import com.demo.implementation.Mastiff;
import com.demo.implementation.Poodle;

public class FactoryPuppies {
    public Language whichPuppie(String race){
        switch (race) {
            case "GermanPuppie":
                return new GermanShepherd();
            case "MastiffPuppie":
                return new Mastiff();
            case "PoodlePuppie":
                return new Poodle();
            default:
                return null;
        }
    }
}
