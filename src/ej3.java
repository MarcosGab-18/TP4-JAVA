import java.util.Scanner;
public class ej3 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el tamaña del arreglo");
        int r = scanner.nextInt();
        if (r > 3 && r < 10) {
            int[][] vector5 = new int[1][r];
            int[] suma = new int[4];
            int[][] vector4 = new int[r][r];
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < r; j++) {
                    System.out.print("Ingrese el valor para la posición [" + i + "," + j + "]: ");
                    vector4[i][j] = scanner.nextInt();
                }
            }
            for (int i = 0; i < r; i++) {
                System.out.println("[" + vector4[0][i] + "]: " + "[" + vector4[1][i] + "]: " + "[" + vector4[2][i] + "]: " + "[" + vector4[3][i] + "]: ");
            }
            for (int i = 0; i < r; i++) {
                suma[0] += vector4[0][i];
                suma[1] += vector4[1][i];
                suma[2] += vector4[2][i];
                suma[3] += vector4[3][i];
            }
            // Mostrar el array
            System.out.print("ARRAY UNIDIMENCIONAL: ");
            System.out.print("[" + suma[0] + "]");
            System.out.print("[" + suma[1] + "]");
            System.out.print("[" + suma[2] + "]");
            System.out.print("[" + suma[3] + "]");
            //Mostrar la suma
            int suma_total = suma[0] + suma[1] + suma[2] + suma[3];
            System.out.println("SUMA TOTAL: " + suma_total );
        } else {
            System.out.print("numero fuera de rango");
        }
    }
}
