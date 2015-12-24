package Enum;

/**
 * Created by IT_School on 04.12.2015.
 */
public class Enum {
    enum Seasons{
        winter,spring,summer,outumn};
    enum Planets {
        venus(2),earth(3),saturn(6),mars(4);
         int order;
        Planets (int order){
            this.order = order;
        }
    }
    public static void main(String[]args){
        Seasons season = Seasons.winter;
        //вывод
        System.out.println(Seasons.winter);
        System.out.println(Seasons.class.getName());
        switch (season){
            case winter: {
                System.out.println("It is season now: winter");
            }break;
            case spring: {
                System.out.println("It is season now: spring");
            }break;
            case summer: {
                System.out.println("It is season now: summer");
            }break;
            case outumn: {
                System.out.println("It is season now:outumn ");
            }
    }
        System.out.println(Seasons.valueOf("spring"));
        Seasons[] s = Seasons.values();
        System.out.println(season.summer.ordinal());
        System.out.println(Planets.saturn.order);
    }
}
