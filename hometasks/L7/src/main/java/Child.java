/**
 * Created by Ќюта on 16.11.2015.
 */
public class Child extends Parent {
    public static void main (String [] args){
        int y=15;
        System.out.print( "static y = " + y);
    }
    static {
        System.out.println("Child static");
    }
    String nam;

    public void setNam(String nam){
        this.nam=nam;
        System.out.println("Child NOTstatic");
    }
    String daug = "Ann";
    Child(){
        this.daug = daug;
        System.out.println(daug);
    }

}
