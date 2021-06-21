package computador;

import buttons.Cell;
import main.Tabuleiro;

public class Computador_B extends Computador{
    
    public void cpuPlayB() {
        
        cpuValue = 1 + random.nextInt(9);
        
        if(Cell.jogada==2){

            switch (Computador.cpuValue) {
                
                case 8:
                if(Tabuleiro.bt8.who==0){
                        Tabuleiro.bt8.setIcon(iconcircle);
                        Tabuleiro.bt8.who=2;
                        Cell.jogada=1;
                        break;      
                    }
                case 7:
                    if(Tabuleiro.bt7.who==0){
                        Tabuleiro.bt7.setIcon(iconcircle);
                        Tabuleiro.bt7.who=2;
                        Cell.jogada=1;
                        break;  
                    }
                case 6:
                    if(Tabuleiro.bt6.who==0){
                        Tabuleiro.bt6.setIcon(iconcircle);
                        Tabuleiro.bt6.who=2;
                        Cell.jogada=1;
                        break;  
                    }
                case 5:
                    if(Tabuleiro.bt5.who==0){
                        Tabuleiro.bt5.setIcon(iconcircle);
                        Tabuleiro.bt5.who=2;
                        Cell.jogada=1;
                        break;  
                    }
                case 4:
                    if(Tabuleiro.bt4.who==0){
                        Tabuleiro.bt4.setIcon(iconcircle);
                        Tabuleiro.bt4.who=2;
                        Cell.jogada=1;
                        break;  
                    }
                case 3:
                    if(Tabuleiro.bt3.who==0){
                        Tabuleiro.bt3.setIcon(iconcircle);
                        Tabuleiro.bt3.who=2;
                        Cell.jogada=1;
                        break;  
                    }
                case 2:
                    if(Tabuleiro.bt2.who==0){
                        Tabuleiro.bt2.setIcon(iconcircle);
                        Tabuleiro.bt2.who=2;
                        Cell.jogada=1;
                        break;    
                    }
                case 1:
                        if(Tabuleiro.bt1.who==0){
                        Tabuleiro.bt1.setIcon(iconcircle);
                        Tabuleiro.bt1.who=2;
                        Cell.jogada=1;
                        break;
                        }
                default:
                    if(Tabuleiro.bt9.who==0){
                        Tabuleiro.bt9.setIcon(iconcircle);
                        Tabuleiro.bt9.who=2;
                        Cell.jogada=1;
                        break;
                    }
                }
                
            }          
            
    }    
}
