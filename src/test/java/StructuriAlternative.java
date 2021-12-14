import org.junit.Test;

public class StructuriAlternative {

    //Cele mai intalnite structuri in programare sunt cele alternative.
    //Structura alternativa= If(conditie) then
    //                                    else


    @Test
    public void TestAutomat () {
        verificamNumere();
        verificaNume();
        verificamNrParImpar(21);
        verificamNrParImpar(15);
        verificamNrParImpar(-10);
        afisamZiuaInCurs("Luni");
    }

    //Verificam daca 5>3
    public void verificamNumere () {


        if (5 < 3) {

            System.out.println("Primul numar este mai mare decat al doilea");
        } else {
            System.out.println("Primul numar nu este mai mare decat al doilea");

        }

    }

    //Verificam daca Alexandru contine Alex.
    public void verificaNume (){
        String nume="Alexandru";
        String continut="Dan";

        if(nume.contains(continut)) {
            System.out.println("Continutul se regaseste in nume");

        }
        else {
            System.out.println("Continutul nu se regaseste in nume");
        }
    }


    //Verificam daca un numar este par sau impar si pozitiv.
    public void verificamNrParImpar (Integer numar) {

        if(numar%2==0) {
            System.out.println("Numarul" +numar+ "este par");

        }
        if(numar%2==1) {
            System.out.println("Numarul "+numar+ "este impar");

        }
        if(numar>0){

            System.out.println("Numarul "+numar+" este pozitiv");

        }
        if (numar<0) {
            System.out.println("Numarul "+numar+ "este negativ");
        }
        else {
            System.out.println("Salut???");
        }
    }

    //Afisam pe tastatura ziua de astazi
    public void afisamZiuaInCurs(String ziua) {
        switch(ziua) {
            case"Duminica":
                System.out.println("Astazi e duminica");
                break;
            case "Luni":
                System.out.println("Astazi este luni");
                break;
            case "Marti":
                System.out.println("Astazi este marti");
                break;


        }
    }
}
