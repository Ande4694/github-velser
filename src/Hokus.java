public class Hokus {
    private int hokus;
    private int pokus;

    public Hokus(int hokus, int pokus) {
        this.hokus = hokus;
        this.pokus = pokus;
    }

    @Override
    public String toString() {
        return "Hokus{" +
                "hokus=" + hokus +
                ", pokus=" + pokus +
                '}';
    }

    public int getHokus() {
        return hokus;
    }

    public void setHokus(int hokus) {
        this.hokus = hokus;
    }

    public int getPokus() {
        return pokus;
    }

    public void setPokus(int pokus) {
        this.pokus = pokus;
    }
}
