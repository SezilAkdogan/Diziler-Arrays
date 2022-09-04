import java.util.Scanner;
import java.util.Arrays;
public class DizideEnYakinMinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("bir sayı giriniz: ");
        int n = input.nextInt();

        int[] list = {15, 12, 788, 1, -1, -788, 2, 0, n};
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        int index = Arrays.binarySearch(list, n);
        System.out.println(" n'in indeksi : " + index);



        System.out.println(" Girilen sayıdan en yakın en küçük sayı : " + list[index-1]);
        System.out.println(" Girilen sayıdan en yakın en büyük sayı : " + list[index+1]);
    }
}