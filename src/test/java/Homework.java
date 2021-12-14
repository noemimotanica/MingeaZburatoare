import org.junit.Test;

public class Homework {
    public String helloWorld;
    public int varsta;
    public String nume;
    public String prenume;
    public String data;

    public double calcule;

    public double suma;
    String a = "Salut" + "M";
    String b = "H" + "Hello";
    public int inmultire;

    @Test
    public void variabile() {

        helloWorld = "Mesaj de intampinare";
        varsta = 24;
        nume = "Pop";
        prenume = "Noemi";
        data = "1/13/2019, 18:30 pm, Marti";
        System.out.println(helloWorld);
        System.out.println(nume);
        System.out.println(prenume);
        System.out.println(data);
        System.out.println(varsta);

        calcule = (2.0 + (3.0 * 4.0) - 3.0) / 3.0;
        System.out.println(calcule);

        suma = 2.3 + 4.7 + 5.8;
        System.out.println("Rezultatul calculului este " + suma + " Poti pleca acasa dupa ce iti verific munca!");

        inmultire = 5 * 8;
        System.out.println("Produsul numerelor alese este " + inmultire + " Poti pleca acasa dupa ce iti verific munca!");
        System.out.println("Stiu ca am calculat bine " + suma + " Poti pleca acasa dupa ce iti verific munca!");
        System.out.println("Stiu ca am calculat bine " + inmultire + " Poti pleca acasa dupa ce iti verific munca!");
        System.out.println("Salutm");
        System.out.println("HHello");
        System.out.println("Anaz arez merez,perez,prunez");
    }

}



