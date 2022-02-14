package seculoChallenge;

public class solClass {
    int resultado;
    
    public int calculaSeculo(int ano) {
    
        if (ano <= 100) {
            return resultado = 1;
        }
        else if (ano % 100 == 0) {
            return resultado = ano / 100;
        }
        else {
            return resultado = ano / 100 + 1;
        }
    }
}

