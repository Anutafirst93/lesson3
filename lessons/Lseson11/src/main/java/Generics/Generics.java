package Generics;

/**
 * Created by IT_School on 04.12.2015.
 */
public class Generics {
    static class Pair <T1,T2>{
        T1 key;
        T2 value;
        public Pair (T1 key,T2 value){
            this.key = key;
            this.value = value;
        }
    }
    public static void main (String[]args){
        Pair <Integer,Integer> p = new Pair <Integer,Integer>(150,10);
        System.out.println(p.key+p.value);
    }
}
