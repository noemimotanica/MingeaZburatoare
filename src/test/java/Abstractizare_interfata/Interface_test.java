package Abstractizare_interfata;

import Clasa_Abstracta.Persoana_Angajat_Abstract;
import Clasa_Abstracta.Persoana_Student_Abstract;
import Clasa_Abstracta.Persoana_Student_Angajat_Abstract;
import org.junit.Test;

public class Interface_test {
    @Test
    public void testAutomat() {
        Persoana_Student_Interface student=new Persoana_Student_Interface("Sabau", "Cristi",5);
        student.invata();
        student.mergeLaCurs();
        Persoana_Angajat_Interface angajat=new Persoana_Angajat_Interface("Pop", "Radu", 78);
        angajat.munceste();
        angajat.primesteSalar();
        Persona_Student_Angajat_Interface studentAngajat=new Persona_Student_Angajat_Interface("Priscina", "Mihai", 15);
        studentAngajat.invata();
        studentAngajat.munceste();
        studentAngajat.mergeLaCurs();
        studentAngajat.primesteSalar();
    }


    @Test
    public void testAutomatAbstractClasses() {
        Persoana_Student_Abstract student=new Persoana_Student_Abstract("Sabau", "Cristi",5);
        student.invata();
        student.mergeLaCurs();
        Persoana_Angajat_Abstract angajat=new Persoana_Angajat_Abstract();
        angajat.munceste();
        angajat.primesteSalar();
        Persoana_Student_Angajat_Abstract studentAngajat=new Persoana_Student_Angajat_Abstract();
        studentAngajat.invata();
        studentAngajat.munceste();
        studentAngajat.mergeLaCurs();
        studentAngajat.primesteSalar();
    }
}
