package Exception;

import java.io.*;
import java.sql.SQLException;

/**
 * Created by IT_School on 07.12.2015.
 */
public class Exception {
    public static void main (String[]args){
        /*int a;
        try {                    //пример работы блоков исключений
            a = 10/0;
        }catch(ArithmeticException ex){
            a =0;
            ex.printStackTrace();
        }
        System.out.println(a);*/

        BufferedReader br=null;            //работа с текстовым файлом. br-кземляр класса
        boolean isExceptionThrowed = false;
        try{
            br = new BufferedReader(new FileReader("D:\\ooo.txt")) ;
            String s;
            while ((s = br.readLine())!= null){
                System.out.println(s);
            }
        }catch (IOException ex){
            isExceptionThrowed = true;
        }finally {
            try {
                if (br != null){
                    br.close();
                }
            }catch (IOException ex){
                System.out.println(ex);
            }if (isExceptionThrowed){
                System.out.println("Exception throwed");
            }
            System.out.println("finally called");
        }
    }
}



