public class Arqueiro extends Personagem {

    private int quantidadeFlechas;
    private int precisao;
    private String flechaEspecial;

    Arqueiro(){}

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
    public void LerAtaque(){
        System.out.println("- Ataque: ");
    }

}
