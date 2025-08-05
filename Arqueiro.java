public class Arqueiro extends Personagem {

    private int quantidadeFlechas;
    private int precisao;
    private String flechaEspecial;

    Arqueiro(){}

    Arqueiro (String nome, String classe, int nivel, int vida, int forca, int quantidadeFlechas, int precisao, String flechaEspecial){
        super(nome, classe, nivel, vida, forca);

        this.quantidadeFlechas = quantidadeFlechas;
        this.precisao = precisao;
        this.flechaEspecial = flechaEspecial;
    }

    public int getQuantidadeFlechas(){
        return quantidadeFlechas;
    }
    public void setQuantidadeFlechas(int quantidadeFlechas){
        this.quantidadeFlechas = quantidadeFlechas;
    }

    public int getPrecisao(){
        return precisao;
    }
    public void setPrecisao(int precisao){
        this.precisao = precisao;
    }

    public String getFlechaEspecial(){
        return flechaEspecial;
    }
    public void setFlechaEspecial(String flechaEspecial){
        this.flechaEspecial = flechaEspecial;
    }

    @Override
    public void atacar() {
        System.out.println("Arqueiro atirou com sua flecha, causando 10 de dano!");
    }

    @Override
    public void receberDano(int dano) {
        if (getVida() - dano < 0) {
            setVida(0);
        } else {
            setVida(getVida() - dano);
        }
        System.out.println("- " + getNome() + " foi atingido(a) e recebeu " + dano + " de dano. Vida atual " + getVida() + ".");
    }

    @Override
    public void usarHabilidadeEspecial() {
        setForca(getForca() + 1);
    }

    @Override
    public void subirNivel() {
        setVida(getVida() + 5);
        if (getVida() > 100) {
            setVida(100); 
        }
        setForca(getForca() + 1);
        setNivel(getNivel() + 1);
        System.out.println("- " + getNome() + " Subiu de nível! Recebeu: +1 de força, +5 de vida. Você agora está no nível " + getNivel() + " com " + getForca() + " de força");
    }

    @Override
    public void mostrarStatus() {
        String mensagem = "Nome: " + getNome() + " | Classe: " + getClasse() + " | Nível: " + getNivel() + " | Vida: " + getVida() + " | Força: " + getForca();
        System.out.println(mensagem);
    }

    @Override
    public void desenharPersonagem() {
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
    }

}

