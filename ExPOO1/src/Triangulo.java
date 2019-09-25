

public class Triangulo {
    
    public Triangulo(float vlbase, float vlaltura, String vlnome) {     // metodo construtor obj
        this.vlbase = vlbase;                                           //passando parametros p/variaveis da classe
        this.vlaltura = vlaltura;
        this.vlnome = vlnome;
        
        ExpressoesMatematicas expressao = new ExpressoesMatematicas(vlbase,vlaltura);
        this.areaRes = expressao.getAreaRes();
        }
     
        
    // Atributos do Obj triangulo    
    private float vlbase;
    private float vlaltura;
    private String vlnome;
    private float areaRes;





    // daqui para baixo apenas getters and setters --------------------------------------   
    /**
     * @return float return the vlbase
     */
    public float getVlbase() {
        return vlbase;
    }

    /**
     * @param vlbase the vlbase to set
     */
    public void setVlbase(float vlbase) {
        this.vlbase = vlbase;
    }

    /**
     * @return float return the vlaltura
     */
    public float getVlaltura() {
        return vlaltura;
    }

    /**
     * @param vlaltura the vlaltura to set
     */
    public void setVlaltura(float vlaltura) {
        this.vlaltura = vlaltura;
    }

    /**
     * @return String return the vlnome
     */
    public String getVlnome() {
        return vlnome;
    }

    /**
     * @param vlnome the vlnome to set
     */
    public void setVlnome(String vlnome) {
        this.vlnome = vlnome;
    }

    /**
     * @return float return the areaRes
     */
    public float getAreaRes() {
        return areaRes;
    }

    /**
     * @param areaRes the areaRes to set
     */
    public void setAreaRes(float areaRes) {
        this.areaRes = areaRes;
    }

}
    
     
    
    
    