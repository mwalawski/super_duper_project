package pl.edu.agh.mwo;

import java.util.Scanner;


public class App
{
    public static void main( String[] args )
    {
        String N, Z;
        Scanner scan = new Scanner(System.in);

        System.out.println("Wpisz: N - nowa gra, Z - zakończ");
        String start = scan.nextLine();
        switch(start) {
            case ("N"):
                System.out.println("START");   //start();funkcja uruchamiająca
                break;
            case ("Z"):
                System.out.println("Do widzenia!");
                break;
        }
    }


}
