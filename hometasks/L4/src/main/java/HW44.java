/**
 * Created by ���� on 05.11.2015.
 */
import javax.swing.*;
import java.util.*;
public class HW44 {
    public static void main(String[] args) {
        //byte
   byte maxA = 127;
   byte maxB = 127;
        System.out.println(" byte->short " + ( maxA + maxB ) ); // ������� �������������� � short
        //short
   short minA = - 32768;
   short minB = - 32768;
        System.out.println(" short->int " + ( minA + minB ) ); // ������� �������������� � int
        //char
   char c = 0xffff;
   char d = 0xffff;
        System.out.println(" char->int " + (c+d) );// ������� �������������� � int
        //int
   int maxI = 2147483647;
   int maxIn = 2147483647;
        long maxInt = (long) maxI+maxIn;
        System.out.println(" int->long " + (maxInt) );// ������� �������������� � long
        // long
    long L = 0xffffffffL;
    long Lon = 0xffffffffL;
        System.out.println (" long->float " + (float)(L+Lon));// ������� �������������� � float

        //float
    float fl = 3.4E+38f;
    float fl2 = 3.4E+38f;
        System.out.println (" float->double " + (fl+fl2));// ������� �������������� � double
        // or
        float dou = 1.7E+38f;
        float doub = 1.7E+38f;
        System.out.println (" float->double " + (dou+doub));// ������� �������������� � double
    }
}