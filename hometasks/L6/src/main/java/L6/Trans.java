package L6;

/**
 * Created by Нюта on 17.11.2015.
 */
public class Trans {
    public static void main (String [] args){
        int m = 2;
        int n = 4;
        int [] [] mat = new int [m][];
        int [] [] tmat = new int [n][];
        for (int i =0; i <tmat.length; i++)
            tmat[i] = new int [m];
//исходная матрица
        System.out.println("Матрица: ");
        for (int i =0; i <mat.length; i++){
            mat [i]=new int [n];
            for (int j=0; j< mat [i].length; j++){
                mat [i][j]= (int)Math.round(Math.random()*100);
                System.out.print(mat [i][j]  +  "  ");
            }
            System.out.println();
        }
//транспонирование
        for (int i =0; i <tmat.length; i++) {
            for (int j = 0; j < tmat[i].length; j++) {
                tmat [i][j] = mat [j][i];
            }
        }
        System.out.println("Транспонирование: ");
        for (int i =0; i <tmat.length; i++){
            for (int j=0; j< tmat [i].length; j++){
                System.out.print(tmat[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
