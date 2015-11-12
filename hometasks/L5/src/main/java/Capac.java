/**
 * Created by Нюта on 12.11.2015.
 */
public class Capac {
    public static void main(String[] args) {
        int[] Arr = {3, 7, 13, 21, 12, 9, 4, 17, 25, 31, 11, 5, 1};
        int temp[] = new int[Arr.length + 3];
        for (int i=0; i<temp.length; i++){
            if ( i < Arr.length) {
                temp[i] = Arr[i];
            }else{
                 temp[i] = -1;
            }
        }
        for (int i=0; i<temp.length; i++){
        System.out.print(temp[i] + " ");
        }
    }
}
