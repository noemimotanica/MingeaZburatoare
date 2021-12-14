package Polimorfism;

public class Student_FF extends Student {

    public Student_FF(String nume, String prenume, String adresa) {
        super(nume, prenume, adresa);  //apeleaza constructorul din parinte


    }

//polimorfism static
    public void mediaStudentului(Integer notaUnu, Integer notaDoi) {
        Integer medie = (notaUnu + notaDoi) / 2;
        System.out.println("Media Sudentului FF este: " + medie);
    }

    public void mediaStudentului(Integer notaUnu, Integer notaDoi, Integer notaTrei) {
        Integer medie = (notaUnu + notaDoi + notaTrei) / 3;
        System.out.println("Media Sudentului FF este: " + medie);
    }
    @Override
    //ACEEASI METODA CU ACELASI NUME DAR SUPRASCRISA, face referire doar ce e scris in interior
    public void afiseazaInfoStudent() {
        System.out.println("Detaliile despre student FF sunt: " + getAdresa()+getNume()+  " " +getPrenume());

    }
    public void afiseazaInfoInitial() {
        super.afiseazaInfoStudent(); //cheama din copil se duce la parinte

    }
}