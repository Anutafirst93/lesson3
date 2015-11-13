/**
 * Created by Нюта on 13.11.2015.
 */
import java.util.Scanner;
public class Advan {
    public static void main(String args[]) {
        int part[][] = new int[4][];
        part[0] = new int[1];
        part[1] = new int[2];
        part[2] = new int[3];
        part[3] = new int[4];
        int i, j, k = 0;
        for (i = 0; i < 4; i++)
            for (j = 0; j < i + 1; j++){
                part[i][j] = k;
                k++;
        }
        for (i = 0; i <4; i++) {
            for (j = 0; j < i + 1; j++)
                System.out.print(part[i][j] + " ");
            System.out.println();
        }
        Scanner in = new Scanner(System.in);
        System.out.print("Имя: ");
        String name = in.nextLine();
        System.out.print("Урок №: ");
        int number = in.nextInt();
        System.out.println("Имя: " + name + "   Урок №: " + number);
    }
}
