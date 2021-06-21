package buttons;
import javax.swing.ImageIcon;

import main.EscolheAdversario;
import main.Tabuleiro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ButtonCuca extends Button{
    
    
    ImageIcon iconCuca = new ImageIcon(getClass().getResource("/imgs/cuca.jpg"));
    public ButtonCuca(){
        setIcon(iconCuca);
        actionCuca();
    }

    public void actionCuca(){
        addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                EscolheAdversario.qualAdversario=1; 
                EscolheAdversario.Titulo="BARATA é sua adversária!"; 
                Tabuleiro.oponent=1;
                new Tabuleiro();
            }          
        });
    }
}
