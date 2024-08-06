public class Burbuja {
    public static void main(String[] args) {
        int[] arreglo = {21, 40, 4, 9, 10, 35};

        // Impresion de arreglo original
        System.out.println("Arreglo original:");
        imprimirArreglo(arreglo);

        // Ordenamos el arreglo usando el algoritmo de burbuja
        ordenarBurbuja(arreglo);

        // Impresion de arreglo ordenado
        System.out.println("\nArreglo ordenado:");
        imprimirArreglo(arreglo);
    }

    // Función para ordenar un arreglo usando el algoritmo de burbuja
    public static void ordenarBurbuja(int[] arreglo) {
        int n = arreglo.length;
        boolean intercambiado;

        for (int i = 0; i < n - 1; i++) {
            intercambiado = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambiamos los elementos
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                    intercambiado = true;

                    // Impresion de arreglo en cada intercambio para ver el progreso
                    System.out.println("Paso: " + (i * n + j + 1));
                    imprimirArreglo(arreglo);
                }
            }

            // Si no hubo intercambios en una pasada, el arreglo ya está ordenado
            if (!intercambiado) {
                break;
            }
        }
    }

    // Imprimir un arreglo
    public static void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
}
