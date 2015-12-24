package Streams;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by IT_School on 11.12.2015.
 */
public class App {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file name: ");
        String a;
        a = sc.next();
        File f = new File(a);
        if (!f.exists()) {
            try {
                f.createNewFile();
                System.out.println("File " + f +  "created ");
            } catch (Exception ex) {
                System.out.println("cannot create File");
                ex.printStackTrace();
            }
        }else{
            System.out.println("File +:");
        }
        Random r = new Random();
        byte [] arr = new byte [1024];
        for (int i=0; i<arr.length; i++ ){
            arr[i]= (byte)r.nextInt(127);
        }
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        OutputStream os = new FileOutputStream(f);
        baos.write(arr, 0, arr.length);
        baos.writeTo(os);

        BufferedReader fis = new BufferedReader (new FileReader(f));
        System.out.println(fis.readLine());



    }
}
