
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
import java.util.Timer;

public class Tabuleiro extends JFrame{
	public static int jogadas[]= new int[9];
	
	static Computador_A pc = new Computador_A();

	Timer timer = new Timer();

	JPanel display = new JPanel(new GridLayout(3,3,10,10));
	static JLabel lInformation = new JLabel("Valendo!");

	static Cell bt1 = new Cell();
	static Cell bt2 = new Cell();
	static Cell bt3 = new Cell();
	static Cell bt4 = new Cell();
	static Cell bt5 = new Cell();
	static Cell bt6 = new Cell();
	static Cell bt7 = new Cell();
	static Cell bt8 = new Cell();
	static Cell bt9 = new Cell();
	
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
				pc.cpuPlayA();
                if(TestaVitoria.testarVitoria(2)){
                    JOptionPane.showMessageDialog(null, "Você Perdeu");
                    System.exit(0);
                }				
			}
		};	
		timer.scheduleAtFixedRate(tarefa, 1000, 500 );		
	}
}
