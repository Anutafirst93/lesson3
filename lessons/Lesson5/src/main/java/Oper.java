/**
 * Created by IT_School on 09.11.2015.
 */
public class Oper {
    public static void main(String [] args){
    int a = 10;
    int b = 7;
     if (a>b){
         a = a*b;
         b = (a/(a+b));
         System.out.println("СУММА= "+a+b);
      }
     else if (a<b){
         a = ((a * b) / 2);
         b = (b + (a * b++));
         System.out.println("РАЗНИЦА= " + (a - b));
     }
     else if (a==b) {
        System.out.println("UMN= " + (a*b));
    }
    }
}


