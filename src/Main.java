import com.demo.contract.Language;
import com.demo.factory.FactoryPuppies;
import com.demo.implementation.GermanShepherd;

public class Main {
    public static void main(String[] args) {
        //how you'd do it you'd expose your class to the client
        Language language = new GermanShepherd();
        language.speak();

        System.out.println("---------------------------");

        //how you do it implementation a Factory Creational Method
        FactoryPuppies factoryPuppies1 = new FactoryPuppies();
        Language germanpuppie = factoryPuppies1.whichPuppie("GermanPuppie");
        germanpuppie.speak();

        FactoryPuppies factoryPuppies2 = new FactoryPuppies();
        Language mastiffpuppie = factoryPuppies2.whichPuppie("MastiffPuppie");
        mastiffpuppie.speak();

        FactoryPuppies factoryPuppies3 = new FactoryPuppies();
        Language poodlepuppie = factoryPuppies3.whichPuppie("PoodlePuppie");
        poodlepuppie.speak();


    }
}