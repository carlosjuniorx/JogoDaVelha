package buttons;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JOptionPane;

import main.Jogador;
import main.Tabuleiro;
import main.TestaVitoria;

public class Cell extends JButton{
    Jogador player = new Jogador();
	
    
    public int who=0;
    public static int jogada=1;


    public Cell(){
        play();
    }
    
    public  void play() {
        addActionListener(new ActionListener(){           
            @Override
            public void actionPerformed(ActionEvent e) {
                if(who==0){
                    if(jogada==1){
                        setIcon(((Jogador) player).playYou());
                        who=1;
                        jogada=2;
                    }                   
                    if(TestaVitoria.testarVitoria(1)){
                        jogada=1;
                        JOptionPane.showMessageDialog(null, "Você Ganhou");
                        System.exit(0);
                    }

                }                              
                Tabuleiro.rodadas++;
                if(Tabuleiro.rodadas==5){
                    jogada=1;
                    JOptionPane.showMessageDialog(null, "Empate!!!!");
                    System.exit(0);
                }
                
            }           
        });
    }
}
