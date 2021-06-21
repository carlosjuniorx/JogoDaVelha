package buttons;
import javax.swing.ImageIcon;

import main.EscolheAdversario;
import main.Tabuleiro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonMonkey extends Button{
    

    ImageIcon iconMonkey = new ImageIcon(getClass().getResource("/imgs/monkey.png"));
    public ButtonMonkey(){
        setIcon(iconMonkey);
        actionMonkey();
    }

    public void actionMonkey(){
        addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                EscolheAdversario.qualAdversario=2; 
                EscolheAdversario.Titulo="Monkey é seu adversário!"; 
                Tabuleiro.oponent=3;
                new Tabuleiro();         
            }

        });
    }
}
