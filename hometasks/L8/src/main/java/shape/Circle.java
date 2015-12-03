package shape;

/**
 * Created by Ќюта on 29.11.2015.
 */
public class Circle extends Shape {
    Shape.Point center;
    int rad;
    public Circle(int rad, Shape.Point center) {
        this.rad = rad;
        this.center = center;
    }
    @Override
    public void draw() {
        Point[] arrpoint = new Point[(rad + 1)*4];
        for (int i=0; i <= rad; i++){
            int xOffset = (rad - i);
            int yOffset = (int) Math.sqrt(Math.pow((double)rad,2.0)- Math.pow((double)xOffset,2.0));
            Point topRight = new Point(center.getX()+ xOffset, center.getY()- yOffset);
            Point topLeft = new Point(center.getX()- xOffset, center.getY()- yOffset);;
            Point bottomLeft = new Point(center.getX()- xOffset, center.getY()+ yOffset);
            Point bottomRight = new Point(center.getX()+ xOffset, center.getY()+ yOffset);

            arrpoint[i]= topRight;
            arrpoint[i+rad+1]=topLeft;
            arrpoint[i+2*rad+2]=bottomLeft;
            arrpoint[i+3*rad+3]=bottomRight;
        }
        for (int i=0; i <arrpoint.length ; i++)
        System.out.println(arrpoint[i]);
    }
}
