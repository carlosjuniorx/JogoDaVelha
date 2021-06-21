package main;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import buttons.Button;
import buttons.ButtonAllien;
import buttons.ButtonCuca;
import buttons.ButtonMonkey;
public class EscolheAdversario extends JFrame{
    public static int qualAdversario;
    public static String Titulo;
    public static JPanel displayEscolhe = new JPanel(new GridLayout(1,3,10,10));

    JLabel informa = new JLabel("Escolha seu Adversário!");

    static ButtonCuca btCuca = new ButtonCuca();
    static ButtonAllien btAllien = new ButtonAllien();
    static ButtonMonkey btMonkey = new ButtonMonkey();
    static Button[] botoesAdversarios= new Button[]{btCuca,btAllien,btMonkey};

    public EscolheAdversario(){
        displayEscolheConfig();
        configEscolhe();
    }

    public void displayEscolheConfig(){
        add(BorderLayout.CENTER,displayEscolhe);
        add(BorderLayout.NORTH,informa);
        displayEscolhe.setBackground(Color.BLACK);
        informa.setFont(new Font("Arial", Font.BOLD,40));
        informa.setHorizontalAlignment(SwingConstants.CENTER);

        for(int i=0; i<3;i++){
			displayEscolhe.add(botoesAdversarios[i]);
		}
    }

    public void configEscolhe(){
        setTitle("Escolha seu Oponente");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600,600);
        setLocationRelativeTo(null);
		setVisible(true);   
    }
}
