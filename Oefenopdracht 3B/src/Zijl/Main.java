package Zijl;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Hoeveel hoeken heeft jouw hoek?: ");
        int aantalVeelhoeken = input.nextInt();
        System.out.println("Welke naam heeft jouw veelhoek");
        String naamVeelhoek = "";
        naamVeelhoek = input.next();

        Veelhoek veelhoek = new Veelhoek(naamVeelhoek,aantalVeelhoeken);

        for (int i = 0; i <aantalVeelhoeken ; i++) {
            System.out.println("Wat zijn de coordinaten van hoek " + i);
            System.out.println("X:");
            int x = input.nextInt();
            System.out.println("Y:");
            int y = input.nextInt();

            veelhoek.setPunt(i,x,y);


        }



        System.out.println(veelhoek.print());
        for (int i = 0; i <aantalVeelhoeken ; i++) {
            System.out.println(veelhoek.printCord(i));
        }

        veelhoek.verschuif(0,-2,-2);
        System.out.println(veelhoek.printCord(0));


//        Veelhoek test = new Veelhoek("A",3);
//        test.setPunt(0,2,3);
//        test.setPunt(1,3,5);
//        test.setPunt(2,3,6);
//
//        System.out.println(test.print() + test.printCord(0) + test.printCord(1)
//        + test.printCord(2));



    }
}
