/**
 * Created by Нюта on 12.11.2015.
 */
public class Sort {
    public static void main(String[] args) {
        int [] Arr = {3,7,13,21,12,9,4,17,25,31,11,5,1};
        // реализация Bubble sort (сокр. фрагмета)
        for (int i = 0; i < Arr.length-1; i++) {
            int x = Arr.length-i-1;
            //max элемент в конец фрагмента
            for (int j = 0; j < x; j++) {
                //попарное сравнение элементов
                if (Arr[j] > Arr[j + 1]) {
                    int rev = Arr[j];
                    Arr[j] = Arr[j + 1];
                    Arr[j + 1] = rev;
                }
            }

            System.out.print(Arr[i] + " ");

        }
    }
}