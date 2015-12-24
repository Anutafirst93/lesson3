package Scanner;
import java.util.Scanner;
import java.io.InputStream;

/**
 * Created by IT_School on 11.12.2015.
 */
public class Scan {
    public static void main (String []args){
        int a;
        int b;
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число а = ");
        a=sc.nextInt();
        System.out.println("Введите число b = ");
        b=sc.nextInt();
        c = a + b;
        System.out.println( "Сумма = " + c);
    }
}
