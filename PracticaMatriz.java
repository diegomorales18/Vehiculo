public class PracticaMatriz {
    public static void main(String[] args) {
        // Crear una matriz de 5x5
        int[][] matriz = new int[5][5];

        // Llenar la matriz con valores
        int contador = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = contador++;
            }
        }

        // Imprimir la matriz
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
