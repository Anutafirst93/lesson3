/**
 * Created by IT_School on 13.11.2015.
 */
public class Rvan {
    public static void main (String [] args){
    //пример 1.1
        /*int [] [] arr = new int [5] []; //5  количество элементов
        for (int i=0; i<arr.length; i++){
            arr [i]=new int [i+1]; //второй массив ,который в начале пустой []
            for (int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] +  "    ");
            }
            System.out.println();
        }*/
//пример 1.2
        /*int [] [] arr = new int [5] []; //5  количество элементов
        for (int i=arr.length-1; i>=0; i--){
            arr [i]=new int [i+1]; //второй массив ,который в начале пустой []
            for (int j=arr[i].length-1; j>=0; j--){
                System.out.print(arr[i][j] +  "    ");
            }
            System.out.println();

        }*/
//пример 1.3
       int [] [] arr = new int [5] []; //5  количество элементов
        for (int i=arr.length-1; i>=0; i--){
            arr [i]=new int [i+1]; //второй массив ,который в начале пустой []
            for (int j=arr[i].length-1; j>=0; j--){
                if (j==arr[i].length-1){
                int x = arr.length-arr[i].length;
                for (int t=0; t<x; t++) {
                    System.out.print(" ");
                }
                }
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
