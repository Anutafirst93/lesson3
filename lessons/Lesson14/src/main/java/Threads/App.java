package Threads;

/**
 * Created by Ќюта on 24.12.2015.
 */
public class App {
    public static void main(String[] args) {
        ThreadA a = new ThreadA();
        ThreadB b = new ThreadB();
        a.start();
        b.start();
    }
}
