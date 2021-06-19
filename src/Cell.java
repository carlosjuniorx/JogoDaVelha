
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JOptionPane;



public class Cell extends JButton{
    Jogador player = new Jogador();
	
    int rodadas=0;
    public int who=0;
    static int jogada=1;


    public Cell(){
        setBackground(Color.WHITE);
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
                        JOptionPane.showMessageDialog(null, "Você Ganhou");
                        System.exit(0);

                }                              
                rodadas++;
                if(rodadas==3){
                    JOptionPane.showMessageDialog(null, "Empate");
                    System.exit(0);
                }
            }           
        });
    }
}
