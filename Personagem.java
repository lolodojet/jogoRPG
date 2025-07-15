public class Personagem{

    public String nome;
    public String classe = "Guerreiro";
    public int nivel = 1;
    public int vida = 100;
    public int mana;
    public int forca = 0;

    // Metodos (ação e comportamento)
    public void atacar(){
        if (classe.equals("Arqueiro")){
            System.out.println("- " +nome+ " atirou com sua flecha, causando 10 de dano!");
        } else if (classe.equals("Guerreiro")){
            System.out.println("- " +nome+ " atacou com a sua espada, causando 8 de dano!");
        }
    }

    public void receberDano(int dano){
        vida -= dano;
        if (vida < 0){
            vida = 0;
        }
        System.out.println("- "+nome+" foi atingido(a) e recebeu " +dano+" de dano. Vida atual "+vida+".");
    }
    
    public void usarHabilidadeEspecial(){
        if (classe.equals("Arqueiro")){
            forca += 1;
            System.out.println( "- "+nome+"(" +classe+ ") usou seu Arco Ultimate causando 18 de dano!");
        } else if (classe.equals("Guerreiro")){
            forca += 2;
            System.out.println("- " +nome+ "(" +classe+ ") revidou atacando com sua -Espada Fortificada- causando 15 de dano! Força aumentada em 2!");
        }
        return;
    }

    public void subirNivel(){
        vida += 5;
        if (vida > 100){
            vida = 100;
        } 
        forca += 1;
        nivel += 1;

        System.out.println("- "+nome+" Subiu de nível! Recebeu: +1 de força, +5 de vida. Você agora está no nível "+nivel+" com " +forca+" de força");
    }

    public void mostrarStatus(){
        String mensagem = "Nome: " +nome+" | Classe: "+classe+" | Nível: "+nivel+" | Vida: "+vida+" | Força: "+forca;
        System.out.println(mensagem);
    }

    public void desenharPersonagem(){

        if (classe.equals("Arqueiro")){
            System.out.println("    OOOO ");
            System.out.println("   O    O ");
            System.out.println("   O    O ");
            System.out.println("    OOOO ");
            System.out.println("   OOOOOOO ");
            System.out.println("  OO     OO   __");
            System.out.println(" O O     O O |  \\");
            System.out.println("O  O     O  O|   |");
            System.out.println("O  O     O   |   /");
            System.out.println("   O     O   |__/");
            System.out.println("   OOOOOOO ");
            System.out.println("   OO   OO ");
            System.out.println("   OO   OO ");
            System.out.println("   OO   OO ");
            System.out.println("   OO   OO ");

        } else if (classe.equals("Guerreiro")){

            System.out.println("    OOOO ");
            System.out.println("   O    O ");
            System.out.println("   O    O ");
            System.out.println("    OOOO ");
            System.out.println("   OOOOOOO ");
            System.out.println("  OO     OO    |");
            System.out.println(" O O     O O   | ");
            System.out.println("O  O     O  =O=|==");
            System.out.println("   O     O     |");
            System.out.println("   O     O    ");
            System.out.println("   OOOOOOO ");
            System.out.println("   OO   OO ");
            System.out.println("   OO   OO ");
            System.out.println("   OO   OO ");
            System.out.println("   OO   OO ");   
        }
    }
}