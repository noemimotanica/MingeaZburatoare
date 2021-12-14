import org.junit.Test;

public class HomeworkTwo {
    public int suma;

    @Test
    public void numere() {
        citimNumere(1, 3, 4);
        afisamNumereFor();
        afisamNumereWhile();
    }

    public void citimNumere(int a, int b, int c) {
        suma = a + b;
        if (suma > c) {
            System.out.println(suma + " Suma primelor doua numere este mai mare decat al treilea numar");
        } else {
            System.out.println(suma + " Suma primelor doua numere este mai mica decat al treilea numar");
        }

        int j = 1;
        while (j <= 5) {
            System.out.print("Da ");
            j++;
        }

//        for (int i = 1; i<= 5; i++) {
//            System.out.print("Da ");
//        }
        System.out.println();
        // System.out.println("Da " + "Da " + "Da " + "Da " + "Da ");

    }

    public void afisamNumereFor() {
        for (int index = 3; index <= 15; index = index + 3)
            System.out.println(index);


        for (int index = 1; index <= 5; index++) {
            System.out.println(index * 3);
        }

        for (int index = 5; index <= 15; index = index + 5)
            System.out.println(index);

        for (int index = 2; index <= 8; index = index + 2)
            System.out.println(index);

        int sum = 0;
        for (int index = 0; index <= 10; index = index + 1) {
            sum = sum + index;
        }
        System.out.println("Suma este " + sum);

        int multiplication = 1;
        for (int index = 1; index <= 5; index = index + 1) {
            multiplication = multiplication * index;

        }
        System.out.println("Raspunsul corect este " + multiplication);

    }

    public void afisamNumereWhile() {
        int index=0;
        while (index<15) {
            index=index+3;
            System.out.println(index);
        }
          index=0;
        while (index<15) {
            index=index+5;
            System.out.println(index);
        }

        index=0;
        while(index<8) {
            index=index+2;
            System.out.println(index);
        }

         int sum=0;
         index=0;
        while(index<=10) {
            index=index+1;
            sum=index+sum;
        }
        System.out.println("Raspunsul corect este "+ sum);

        int produs=1;
        index=1;
        while(index<=5) {
            produs=index*produs;
            index=index+1;
        }
        System.out.println("Raspunsul corect este "+ produs);
    }
}
