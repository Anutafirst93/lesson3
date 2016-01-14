package L6;

/**
 * Created by Ќюта on 15.01.2016.
 */
public class Gauss {
        public static void main(String[] arg) {
            double[][] a = {
                    {2, 1, -1, 8},
                    {-3, -1, 2, -11},
                    {-2, 1, 2, -3}
            };
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i][0] + "x+" + a[i][1] + "y+" + a[i][2] + "z = " + a[i][3]);
            }
            double x[]=new double[a.length];
            for (int i = 0; i < x.length; i++) {
                x[i] = a[i][a[i].length - 1];
            }
            double m;
            for (int k = 1; k < a.length; k++) {
                for (int j = k; j < a.length; j++) {
                    m = a[j][k - 1] / a[k - 1][k - 1];
                    for (int i = 0; i < a[j].length; i++) {
                        a[j][i] = a[j][i] - m * a[k - 1][i];
                    }
                    x[j] = x[j] - m * x[k - 1];
                }
            }

            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i][0] + "x+" + a[i][1] + "y+" + a[i][2] + "z = " + a[i][3]);
            }


            for (int i=a.length-1;i>=0;i--) {
                for (int j=i+1;j<a.length;j++) x[i]-=a[i][j]*x[j];
                x[i] = x[i] / a[i][i];
            }

            int t=(int) 'x';
            for (int i = 0; i < x.length; i++) {
                System.out.println(((char)t++)+" = "+x[i]);
            }
        }
}
