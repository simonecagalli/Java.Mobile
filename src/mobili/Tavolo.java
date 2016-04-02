package mobili;

public class Tavolo extends Mobile {

    private String forma;

    public Tavolo(String forma, int dimX_M, int dimY_M, int dimZ_M, int dimX_S, int dimY_S, int dimZ_S, int peso) {
        super(dimX_M, dimY_M, dimZ_M, dimX_S, dimY_S, dimZ_S, peso);
        this.forma = forma;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    @Override
    public String toString() {
        return "Tavolo{" + "forma=" + forma + '}';
    }


    @Override
    public double calcolaIngombro() {
        return super.calcolaIngombro();
    }

}
