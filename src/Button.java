import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Button extends JButton{
    
    public Button(){
        setBackground(Color.white);

    }

    public void actionButton(){
        addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                
                
            }
            
        });
    }
}
