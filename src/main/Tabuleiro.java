package main;

/* após o frame "EscolheAdversário" o Tabuleiro é chamado e é criado outro frame onde ocorrera o jogo , contra o adversário escolhido.*/

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import java.util.TimerTask;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import buttons.Cell;
import computador.Computador_A;
import computador.Computador_B;
import computador.Computador_C;

import java.util.Timer;

public class Tabuleiro extends JFrame{
	
	public static int rodadas=0;
	public static int jogadas[]= new int[9];
	public static int oponent=0;

	Computador_A pcA = new Computador_A();
	Computador_B pcB = new Computador_B();
	Computador_C pcC = new Computador_C();

	static Timer timer = new Timer();
	
	JPanel display = new JPanel(new GridLayout(3,3,10,10));
	static JLabel lInformation = new JLabel(EscolheAdversario.Titulo);

	public static Cell bt1 = new Cell();
	public static Cell bt2 = new Cell();
	public static Cell bt3 = new Cell();
	public static Cell bt4 = new Cell();
	public static Cell bt5 = new Cell();
	public static Cell bt6 = new Cell();
	public static Cell bt7 = new Cell();
	public static Cell bt8 = new Cell();
	public static Cell bt9 = new Cell();
	
	static Cell[] cells = new Cell[]{bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9};

	public Tabuleiro(){
		configGame();
		configDisplay();
	}
	
	public void configDisplay(){
		add(BorderLayout.CENTER,display);
		add(BorderLayout.NORTH,lInformation);
		display.setBackground(Color.BLACK);
		lInformation.setFont(new Font("Arial", Font.BOLD,40));
		lInformation.setForeground(new Color(50,200,50));
		lInformation.setHorizontalAlignment(SwingConstants.CENTER);
	
		for(int i=0; i<9;i++){
			display.add(cells[i]);
		}		
	}
	
	public void configGame() {
		setTitle("Jogo da Velha");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600,600);
		setLocationRelativeTo(null);
		setVisible(true);
		TimerTask tarefa = new TimerTask(){
            @Override
			public void run() {
				if(oponent==1){
					pcA.cpuPlayA();
				}
				if(oponent==2){
					pcB.cpuPlayB();
				}
				if(oponent==3){
					pcC.cpuPlayC();
				}
                if(TestaVitoria.testarVitoria(2)){
                    JOptionPane.showMessageDialog(null, "Você Perdeu");
                    System.exit(0);
                }				
			}
		};	
		timer.scheduleAtFixedRate(tarefa, 1000, 1000 );
	}
}
