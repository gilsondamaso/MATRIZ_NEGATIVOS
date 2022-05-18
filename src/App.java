import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("INFORME O TAMANHO DA MATRIZ: ");
        int n = sc.nextInt();

        int[][] numeros = new int[n][n];

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                numeros[i][j] = sc.nextInt();
            }
        }

        System.out.println("DIAGONAL PRINCIPAL: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i][i] + " ");            
        }

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[i][j] < 0 ) {
                  count++;  
                }
            }
        }
        System.out.println("QTD NEGATIVOS: " + count);
        sc.close();

    }
}
