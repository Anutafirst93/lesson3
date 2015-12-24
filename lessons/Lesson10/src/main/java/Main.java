import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by IT_School on 30.11.2015.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> iList = new ArrayList();
        List<Integer> iLList = new LinkedList<Integer>();
        for (int i=0; i<10; i++){
            iList.add(new Integer(i));
            iLList.add(new Integer(i));
        }
        for (int i=0; i<iList.size(); i++){ //реализация ArrayList
            System.out.println(iList.get(i));
        }
        for (int i=0; i<iLList.size(); i++){ //реализация LinkedList
            System.out.println(iLList.get(i));
        }
        Iterator it  = iList.iterator() ;
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
