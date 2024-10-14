import java.util.Scanner;
public class ej2 {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in); //escaner
        System.out.println("ingres valor numerico 'x' para el array");// el vec tiene que ser de tam 2
        int x = num.nextInt(); // le el tamanio
        System.out.println("ingres valor numerico 'y' para el array");
        int y = num.nextInt();
        int[][] vector1 = new int[x][y];
        int[][] vector2 = new int[y][x];
        int[][] vector3 = new int[x][y];
        int[] nu = new int[x];
        // Cargar primer vector
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("Ingrese el valor del array 1 para la posición [" + i + "," + j + "]: ");
                vector1[i][j] = num.nextInt();
            }
        }
        //Cargar el seguno vector
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("Ingrese el valor del array 2 para la posición [" + i + "," + j + "]: ");
                vector2[i][j] = num.nextInt();
            }
        }
        // mltiplica cada fila del v1 por cada columna del v2
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                vector3[i][j] = vector1[i][j] * vector2[i][j];
                System.out.print("\nla multiplicacion es de [" + i + "," + j + "]: " + vector3[i][j] + "\n");
            }
        }
    }
}
