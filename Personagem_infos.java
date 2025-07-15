import java.util.Locale;
import java.util.Scanner;

public class Personagem_infos{

    public static void main (String[] args){      
        Scanner ler = new Scanner(System.in);

        Personagem arqueiro = new Personagem();
        arqueiro.nome = "Garen";
        arqueiro.classe = "Arqueiro";
        arqueiro.forca = 0;
        System.out.println("O seu inimigo é: "+arqueiro.nome+" | Classe: "+arqueiro.classe+"| Força: "+arqueiro.forca);
        arqueiro.desenharPersonagem();
        System.out.println("");

        Personagem guerreiro = new Personagem();
        System.out.println("Informe o nome do seu herói: ");
        guerreiro.nome = ler.nextLine();
        System.out.println("- Herói criado: "+guerreiro.nome+"("+guerreiro.classe+") | Vida Inicial: "+guerreiro.vida+" | Força Inicial: "+guerreiro.forca);
        guerreiro.desenharPersonagem();
        System.out.println();
        
        boolean jogoLigado = true;
        boolean ataqueInicial = true;

        while (jogoLigado){

            if (ataqueInicial){
                arqueiro.atacar();
                guerreiro.receberDano(10);
                ataqueInicial = false;
            }

            System.out.println("=== MENU ===");
            System.out.println();
            System.out.println("1 - Contra atacar?");
            System.out.println("2 - Garen usou ultimate! Usar seu poder especial?");
            System.out.println("3 - Ver status?");
            System.out.println("4 - Jogar de Novo?");
            System.out.println("5 - Sair?");
            System.out.println("Escolha uma opção: ");
            int escolha = ler.nextInt();

            switch(escolha){
            
            case 1: guerreiro.atacar(); arqueiro.receberDano(8);
                if (arqueiro.vida > 0){ 
                arqueiro.usarHabilidadeEspecial();
                guerreiro.receberDano(18);
                }
            break;

            case 2: guerreiro.usarHabilidadeEspecial(); arqueiro.receberDano(15); guerreiro.subirNivel();
            break;

            case 3: guerreiro.mostrarStatus();
            break;

            case 4: guerreiro.vida = 100; guerreiro.forca = 0; guerreiro.nivel = 1; arqueiro.vida = 100; arqueiro.forca = 0; System.out.println("Jogo reiniciado. Os personagens foram resetados");
            ataqueInicial = true;
            break;

            case 5: jogoLigado = false; System.out.println("Jogo encerrado!");
            break;
            }

            if (guerreiro.vida <= 0){
                System.out.println("");
                System.out.println("Você moreru! Fim de jogo");
                jogoLigado = false;
            } else if (arqueiro.vida <= 0) {
                System.out.println("");
                System.out.println("Você venceu! O arqueiro foi derrotado");
                jogoLigado = false;
            }
        }       
    }        
}
