
public class ExpressoesMatematicas {
    public ExpressoesMatematicas (float vlbase, float vlaltura) {
        float vlarea = ((vlbase * vlaltura) / 2);
        //System.out.println("debugg objexpressao:"+vlarea);
        this.areaRes = vlarea;
    }
    private float areaRes;

 //  public static float calcArea(float vlbase, float vlaltura) {
 //     System.out.println("debugg:"+vlbase+vlaltura);
 //     return ((vlbase * vlaltura) / 2);
        
 //  }

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
