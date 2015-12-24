package Requ;

import Shapes.Shape;
import Shapes.Traingle;

/**
 * Created by IT_School on 20.11.2015.
 */
public class Query {
    public static void main ( String [] args) {

        Shape s = new Traingle();
        s.draw();

    Request r = new Request();
    Request.Query q = r.getQuery();
    }
}
