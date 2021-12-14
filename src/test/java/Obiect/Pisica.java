package Obiect;

import java.util.List;

public class Pisica {

    public String nume;
    public Integer varsta;
    public String culoare;
    public Boolean estePufoasa;
    public List<String> rasePisici;
    public Double greutate;
    public String ochi;
    public String jucarie;
    public Boolean esteDomestica;
    public String comportament;



public Pisica (String nume,String culoare, Integer varsta,  Boolean estePufoasa, List<String>rasePisici) {
      this.nume=nume;
      this.culoare=culoare;
      this.varsta=varsta;
      this.estePufoasa=estePufoasa;
      this.rasePisici=rasePisici;

}

public Pisica (String ochi, String jucarie, Boolean esteDomestica ) {
      this.ochi=ochi;
      this.jucarie=jucarie;
      this.esteDomestica=esteDomestica;

}

public Pisica (Double greutate, String comportament, String nume) {
    this.greutate=greutate;
    this.comportament=comportament;
    this.nume=nume;
}

public void datePisica (){
    System.out.println("Numele pisicii este "+ nume);
    System.out.println("Culoarea pisicii este " + culoare);
    System.out.println("Varsta pisicii este "+ varsta);
    System.out.println("Este pisica pufoasa?" + estePufoasa);
    System.out.println("Rasele mele preferate de pisici sunt ");
    for (String rasaPisici:rasePisici) {
        System.out.println(rasaPisici);
    }
}

public void datePisicaDomestica (){
    System.out.println("Ochii pisicii sunt "+ ochi);
    System.out.println("Jucaria preferata a pisicii este "+ jucarie);
    System.out.println("Pisica este domestica? "+ esteDomestica);
}

public void datePisicaSalbatica() {
    System.out.println("Greutatea pisicii este de "+ greutate);
    System.out.println("Comportamentul pisicii este "+ comportament);
    System.out.println("Numele pisicii este "+ nume);
}

}