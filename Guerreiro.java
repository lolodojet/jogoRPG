public class Guerreiro extends Personagem{
    
    private String tipoDeArma;
    private String armadura;
    private boolean tempCargaGolpe;

    Guerreiro(){}

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

    
}
