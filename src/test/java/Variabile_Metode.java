import org.junit.Test;

public class Variabile_Metode {

    //Clasa, Variabila, Metoda, Constructor, Obiect
    // 1.Clasa este un sablon ce contine variabile, metode, constructor, obiect.
    // 2.Variabila=atributul unei clase
    // 3.Metoda=actiunile unei clase
    // 1. Structura clasa=access control class nume clasa {}
    // 1. Un fisier java poate sa contina mai multe clase.
    // 1. Numele clasei trebuie sa fie unic.
    // 2.Tipuri variabile= global si local
    // 2.Variabila globala=este vizibila peste tot in clasa declarata
    // 2.Structura variabila globala=access control tipul variabila nume variabila;
    // 2.O variabila poate sau nu sa primeasca o valoare.
    // 2.Structura variabia locala=tip variabila nume variabila
    //Exemplu: declaram variabile in interiorul clasei
    // 3.Tipuri metode=void,return
    // 3.In java exista doar metode(declarata in interiorul unei clase), nu si functii
    // 3.Metodele pot avea sau nu parametrii
    // 3.Srructura metoda void=access control void nume metoda(){}
    public String nume;
    public String prenume;
    public Integer varsta;
    public Double inaltime;
    public String adresa;
    public Boolean esteAngajat;
    public Double greutate;
    @Test
    public void atribuivalori () {
        nume="Boros";
        prenume="Noemi";
        varsta=26;
        inaltime=1.63;
        adresa="Aurel Vlaicu nr 45";
        esteAngajat=true;
        greutate=52.00;
        System.out.print(nume+" ");
        System.out.print(prenume);
        System.out.print(" "+esteAngajat+" ");

        System.out.println(varsta+" "+inaltime+" "+adresa);

        System.out.println(nume);
        System.out.print(nume+ "\n");
        System.out.println(nume+"\n"+prenume);


        //afiseaza pe tastatura mesajul:Cursantul<nume> <prenume>a trimis proiectul proiectul la manual.
        System.out.println( "Cursantul "+ nume + " "+ prenume +  " a trimis proiectul la manual.");
        //Definim cate zecimale sa ne afiseze pentru o valoare cu punct.
        System.out.println(String.format(" %.8f", greutate));

        System.out.println(getSalarAngajat());

    }

    //returnam salarul unui angajat;
    //structura metoda return: public  tipul de returnare nume() {return}

    public Double getSalarAngajat() {
        Double salar= 1000.0;
        Double bonus=2000.3;
        Double calcul=salar * bonus;
        return calcul;
    }
}
