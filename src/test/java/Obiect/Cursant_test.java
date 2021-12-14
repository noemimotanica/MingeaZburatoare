package Obiect;

import org.junit.Test;

import java.util.Arrays;

public class Cursant_test {

    @Test
    public void testAutomat (){
        //declaram un obiect de tipul cursant
        System.out.println("--- Obiectul Noemi---");
        Cursant Noemi=new Cursant ("Boros", "Noemi", 26,
                false,5.000, Arrays.asList(" Manual Testing", "Automation Testing", "Java"));
        Noemi.dateCursantCursuri();
        Noemi.prenume="Mara";
        Noemi.dateCursantCursuri();
        Noemi.verificaVarstaCursant();
        Noemi.varsta=17;
        Noemi.dateCursantCursuri();
        Noemi.verificaVarstaCursant();
        System.out.println("---Obiectul Gabriela---");

        Cursant Gabriela=new Cursant ("Salajan", "Gabriela", 18, false, 5000.0,
                Arrays.asList("Database", "Automation Testing"));
        Gabriela.dateCursantCursuri();
        Gabriela.verificaVarstaCursant();

        System.out.println("---Obiectul Vlad---");
        Cursant Vlad=new Cursant("Domide", "Gabriela", 35, true, 5000.0, "Devops");
        Vlad.dateCursantCurs();
        Vlad.verificaVarstaCursant();

        System.out.println("---Obiectul Paul---");
        Cursant Paul=new Cursant("Popescu", "Paul", 20, true, "Devops");
        Paul.dateCursantCurs();
        Paul.verificaVarstaCursant();





    }

}
