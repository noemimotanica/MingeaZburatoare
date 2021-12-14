package Mostenire_incapsulare;

import org.junit.Test;

import java.util.Arrays;

public class Mostenire_test {

    @Test
    public void testautomat() {

        Audi Q5=new Audi("Hatchback", 5, 5, "MQB", 2.0, "manuala", "Benzina", "Q5", Arrays.asList("Radio", "Panoramic","Servo"),5000.0 );
        Q5.configuratieMasina();

        Audi Q7= new Audi ("Berlina", 5, 5, "MQB", 5.0, "automata", "Diesel",
                "Q7", Arrays.asList("Panoramic", "Servo"), 5000.4);
        Q7.configuratieMasina();

        VW Golf4=new VW("hatchback",4, 5, "MQB", 5.0, "automata", "DIesel", "Germania", 210.00, Arrays.asList("Climatronic", "incalzire in volan"), "Golf 4" );
        Golf4.configuratieMasina();

        Golf4.afiseazaOrigine();
        Golf4.setModel("Golf5");
        Golf4.configuratieMasina();


    }

}
