import java.util.Scanner;
public class ej1 {
    public static void main (String[] arg){
        Scanner ho = new Scanner(System.in);
        String[][] vector = new String[4][4];
        for (int i = 0; i < 4; i++) {
            System.out.println("ingrese el nombre de los paises");
            vector[i][0] = ho.nextLine();
            for (int j = 0; j < 3; j++) {
                System.out.println("ingrese el nombre de las ciudades");
                vector[i][j+1] = ho.nextLine();
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + vector[i][j] + "]");
            }
            System.out.println();
        }
    }
}
