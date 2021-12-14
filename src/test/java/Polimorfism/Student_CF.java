package Polimorfism;

public class Student_CF extends Student {
    public Student_CF(String prenume, String adresa, String nume) {
        super(nume, prenume, adresa);  //apeleaza constructorul din parinte


    }

    //polimorfism static
    public void mediaStudentului(Integer notaUnu, Integer notaDoi) {
        Integer medie = (notaUnu + notaDoi) / 2;
        System.out.println("Media Sudentului CF este: " + medie);
    }

    public void mediaStudentului(Integer notaUnu, Integer notaDoi, Integer notaTrei) {
        Integer medie = (notaUnu + notaDoi + notaTrei) / 3;
        System.out.println("Media Sudentului CF este: " + medie);
    }
    @Override
    //ACEEASI METODA CU ACELASI NUME DAR SUPRASCRISA, face referire doar ce e scris in interior
    public void afiseazaInfoStudent() {
        System.out.println("Detaliile despre student CF sunt: " + getAdresa()+getNume()+  " " +getPrenume());

    }
    public void afiseazaInfoInitial() {
        super.afiseazaInfoStudent(); //cheama din copil se duce la parinte

    }
}
