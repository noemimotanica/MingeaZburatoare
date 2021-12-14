package Protected;

public class Teatru {

    public void habarNam() {
        Voluntar voluntar = new Voluntar("nume", "prenume");
        voluntar.metodaPublica();
        voluntar.metodaProtected();
        voluntar.metodaDefault();

    }
}
