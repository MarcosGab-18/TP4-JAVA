import java.util.Scanner;
public class ej4 {
    public static void main(String [] args){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("ingrese el tamaño del arreglo"); // tam del arreglo
        int t = scanner1.nextInt();
        if (t >= 4 && t <= 10) {
            Scanner scanner2 = new Scanner(System.in);
            int[][] array = new int[t][t];
            for (int i = 0; i < t; i++) {// iteracion 1 para pedir filas
                for (int j = 0; j < t; j++) {  //iteracion para pedir valor de cada columa
                    System.out.print("la pocision [" + i + "],[" + j + "]");
                    array[i][j] = scanner2.nextInt();// lee
                }
            }
            for (int i = 0; i < t; i++) {//iteracion para mostrar el arrar
                for (int j = 0; j < t; j++) {
                    System.out.print("[" + array[i][j] + "]");
                }
                System.out.println();
            }
            int suma = 0;
            System.out.println("ingrese la fila que quiere sumar ");
            int fila_a_sumar = scanner1.nextInt();
            if (fila_a_sumar <= t) {
                for (int j = 0; j < t; j++) { //iteracion
                    System.out.print("[" + array[fila_a_sumar][j] + "]"); //muestra la fila que se va a sumar
                    suma += array[fila_a_sumar][j];

                }
                System.out.println();
                System.out.println("la suma de la pocision " + fila_a_sumar + " es de " + suma);
            } else {
                System.out.println("esta fuera de rango (no existe) ");
            }
            int suma1 = 0;
            System.out.println("ingrese la columna que quiere sumar");
            int columna_a_sumar = scanner1.nextInt();
            for (int i = 0; i < t; i++) {
                System.out.println("[" + array[i][columna_a_sumar] + "]");
                suma1 += array[i][columna_a_sumar];
            }
            System.out.println("la suma de la columna " + columna_a_sumar + " es de " + suma1);
            int suma2 = 0;
            for (int i = 0; i < t; i++) {
                suma2 += array[i][i];
            }
            System.out.println("la suma de la diagonal pricipal es de " + suma2);
            int suma3 = 0;
            int media = 0;
            int a = t * t;
            for (int i = 0; i < t; i++) {
                for (int j = 0; j < t; j++) {
                    suma3 += array[i][j];
                }
            }
            int suma4=0;
            for (int i = 0; i < t; i++) {
                int o = t - 1 - i;
                suma4 += array[i][o];
            }
            System.out.println("La suma de la diagonal inversa es:" + suma4);
            media = suma3 / a;
            System.out.println("La media de todos los valores de la matriz es de " + media);
        } else {
            System.out.println("numero fuera de rango");
        }
    }
}

