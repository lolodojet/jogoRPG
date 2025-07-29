public class Guerreiro extends Personagem{
    
    private String tipoDeArma;
    private String armadura;
    private boolean tempCargaGolpe;

    Guerreiro(){}

    Guerreiro (String nome, String classe, int nivel, int vida, int forca, String tipoDeArma, String armadura, boolean tempCargaGolpe){
        super(nome, classe, nivel, vida, forca);

        this.tipoDeArma = tipoDeArma;
        this.armadura = armadura;
        this.tempCargaGolpe = tempCargaGolpe;
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

    public boolean getTempCargaGolpe(){
        return tempCargaGolpe;
    }
    public void setTempCargaGolpe(boolean tempCargaGolpe){
        this.tempCargaGolpe = tempCargaGolpe;
    }

    @Override
    public void LerAtaque(){
        System.out.println("- Ataque Guerreiro: ");
    }

    @Override
    public void receberDano(){
        System.out.println("- Guerreiro recebe dano: ");
    }

    @Override
    public void usarHabilidadeEspecial(){
        System.out.println("- Habilidade Especial (Guerreiro): ");
    }

    @Override
    public void subirNivel(){
        System.out.println("- Guerreiro subiu de nível: ");
    }

    @Override
    public void mostrarStatus(){
        System.out.println("- Status Guerreiro: ");
    }
}
