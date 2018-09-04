package jankenpon;

public class JanKenPon {

    private static final byte PEDRA = 1, PAPEL = 2, TESOURA = 3;
    
    private byte jogada;
    
    public JanKenPon(byte jogada){
    this.jogada = jogada;
    }

    public byte getJogada() {
        return jogada;
    }

    public void setJogada(byte jogada) {
        this.jogada = jogada;
    }
    
    public String toString(){
        switch(this.jogada){
            case 1: return "PEDRA";
            case 2: return "PAPEL";
            default: return "TESOURA";
        }
    }
}