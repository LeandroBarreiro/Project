package capitulo4;

// Utilizando DrawLine para conectar os cantos de um painel.
import java.awt.Graphics;
import javax.swing.JPanel;


public class DrawPanel extends  JPanel{

    // desenha um X a partir dos cantos do painel
    public void paintComponent(Graphics g){

        super.paintComponent(g);

        int width = getWidth();
        int height  = getHeight();

        g.drawLine(20, 0, width, height);

        g.drawLine(0, height, width, 0);
    }
}
