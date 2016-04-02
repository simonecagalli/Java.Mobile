package mobili;

public class Armadio extends Mobile {

    private int ante;

    public Armadio(int ante, int dimX_M, int dimY_M, int dimZ_M, int dimX_S, int dimY_S, int dimZ_S, int peso) {
        super(dimX_M, dimY_M, dimZ_M, dimX_S, dimY_S, dimZ_S, peso);
        this.ante = ante;
    }

    public int getAnte() {
        return ante;
    }

    public void setAnte(int ante) {
        this.ante = ante;
    }

    @Override
    public String toString() {
        return "Armadio{" + "ante=" + ante + '}';
    }

    @Override
    public double calcolaIngombro() {
        double ig = super.calcolaIngombro();
        return ante == 6 ? ig + (ig * 0.1) : ig;
    }

}
