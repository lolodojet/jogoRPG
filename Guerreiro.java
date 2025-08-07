public class Guerreiro extends Personagem{
    
    private String tipoDeArma;
    private String armadura;
 
    Guerreiro(){}

    Guerreiro (String nome, String classe, int nivel, int vida, int forca, String tipoDeArma, String armadura){
        super(nome, classe, nivel, vida, forca);

        this.tipoDeArma = tipoDeArma;
        this.armadura = armadura;
    }

    public String getTipoDeArma(){
        return tipoDeArma;
    }
    public void setTipoDeArma(String tipoDeArma){
        this.tipoDeArma = tipoDeArma;
    }

    public String getArmadura(){
        return armadura;
    }
    public void setArmadura(String armadura){
        this.armadura = armadura;
    }

    @Override
    public void atacar() {
        System.out.println("- " + getNome()+ " atacou com a sua espada, causando 8 de dano!");
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
        setForca(getForca() + 2);
        System.out.println("- " + getNome() + "(" + getClasse() + ") revidou atacando com sua -Espada Fortificada- causando 15 de dano! Força aumentada em 2!");
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
        String mensagem = "Status - Nome: " + getNome() + " | Classe: " + getClasse() + " | Nível: " + getNivel() + " | Vida: " + getVida() + " | Força: " + getForca();
        System.out.println(mensagem);
    }

    @Override
    public void desenharPersonagem() {  
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

