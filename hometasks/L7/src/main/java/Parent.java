/**
 * Created by Ќюта on 16.11.2015.
 */
public class Parent {
    public static void main1 (int i){
        i = 10 ;
    System.out.print(i);
    }
    static {
        System.out.println("parent static");
    }
    String name;
    public void setName(String name){
        this.name=name;
        System.out.println("Child NOTstatic" + name);
    }
    String mom = "NATALI";
    Parent(){
        this. mom = mom ;
        System.out.println(mom);
    }
}
