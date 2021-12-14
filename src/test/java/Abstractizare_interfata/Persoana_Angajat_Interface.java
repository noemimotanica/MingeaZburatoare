package Abstractizare_interfata;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Persoana_Angajat_Interface extends Persoana_interface implements I_Angajat {

    public Persoana_Angajat_Interface(String nume, String prenume, Integer varsta) {
        super(nume, prenume, varsta);
    }

    @Override
    public void munceste() {
        System.out.println("Angajatul "+ nume + " " + prenume + "munceste");

    }

    @Override
    public void primesteSalar() {
        System.out.println("Angajatul "+ nume+ " " + prenume + "primeste salar");

    }
}
