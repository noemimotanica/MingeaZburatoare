package Polimorfism;

public class Student {

    //polimorfism=e de 2 feluri:dinamic si static

    //Dinamic/overriding
    //Static/overloading
    //dinamic=intr-o ierarhie de clase obtinute prin mostenire o metoda poate avea implementari diferite.
    //static=conceptul prin care putem avea mai multe metode cu acelasi nume si diferentierea se face prin nr de parametri sau tipul parametrilor
    //polimorfismul nu se poate aplica la return, trebuie sa difere nr de parametri ca sa mearga
    private String nume;
    private String prenume;
    private String adresa;

    public Student(String nume, String prenume, String adresa) {
        this.nume = nume;
        this.prenume = prenume;
        this.adresa = adresa;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String student) {
        this.nume = student;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    //polimorfism dinamic
    public void afiseazaInfoStudent() {
        System.out.println("Detaliile despre student sunt: " + getAdresa()+getNume()+  " " +getPrenume());
    }
}
