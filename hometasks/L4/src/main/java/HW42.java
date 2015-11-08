/**
 * Created by Нюта on 05.11.2015.
 */
public class HW42 {
    public static void main (String[] args){
        int a=3;
        int b=5;
        System.out.println("a="+a);
        System.out.println("b="+b);
        //ПЕРЕСТАНОВСКА ЧИСЕЛ:
        b = (b+a);
        a = b-a;
        b = b-a;
        System.out.println("ПЕРЕСТАНОВСКА ЧИСЕЛ:");
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
