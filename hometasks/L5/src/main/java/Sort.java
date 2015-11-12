/**
 * Created by Нюта on 12.11.2015.
 */
public class Sort {
    public static void main(String[] args) {
        int Arr[];
        Arr = new int[13];
        Arr[0] = 3;
        Arr[1] = 7;
        Arr[2] = 13;
        Arr[3] = 21;
        Arr[4] = 12;
        Arr[5] = 9;
        Arr[6] = 4;
        Arr[7] = 17;
        Arr[8] = 25;
        Arr[9] = 31;
        Arr[10] = 11;
        Arr[11] = 5;
        Arr[12] = 1;
        // реализация Bubble sort (сокр. фрагмета)
        for (int i = Arr.length-1; i >= 0; i--) {
            //max элемент в конец фрагмента
            for (int j = 0; j < i; j++) {
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