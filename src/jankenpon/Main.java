package jankenpon;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        byte nav;

        do {
            System.out.println("        Bem Vindo \n           ao\n Pedra X Papel X Tesoura");
            System.out.println("        DIVIRTA-SE");
            System.out.println("Tecle 1 para iniciar o Game");
            System.out.println("Tecle 2 para verificar as regras do Game");
            System.out.println("Tecle 3 para finalizar o Game");
            
            nav = ler.nextByte();
            switch (nav) {
                case 1:
                    System.out.println("DIGITE O NUMERO REFERENTE A SUA JOGADA:");
                    System.out.println("1 - PEDRA");
                    System.out.println("2 - PAPEL");
                    System.out.println("3 - TESOURA");   
                    byte jogadaUsuario = ler.nextByte();
                    if(jogadaUsuario > 3){
                        System.out.println("Opção Invalida! \nDigite um numêro de 1 a 3");
                    }else{
                    Jogo jog = new Jogo(jogadaUsuario);
                    System.out.println(jog);
                    System.out.println("O Resultado da partida é: " + jog.verificarVencedor());
                    }
                    break;
                case 2:
                    System.out.println("Regras: \nPara definir o vencedor no Game segue-se a seguinte regra: \nPEDRA ‘quebra’ a TESOURA; \nTESOURA ‘corta’ o PAPEL \ne PAPEL ‘embrulha’ a PEDRA.");
                    break;
                case 3:
                    System.out.println("Jogo Finalizado.\nVolte Sempre");
                    break;
                default: 
                    System.out.println("Comando Invalido!");
            }
        } while (nav != 3);
    }
}