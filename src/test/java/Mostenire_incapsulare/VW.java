package Mostenire_incapsulare;

import java.util.List;

public class VW extends Masina {
    private String origine;
    private List<String> dotari;
    private Double pret;
    private String model;

    public VW(String caroserie, Integer roti, Integer usi, String sasiu, Double motorizare, String transmisie, String combustibil, String origine, Double pret, List<String> dotari, String model) {
        super(caroserie, roti, usi, sasiu, motorizare, transmisie, combustibil);

        this.origine=origine;
        this.dotari=dotari;
        this.pret=pret;
        this.model=model;

    }

    public String getOrigine() {
        return origine;
    }

    public void setOrigine(String origine) {
        this.origine = origine;
    }

    public List<String> getDotari() {
        return dotari;
    }

    public void setDotari(List<String> dotari) {
        this.dotari = dotari;
    }

    public Double getPret() {
        return pret;
    }

    public void setPret(Double pret) {
        this.pret = pret;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void configuratieMasina() {
        System.out.println("Masina VW cu modelul :" + getModel() + " are urmatoarea configuratie: ");
        System.out.println(toString());
    }
public void afiseazaOrigine() {
    System.out.println("Originea modelului " + getModel()+ " este " + getOrigine());
}

    @Override
    public String toString() {
        return "VW{" +
                "caroserie='" + getCaroserie() + '\'' +
                ", roti=" + getRoti() +
                ", usi=" + getUsi()+
                ", sasiu='" + getSasiu() + '\'' +
                ", motorizare=" + getMotorizare()+
                ", transmisie='" + getTransmisie() + '\'' +
                ", combustibil='" + getCombustibil() + '\'' +
                ", origine='" + getOrigine() + '\'' +
                ", dotari=" + getDotari() +
                ", pret=" + getPret() +
                ", model='" + getOrigine() + '\'' +
                '}';
    }

}
