import java.util.Locale;
import java.util.Scanner;

public class Personagem_infos{

    public static void main (String[] args){      
        Scanner ler = new Scanner(System.in);

        Guerreiro guerreiro = new Guerreiro();
        guerreiro.desenharPersonagem();
        System.out.println();
        System.out.println("Informe o nome do seu guerreiro: ");
        guerreiro.setNome(ler.nextLine());
        guerreiro.setClasse("Guerreiro");
        guerreiro.setNivel(1);
        guerreiro.setVida(100);
        guerreiro.setForca(0);
        guerreiro.setTipoDeArma("Espada");
        guerreiro.setArmadura("Encantada");
        System.out.println();
        
        Arqueiro arqueiro = new Arqueiro();
        arqueiro.desenharPersonagem();
        arqueiro.setNome("Garen");
        arqueiro.setClasse("Arqueiro");
        arqueiro.setNivel(1);
        arqueiro.setVida(100);
        arqueiro.setForca(0);
        arqueiro.setQuantidadeFlechas(10);
        arqueiro.setPrecisao(3);
        arqueiro.setFlechaEspecial("Flecha flamejante");
        System.out.println();
        System.out.println("Seu inimigo é Garen, um arqueiro mágico!");
        System.out.println("-----------------------------");
        System.out.println("==> A Guerra Vai Começar <==");
        
        boolean jogoLigado = true;
        boolean ataqueInicial = true;

        while (jogoLigado){

            if (ataqueInicial){
                arqueiro.getFlechaEspecial();
                arqueiro.setQuantidadeFlechas(7);
                arqueiro.setPrecisao(2);
                guerreiro.receberDano(8);
                System.out.println("Garen atirou flechas flamejantes, contra ataque!");
                ataqueInicial = false;
            }
            System.out.println("-----------------------------");
            System.out.println("=> MENU <=");
            System.out.println("1 - Contra ataque!");
            System.out.println("2 - Revide o ataque especial de Garen, use sua ultimate!");
            System.out.println("3 - Ver status?");
            System.out.println("4 - Jogar de Novo?");
            System.out.println("5 - Sair?");
            System.out.println("Escolha uma opção: ");
            int escolha = ler.nextInt();

            switch(escolha){
            
            case 1: guerreiro.atacar(); arqueiro.receberDano(8); System.out.println(); System.out.println("Garen usou a ultimate para te atacar!");arqueiro.usarHabilidadeEspecial(); guerreiro.receberDano(18); break;

            case 2: guerreiro.usarHabilidadeEspecial(); arqueiro.receberDano(15); System.out.println(); guerreiro.subirNivel();
            break;

            case 3: guerreiro.mostrarStatus();
            break;

            case 4: System.out.println("1 - SIM"); System.out.println("2 - NAO"); System.out.println("Escolha: ");      
            int escolhaContinuar = ler.nextInt();

            if (escolhaContinuar == 1){
                guerreiro.setVida(100); guerreiro.setForca(0); guerreiro.setNivel(1); arqueiro.setVida(100); arqueiro.setForca(0); arqueiro.setNivel(1); 
                System.out.println(); System.out.println("Jogo reiniciado. Os personagens foram resetados!"); System.out.println();
                ataqueInicial = true;
                
            } else if (escolhaContinuar == 2){
                System.out.println("Jogo encerrado!");
                jogoLigado = false;
            }
            break;

            case 5: jogoLigado = false; System.out.println("Jogo encerrado!");
            break;
            }

            if (guerreiro.getVida() <= 0){
                System.out.println();
                System.out.println("Você morreu! Fim de jogo");
                jogoLigado = false;

            } else if (arqueiro.getVida() <= 0) {
                System.out.println();
                System.out.println("Você venceu! O arqueiro foi derrotado!");
                jogoLigado = false;
            }           
        }     
    }        
}
