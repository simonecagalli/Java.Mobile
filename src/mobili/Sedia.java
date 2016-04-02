package mobili;

public class Sedia extends Mobile {

    private boolean braccioli;

    public Sedia(boolean braccioli, int dimX_M, int dimY_M, int dimZ_M, int dimX_S, int dimY_S, int dimZ_S, int peso) {
        super(dimX_M, dimY_M, dimZ_M, dimX_S, dimY_S, dimZ_S, peso);
        this.braccioli = braccioli;
    }

    public boolean isBraccioli() {
        return braccioli;
    }

    public void setBraccioli(boolean braccioli) {
        this.braccioli = braccioli;
    }

    @Override
    public String toString() {
        return "Sedia{" + "braccioli=" + braccioli + '}';
    }

    @Override
    public double calcolaIngombro() {
        double ig = super.calcolaIngombro();
        return braccioli == true ? ig + (ig * 0.2) : ig;
    }

}
