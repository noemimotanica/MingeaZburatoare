package Abstractizare_interfata;

public class Persoana_interface {

    //abstractiazare=conceptul prin care definim comportamentul unei clase
    //abstractiazarea se poate realiza cu interfete sau clase abstracte
    //se foloseste cuvantul cheie "interface"
    //o clasa implementeaza o interfata
    //o clasa poate implemente mai multe interfete
    //o interfata contine doar metode abstracte
    //nu avem constructor intr-o interfata => nu putem crea obiect
    //clasa care implementeza interfata implementeza toate metodele din interfata


   public String nume;
   public String prenume;
   public Integer varsta;

    public Persoana_interface(String nume, String prenume, Integer varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public void infoPersoana() {
        System.out.println("Numele este " + nume);
        System.out.println("Prenumele este "+ prenume);
        System.out.println("Varsta este "+ varsta);
    }

}
