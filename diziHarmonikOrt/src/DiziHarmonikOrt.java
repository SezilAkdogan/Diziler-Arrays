import java.util.Scanner;
public class DiziHarmonikOrt {
    public static void main(String[] args) {

        int [] arr = {1, 2, 3, 4, 5};
        double harAvar;
        double harSeri = 0;
        for (int i : arr){
            harSeri += 1.0 / i;
        }
        harAvar = arr.length / harSeri;
        System.out.println(" Dizinin Harmonik Ortalaması = " + harAvar);

    }
}
