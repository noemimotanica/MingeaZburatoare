package Clasa_Abstracta;

public abstract class Persoana_abstract {
    //clasa abstracta poate sau nu sa contina metode abstracte
    //clasacare extinde o clasa absrtacta trebuie sa implementeze toate metodele abstracte
    //intr-o clasa abstracta poti declara un constructor insa nu poti face un obiect
    //putem mosteni o singura clasa
    //o clasa abstracta poate implementa o interfata insa o interfata nu poate extinde o clasa abstracta
    //o interfata poate extinde o alta interfata
    public abstract void invata();
    public abstract void mergeLaCurs();

    public abstract void munceste();
    public abstract void primesteSalar();

    public void detaliiVarsta(Integer varsta) {
        if(varsta>18) {
            System.out.println("Persoana este majora");
        }
    }
}
