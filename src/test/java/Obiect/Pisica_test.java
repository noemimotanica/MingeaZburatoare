package Obiect;

import org.junit.Test;

import java.util.Arrays;

public class Pisica_test {

    @Test
    public  void testAutomat () {
        System.out.println("---Obiectul Lala---");
        Pisica Lala=new Pisica ("Lala", "portocalie", 3, true, Arrays.asList("Main Coon", "British Shorthair", "Chartreusse"));
        Lala.datePisica();

        System.out.println("---Obiectul Kitty---");
        Pisica Kitty=new Pisica ("verzi", "soricel", true);
        Kitty.datePisicaDomestica();

        System.out.println("---Obiectul Luxi---");
        Pisica Luxi=new Pisica (5.6, "bland", "Luxi");
        Luxi.datePisicaSalbatica();
    }
}
