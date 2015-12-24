package Scanner;

import java.io.File;

/**
 * Created by IT_School on 11.12.2015.
 */
public class Files {
    public static void main (String [] args){
        File f = new File("Lesson13");
        f.exists();
        if (f.exists()){
        } else {
            try {
                f.createNewFile();
            }catch (Exception ex){
                System.out.println("cannot create File");
                ex.printStackTrace();
            }
         }

    }
}
