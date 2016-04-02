package mobili;

public abstract class Mobile {

    private int dimX_M = 0;
    private int dimY_M = 0;
    private int dimZ_M = 0;
    private int dimX_S = 0;
    private int dimY_S = 0;
    private int dimZ_S = 0;
    private int peso = 0;

    public Mobile(int dimX_M, int dimY_M, int dimZ_M, int dimX_S, int dimY_S, int dimZ_S, int peso) {
        this.dimX_M = dimX_M;
        this.dimY_M = dimY_M;
        this.dimZ_M = dimZ_M;
        this.dimX_S = dimX_S;
        this.dimY_S = dimY_S;
        this.dimZ_S = dimZ_S;
        this.peso = peso;
    }

    public int getDimX_M() {
        return dimX_M;
    }

    public void setDimX_M(int dimX_M) {
        this.dimX_M = dimX_M;
    }

    public int getDimY_M() {
        return dimY_M;
    }

    public void setDimY_M(int dimY_M) {
        this.dimY_M = dimY_M;
    }

    public int getDimZ_M() {
        return dimZ_M;
    }

    public void setDimZ_M(int dimZ_M) {
        this.dimZ_M = dimZ_M;
    }

    public int getDimX_S() {
        return dimX_S;
    }

    public void setDimX_S(int dimX_S) {
        this.dimX_S = dimX_S;
    }

    public int getDimY_S() {
        return dimY_S;
    }

    public void setDimY_S(int dimY_S) {
        this.dimY_S = dimY_S;
    }

    public int getDimZ_S() {
        return dimZ_S;
    }

    public void setDimZ_S(int dimZ_S) {
        this.dimZ_S = dimZ_S;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double calcolaIngombro() {
        return (double) dimX_S * dimY_S * dimZ_S;
    }

}
