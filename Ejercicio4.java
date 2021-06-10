import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int EdadMayor = 0;
        int EdadMenor = 120;
        Scanner sr = new Scanner(System.in);
        System.out.println("Ingrese 20 edades");
        for (int i = 0; i < 20; i++) {
            int Edad = sr.nextInt();
            if (Edad < EdadMenor) {
                EdadMenor = Edad;
            }
            if (Edad > EdadMayor) {
                EdadMayor = Edad;

            }

        }
        System.out.println("La edad mayor es " + EdadMayor + " a;os  y la edad mas peque;a es " + EdadMenor + " A;os");

    }

}
