package main;
public class TestaVitoria {
    
    public static boolean testarVitoria(int jog){
        if(Tabuleiro.cells[0].who==jog&&Tabuleiro.cells[1].who==jog&&Tabuleiro.cells[2].who==jog){
            return true;
        }
        if(Tabuleiro.cells[3].who==jog&&Tabuleiro.cells[4].who==jog&&Tabuleiro.cells[5].who==jog){
            return true;
        }
        if(Tabuleiro.cells[6].who==jog&&Tabuleiro.cells[7].who==jog&&Tabuleiro.cells[8].who==jog){
            return true;
        }
        if(Tabuleiro.cells[0].who==jog&&Tabuleiro.cells[3].who==jog&&Tabuleiro.cells[6].who==jog){
            return true;
        }
        if(Tabuleiro.cells[1].who==jog&&Tabuleiro.cells[4].who==jog&&Tabuleiro.cells[7].who==jog){
            return true;
        }
        if(Tabuleiro.cells[2].who==jog&&Tabuleiro.cells[5].who==jog&&Tabuleiro.cells[8].who==jog){
            return true;
        }
        if(Tabuleiro.cells[0].who==jog&&Tabuleiro.cells[4].who==jog&&Tabuleiro.cells[8].who==jog){
            return true;
        }
        if(Tabuleiro.cells[6].who==jog&&Tabuleiro.cells[4].who==jog&&Tabuleiro.cells[2].who==jog){
            return true;
        }
        return false;
    }
}
