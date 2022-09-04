import java.util.Scanner;
public class MatrisTranspozu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Satır sayısını giriniz: ");
        int row = input.nextInt();
        System.out.print("Sütun sayısını giriniz: ");
        int col = input.nextInt();

        int[][] matris = new int[row][col];
        int[][] matrisTranspose = new int[col][row];

        for (int i = 0; i < matris.length; i++){
            for (int j = 0; j < matris[i].length; j++){
                System.out.print("Satır : " + i + " \t Sütun: " + j + " elemanı giriniz: ");
                matris[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < matris.length; i++){
            for (int j = 0; j < matris[i].length; j++){
                matrisTranspose[j][i] = matris[i][j]; ;
            }
        }

        for (int i = 0; i < matrisTranspose.length; i++){
            for (int j = 0; j < matrisTranspose[i].length; j++){
                System.out.print(matrisTranspose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
