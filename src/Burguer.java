public class Burguer extends Produto{
    private int gramas;

    public void setGramas(int gramas) {
        this.gramas = gramas;
    }

    @Override
    public String toString() {
        return super.toString() + " (" + gramas + "g)";
    }
}
