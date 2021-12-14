package Clasa_Abstracta;

public class Persoana_Student_Abstract extends Persoana_abstract {

    public String nume;
    public String prenume;
    public Integer varsta;

    public Persoana_Student_Abstract(String nume, String prenume, Integer varsta) {
        this.nume=nume;
        this.prenume=prenume;
        this.varsta=varsta;

    }

    @Override
    public void invata() {
        System.out.println("Studetul" + nume+ " " + prenume + "invata!");
    }

    @Override
    public void mergeLaCurs() {
        System.out.println("Studentul" + nume + " " + prenume + "mergeLaCurs!");

    }

    @Override
    public void munceste() {
        System.out.println("Angajatul" + nume+ " " + prenume + "munceste");

    }


    @Override
    public void primesteSalar() {
        System.out.println("Angajatul" + nume + " " + prenume + "primeste salar");

    }


}
