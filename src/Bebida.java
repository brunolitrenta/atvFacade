public class Bebida extends Produto{
    private int ml;

    public void setMl(int ml) {
        this.ml = ml;
    }

    @Override
    public String toString() {
        return super.toString() + " (" + ml + "ml)";
    }
}
