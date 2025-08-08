import java.util.Locale;
import java.util.Scanner;

public class Personagem_infos {

    public static void main(String[] args) {
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
        System.out.println("Habilidades: " + guerreiro.getTipoDeArma() + " | Armadura: " + guerreiro.getArmadura());

        Arqueiro arqueiro = new Arqueiro();
        arqueiro.setNome("Garen");
        arqueiro.setClasse("Arqueiro");
        arqueiro.setNivel(1);
        arqueiro.setVida(100);
        arqueiro.setForca(0);
        arqueiro.setPrecisao(100);
        arqueiro.setFlechaEspecial("Flecha flamejante");
        System.out.println("=========================================");
        System.out.println("Seu inimigo é Garen, um arqueiro mágico!");
        System.out.println("Habilidades: " + arqueiro.getFlechaEspecial() + " | Precisão: " + arqueiro.getPrecisao() + "%");
        System.out.println();
        arqueiro.desenharPersonagem();
        System.out.println("-----------------------------");
        System.out.println("==> A Guerra Vai Começar <==");
        System.out.println();

        boolean jogoLigado = true;
        boolean ataqueInicial = true;

        while (jogoLigado) {

            if (ataqueInicial) {
                arqueiro.atacar();
                guerreiro.receberDano(10);
                System.out.println();
                System.out.println("\t\t CONTRA ATAQUE!");
                System.out.println();
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

            switch (escolha) {

                case 1:
                    System.out.println("\t\tCONTRA ATAQUE");
                    System.out.println();
                    guerreiro.atacar();
                    arqueiro.receberDano(8);
                    System.out.println();
                    System.out.println("Garen usou a ultimate para te atacar!");
                    arqueiro.usarHabilidadeEspecial();
                    guerreiro.receberDano(18);
                    break;

                case 2:
                    System.out.println("\t\tFORÇA MÁXIMA!");
                    System.out.println();
                    guerreiro.usarHabilidadeEspecial();
                    arqueiro.receberDano(15);
                    System.out.println();
                    guerreiro.subirNivel();
                    break;

                case 3:
                    System.out.println();
                    guerreiro.mostrarStatus();
                    break;

                case 4:
                    System.out.println();
                    System.out.println("1 - SIM");
                    System.out.println("2 - NAO");
                    System.out.println("Escolha: ");
                    System.out.println();
                    int escolhaContinuar = ler.nextInt();

                    if (escolhaContinuar == 1) {
                        guerreiro.setVida(100);
                        guerreiro.setForca(0);
                        guerreiro.setNivel(1);
                        arqueiro.setVida(100);
                        arqueiro.setForca(0);
                        arqueiro.setNivel(1);
                        System.out.println();
                        System.out.println("Jogo reiniciado. Os personagens foram resetados!");
                        System.out.println();
                        ataqueInicial = true;

                    } else if (escolhaContinuar == 2) {
                        System.out.println("Jogo encerrado!");
                        jogoLigado = false;
                    }
                    break;

                case 5:
                    System.out.println("\t\tTCHAU GUERREIRO!");
                    jogoLigado = false;
                    System.out.println("Jogo encerrado.");
                    break;
            }

            if (guerreiro.getVida() <= 0) {
                System.out.println();
                System.out.println("\t\t(╥__╥) Você morreu!");
                System.out.println();
                System.out.println("Fim de jogo.");
                jogoLigado = false;

            } else if (arqueiro.getVida() <= 0) {
                System.out.println();
                System.out.println("O arqueiro foi derrotado.");
                System.out.println();
                System.out.println("\t\t\\o/ Você venceu!");
                jogoLigado = false;
            }
        }
    }
}
