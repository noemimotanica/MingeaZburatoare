import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Multimi {

    @Test
    public void testAutomat() {
        System.out.println("1.ArrayNumere");
//        printeazaArrayNumere();
//        printeazaArrayValori();
//        printeazaListaValori();
//        printeazaHashMapValori();
//        printeazaListaOrase();
        printeazaListaColinde();
        printeazaListaCantece();
        printeazaListaFructe();
        printeazaListaLegume();
        ArrayAnimaleDomestice();
        printeazaArrayAnimaleSalbatice();
    }

    public void printeazaArrayNumere() {
        Integer[] ArrayNumere = new Integer[4];
        ArrayNumere[0] = 4;
        ArrayNumere[1] = 5;
        ArrayNumere[2] = 6;
        ArrayNumere[3] = 7;
        for (Integer index = 0; index < ArrayNumere.length; index++) {
            System.out.println("Numarul corect este " + ArrayNumere[index]);
        }
        System.out.println("Ultimul element din Array este " + ArrayNumere[ArrayNumere.length - 1]);
    }

    public void printeazaArrayValori() {
        String[] ArrayValori = new String[4];
        ArrayValori[0] = "Noemi";
        ArrayValori[1] = "Mihai";
        ArrayValori[2] = "Gelu";
        for (Integer index = 0; index < ArrayValori.length - 1; index++) {
            System.out.println("Numele meu este " + ArrayValori[index]);
        }
    }

    public void ArrayAnimaleDomestice () {
        String[] ArrayAnimale=new String[7];
        ArrayAnimale[0]="Vaca";
        ArrayAnimale[1]="Gaina";
        ArrayAnimale[2]="Porc";
        ArrayAnimale[3]="Oaie";
        ArrayAnimale[4]="Capra";
        for(int index=0; index<ArrayAnimale.length; index++) {
            System.out.println("Animale domestice sunt urmatoarele: " + ArrayAnimale[index]);
        }

    }
    public void printeazaArrayAnimaleSalbatice() {
        String[] ArrayAnimaleSalbatice=new String[4];
        ArrayAnimaleSalbatice[0]="Ras";
        ArrayAnimaleSalbatice[1]="Leopard";
        ArrayAnimaleSalbatice[2]="Pantera";
        ArrayAnimaleSalbatice[3]="Leu";
        for(int index=0; index<ArrayAnimaleSalbatice.length; index++) {
            System.out.println("Animale salbatice sunt urmatoarele: " +ArrayAnimaleSalbatice[index]);
        }
    }



    public void printeazaListaValori() {
        List<String> ListaValori = new ArrayList<>();
        ListaValori.add("Madalina");
        ListaValori.add("Paul");
        ListaValori.add("Mihai");
        for (int index = 0; index < ListaValori.size(); index++) {
            System.out.println("Numele curect este " + ListaValori.get(index));
        }
    }

    public void printeazaListaCantece() {
        List<String> ListaCantece=new ArrayList<>();;
        ListaCantece.add("Vama Veche");
        ListaCantece.add("Buze blonde");
        ListaCantece.add("18 ani");
        for(int index=0; index<ListaCantece.size(); index++) {
            System.out.println("Melodiile mele preferate de la Vama Veche sunt " + ListaCantece.get(index));

        }
    }

    public void printeazaListaFructe(){
        List<String> ListaFructe=new ArrayList<>();
        ListaFructe.add("Mere");
        ListaFructe.add("Pere");
        ListaFructe.add("Mandarine");
        for(int index=0; index<ListaFructe.size(); index++) {
            System.out.println("Pentru placinta ne mai trebuie " + ListaFructe.get(index));

        }
    }

    public void printeazaListaLegume(){
        List<String> ListaLegume=new ArrayList<>();
        ListaLegume.add("Cartofi");
        ListaLegume.add("Morcovi");
        ListaLegume.add("Rosii");
        for(int index=0; index< ListaLegume.size(); index++) {
            System.out.println("Supa contine urmatoarele ingrediente " + ListaLegume.get(index));
        }
    }

    public void printeazaHashMapValori() {
        //HashMap functioneaza dupa logica de key=value
        HashMap<String, String> MapValori = new HashMap<>();

        MapValori.put("nume", "Boros");
        MapValori.put("prenume1", "Madalina");
        MapValori.put("prenume2", "Georgeta");
        for (String key : MapValori.keySet()) {
            System.out.println("Cheia este " + key);
            System.out.println("Valoarea este " + MapValori.get(key));
           // Get-returneaza valoarea de la cheia key
        }

    }

    public void printeazaListaOrase() {
        List<String> ListaOraseRomania = new ArrayList<>();
        ListaOraseRomania.add("Constanta");
        ListaOraseRomania.add("Tulcea");
        ListaOraseRomania.add("Cluj-Napoca");
        ListaOraseRomania.add("Timisoara");

        List<String> ListaOraseSpania = new ArrayList<>();
        ListaOraseSpania.add("Barcelona");
        ListaOraseSpania.add("Madrid");
        ListaOraseSpania.add("Valencia");

        List<String> ListaOraseItalia = new ArrayList<>();
        ListaOraseItalia.add("Roma");
        ListaOraseItalia.add("Sicilia");

        HashMap<String, List<String>> MapTari = new HashMap<>();
        MapTari.put("Romania", ListaOraseRomania);
        MapTari.put("Spania", ListaOraseSpania);
        MapTari.put("Italia", ListaOraseItalia);

        for (String key : MapTari.keySet()) {
            System.out.println("Orasele care apartin de tara " + key + " sunt urmatoarele:");
            List<String> Orase = MapTari.get(key);
            //for ( Integer index = 0; index < Orase.size(); index++) {
            //System.out.println(Orase.get(index));
            for( String oras: Orase) {
                System.out.println(oras);
            }
            }

        }

        public void printeazaListaColinde() {
        List<String> ListaColindeStefanHrusca=new ArrayList<>();
        ListaColindeStefanHrusca.add("Trei pastori se intalnira");
        ListaColindeStefanHrusca.add("Sculati gazde, nu dormiti");
        ListaColindeStefanHrusca.add("O, ce veste minunata!");

        List<String> ListaColindeVladutaLupau=new ArrayList<>();
        ListaColindeVladutaLupau.add("Marut, margaritar");
        ListaColindeVladutaLupau.add("Vine seara de Craciun");
        ListaColindeVladutaLupau.add("Pe la casele din sat");

        List<String> ListaColindeOanaBozga=new ArrayList<>();
        ListaColindeOanaBozga.add("Asterne Doamne pe pamant");
        ListaColindeOanaBozga.add("Buna seara lui Craciun");
        ListaColindeOanaBozga.add("Afara ninge linistit");

        HashMap<String, List <String>> MapColinde=new HashMap<>();
        MapColinde.put("Stefan Hrusca", ListaColindeStefanHrusca);
        MapColinde.put("Vladuta Lupau", ListaColindeVladutaLupau);
        MapColinde.put("Oana Bozga", ListaColindeOanaBozga);

        for(String key: MapColinde.keySet()) { // returneaza setul cheilor din Map
            System.out.println("Colindele lui "+ key + " sunt urmatoarele: ");
            List<String> Colinde=MapColinde.get(key); //iau cate o valoare pe rand pentru fiecare cheie din Map

            for(String colind: Colinde)
            System.out.println(colind);
        }


        }

    }


