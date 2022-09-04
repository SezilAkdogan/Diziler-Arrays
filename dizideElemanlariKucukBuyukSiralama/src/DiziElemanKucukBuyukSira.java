import java.util.Arrays;
import java.util.Scanner;

public class DiziElemanKucukBuyukSira {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Dizinin boyutunu giriniz : ");
        int n = input.nextInt();
        System.out.println(" Dizinin elemanlarını giriniz :");
        int[] list =new int[n];
        for( int i = 0; i< n; i++){

            System.out.print( (i + 1) + ". Eleman : ");
            int sayi = input.nextInt();
            list[i] = sayi;

        }

        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}
