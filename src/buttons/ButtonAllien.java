package buttons;
import main.EscolheAdversario;
import main.Tabuleiro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
public class ButtonAllien extends Button{
    ImageIcon iconalien = new ImageIcon(getClass().getResource("../imgs/alien.png"));

    public ButtonAllien(){
        setIcon(iconalien);
        actionMonkey();
    }

    public void actionMonkey(){
        addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                EscolheAdversario.qualAdversario=2; 
                EscolheAdversario.Titulo="Allien é seu adversário!"; 
                Tabuleiro.oponent=2; 
                new Tabuleiro(); 
            }
           
            
        });
    }
}
