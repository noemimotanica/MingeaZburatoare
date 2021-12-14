package Obiect;

import java.util.List;

public class Cursant {

    //obiect=reprezinta intanta unei clase
    //dintr-o clasa putem declara  obiecte
    //ca sa initializam un obiect folosim cuvantul new
    //structura obiect=nume clasa + nume obiect= new+ nume clasa (se va apela constructorul clase) +(se vor da valori pentru variabile daca exista)
    //ex:Cursant Madalina= new Cursant ()
    //Constructor =are ca rol sa initialize atributele unei clase
    //intr-o clasa putem defini n constructori diferentiati prin parametrii sau numar de parametrii
    //costructorii dintr-o clasa trebuie sa fie publici
    //structura constructor=public nume clasa(definim parametrii daca avem nevoie){}
    // in cazul in care nu declaram un constructor => este by default (cobstructor implicit)
    //this=pointeaza catre variabila din interiorul clasei (se aplica doar daca avem doua variabile cu acelasi nume

    public String nume;
    public String prenume;
    public Integer varsta;
    public  Boolean esteAngajat;
    public Double taxa;
    public List<String> cursuri;
    public String curs;

//    public Cursant (String nume, String prenume, Integer varsta, Boolean esteAngajat, Double taxa, List<String>cursuri) {
//        this.nume=nume;
//        this.prenume=prenume;
//        this.varsta=varsta;
//        this.esteAngajat=esteAngajat;
//        this.taxa=taxa;
//        this.cursuri=cursuri;
//
//    }

    public Cursant (String nume, String prenume, Integer varsta, Boolean esteAngajat, Double taxa, String curs) {
        this.nume=nume;
        this.prenume=prenume;
        this.varsta=varsta;
        this.esteAngajat=esteAngajat;
        this.taxa=taxa;
        this.curs=curs;

    }

    public Cursant (String nume, String prenume, Integer varsta, Boolean esteAngajat, String curs) {
        this.nume=nume;
        this.prenume=prenume;
        this.varsta=varsta;
        this.esteAngajat=esteAngajat;
        this.curs=curs;

    }
    public Cursant (String nume, String prenume, Integer varsta, Boolean esteAngajat, Double taxa, List<String>cursuri) {
        this.nume=nume;
        this.prenume=prenume;
        this.varsta=varsta;
        this.esteAngajat=esteAngajat;
        this.taxa=taxa;
        this.cursuri=cursuri;

    }
    public void dateCursantCursuri () {
        System.out.println("numele cursantului este " + nume);
        System.out.println("prenumele cursantului este "+ prenume);
        System.out.println("care este varsta cursanului? " + varsta);
        System.out.println("este cursantul angajat? "+ esteAngajat);
        System.out.println("taxa de platit este "+ taxa);
        System.out.println("cursurile la care doreste sa participe sunt: " );
        for(String curs:cursuri) {
            System.out.println(curs);
        }
    }

    public void dateCursantCurs () {
        System.out.println("numele cursantului este " + nume);
        System.out.println("prenumele cursantului este "+ prenume);
        System.out.println("care este varsta cursanului? " + varsta);
        System.out.println("este cursantul angajat? "+ esteAngajat);
        System.out.println("taxa de platit este "+ taxa);
        System.out.println("Cursul la care doreste sa participe este: " +curs);


        }


    public void verificaVarstaCursant() {
        if(varsta>=18) {
            System.out.println("Cursantul este major");

        }
        else  {
            System.out.println("Cursantul este minor");
        }
    }

}

