package Draw;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Íşòà on 26.11.2015.
 */
public class Draw {
    final static int N = 100;
    final static int cell_size = 5;

    static int [][]state = new int [N][N];
    static int [][]state_sum = new int [N][N];

    static Display displ = new Display();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        state[1][6] = state[1][7] = state[2][6] =state[2][7] = 1;
        state[10][6] = state[10][7] = state[10][8] = state[11][5]=state[11][9]=state[12][4] = state[12][10]=state[13][4]=state[13][5]=state[13][7]=state[13][9]=state[13][10] =1;
        state[16][7] = state[17][6] = state[17][8] = state[18][6]=state[18][8] = state[19][6] = state[19][7] = state[20][5] = state[21][4] = state[21][5] = state[21][6] = state[22][3]=state[22][7]=state[23][2]=state[23][4]=state[23][5]=state[23][6]=state[23][8]=state[24][3]=state[24][4]=state[24][5]=state[24][6]=state[24][7]=1;
        state[35][4] = state[35][5]=state[36][4]=state[36][5]=1;
        int iter = 0;
        displ.repaint();
        pause();
        while(true)
        {
            System.out.println("iter = " + iter++);
            for(int i = 1; i< N-1; i++)
            {
                for(int j = 1;j <N-1;j++)
                {
                    state_sum[i][j] = state[i-1][j-1]+state[i][j-1]+state[i+1][j-1]+
                            state[i-1][j]+state[i+1][j]+
                            state[i-1][j+1]+state[i][j+1]+state[i+1][j+1];}}
            for(int i = 1; i< N-1; i++)
            {
                for(int j = 1;j <N-1;j++)
                {

                    if(state_sum[i][j]>3)state[i][j] = 0;
                    else
                    {
                        if(state_sum[i][j]<2)state[i][j] = 0;
                        else
                        {
                            if(state_sum[i][j]==3)state[i][j] = 1;
                            else if(state_sum[i][j]==2&&state[i][j] == 1) state[i][j] = 1;
                        }
                    }
                }
            }
            displ.repaint();
            pause();
        }
        // TODO code application logic here
    }

    static void pause()
    {
        try
        {
            Thread.sleep(10);
        }catch(InterruptedException e)
        {
            e.printStackTrace();
            System.exit(1);
        }
    }
    static class Display extends JPanel {
        final static int win_size = N*cell_size;

        public Display() {
            setPreferredSize(new Dimension(win_size, win_size));

            JFrame frame = new JFrame("Life");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setContentPane(this);
            frame.pack();
            frame.setVisible(true);
        }

        public void paintComponent(Graphics g)
        {
            g.setColor(Color.black);
            g.fillRect(0, 0, win_size, win_size);

            g.setColor(Color.red);
            for(int i = 0; i<N;i++)
            {
                for(int j = 0; j < N;j++)
                {
                    if(state[i][j] == 1)
                    {
                        g.fillRect(cell_size*i, cell_size*j, cell_size, cell_size);
                    }
                }
            }
        }
    }
}
