package jankenpon;

public class Jogo {

    private JanKenPon usuario, computador;

    public Jogo(byte jogadaUsuario) {
        this.usuario = new JanKenPon(jogadaUsuario);
        byte sorteio = (byte) (Math.random() * 3 + 1);
        this.computador = new JanKenPon(sorteio);
    }

    public String verificarVencedor() {
        byte usuario = this.usuario.getJogada(), computador = this.computador.getJogada();

        if (usuario == computador) {
            return "Jogo Empatado";
        } else if (usuario == 1 && computador == 3 || usuario == 2 && computador == 1 || usuario == 3 && computador == 2) {
            return "Usuário: Win";
        } else {
            return "Computador: Win";
        }
    }

    public String toString() {
        return "O Usuário escolheu " + this.usuario
                + "\nO Computador escolheu: " + this.computador;

    }
}