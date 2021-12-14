package Mostenire_incapsulare;

public class Papanasi_gem extends Papanasi{
    public String portocala;
    public String gem;

    public Papanasi_gem(String branza, Integer zahar, Integer faina, Integer oua, String sare, String bicarbonat, String portocala, String gem) {
        super(branza, zahar, faina, oua, sare, bicarbonat);
        this.portocala = portocala;
        this.gem = gem;
    }


    public void retetaPapanasi(){
        System.out.println("Reteta de papanasi contine urmatoarele ingrediente: ");
        System.out.println(toString());
    }

    @Override
    public String toString() { //pentru afisare e toString
        return "Papanasi_gem{" +
                "branza='" + branza + '\'' +
                ", zahar=" + zahar +
                ", faina=" + faina +
                ", oua=" + oua +
                ", sare='" + sare + '\'' +
                ", bicarbonat='" + bicarbonat + '\'' +
                ", portocala='" + portocala + '\'' +
                ", gem='" + gem + '\'' +
                '}';
    }
}

