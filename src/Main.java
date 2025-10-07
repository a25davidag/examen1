import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Llamadas a la funciones
        //Ejercicio1
        Scanner sc = new Scanner(System.in);
        int nota = sc.nextInt();
        letraNota(nota);


        //EJERCICIO2
        Scanner sc2 = new Scanner(System.in);
        int dividendo = sc2.nextInt();
        int divisor = sc2.nextInt();
        esMultiplo(dividendo, divisor);


        //Ejercicio 3
        Scanner sc3 = new Scanner(System.in);
        int multiplo = sc3.nextInt();
        int result = factorial(multiplo);

        //Ejercicio4
        Scanner sp = new Scanner(System.in);
        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sp.nextInt();
        }
        sumarPositivos(numeros);
        //Ejercicio5
        Scanner sc4 = new Scanner(System.in);
        double[] notas = new double[5];
        for (int i = 0; i < notas.length; i++) {
            notas[i] = sc4.nextDouble();
        }
        notaMaxima(notas);
    }

    /**
     * Función para que dada una letra devuelva la nota correspondiente en formato numérico
     *
     * @param nota
     * @return debe devolver en caso de 9-10: A, 7-9: B, 5-7: C, 3-5: D, 0-3: F
     */
    public static String letraNota(int nota) {
        if (nota >= 9 && nota <= 10) {
            return "A";
        } else if (nota < 9 && nota >= 7) {
            return "B";
        } else if (nota < 7 && nota >= 5) {
            return "C";
        } else if (nota < 5 && nota >= 3) {
            return "D";
        } else if (nota < 3 && nota >= 0) {
            return "F";
        } else {
            return "NO VALIDO";
        }
    }

    /**
     * Función para saber si un número es multiplo de otro
     *
     * @param dividendo
     * @param divisor
     * @return Debe devolver un true en caso de dividendo sea multiplo de divisor,
     * caso contrario devolver false
     */
    public static boolean esMultiplo(int dividendo, int divisor) {
        if ((dividendo % divisor) == 0) {
            return true;
        }
        return false;
    }

    /**
     * Función para devolver el factorial de un número: !n
     *
     * @param n (int)
     * @return Tiene que devolver la suma de todos los números que están entre n y 0.
     * Ejemplo: para n=4 --> tiene que hacer la operación 4*3*2*1 y devolver 24
     */
    public static int factorial(int n) {
        int result = 1;
        for (int i = n; i > 1; i--) {
            result = result * i;
        }
        return result;
    }


    /**
     * Función para que dado un array de números devuelva la suma de unicamente los positivos
     *
     * @param numeros (un array de int)
     * @return devuelve al suma únicamente de los números positivos. Si el array está vacío devuelve 0
     */
    public static int sumarPositivos(int[] numeros) {
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                suma = suma + numeros[i];
            }
        }
        return suma;
    }

    /**
     * Función para dado un array de notas que devuelva unicamente la más alta
     *
     * @param notas (array double)
     * @return debe de devolver la nota máxima dentro del array
     */
    public static double notaMaxima(double[] notas) {
        double max = notas[0];
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > max) {
                max = notas[i];
            }
        }
        return max;
    }
}
