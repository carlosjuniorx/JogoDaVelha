import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.GridLayout;
public class EscolheCpu extends JFrame{
    
    JPanel displayEscolhe = new JPanel(new GridLayout(3,0,10,10));

    JLabel whoCpu = new JLabel("Escolha seu Adversário!");

    public EscolheCpu(){
        displayEscolhe();
    }

    public void displayEscolhe(){
        add(BorderLayout.CENTER,displayEscolhe);
        add(BorderLayout.NORTH,whoCpu);
    }

    public void configEscolhe(){
        setTitle("Escolha seu Oponente");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600,600);
        setLocationRelativeTo(null);
		setVisible(true);
    }
}
