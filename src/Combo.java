public class Combo {
    private Burguer comboBurguer;
    private Bebida comboBebida;
    private Sobremesa comboSobremesa;

    public Burguer getComboBurguer() {
        return comboBurguer;
    }

    public Bebida getComboBebida() {
        return comboBebida;
    }

    public Sobremesa getComboSobremesa() {
        return comboSobremesa;
    }

    public void setComboBurguer(Burguer comboBurguer) {
        this.comboBurguer = comboBurguer;
    }

    public void setComboBebida(Bebida comboBebida) {
        this.comboBebida = comboBebida;
    }

    public void setComboSobremesa(Sobremesa comboSobremesa) {
        this.comboSobremesa = comboSobremesa;
    }

    public void CriarCombo(int tipo) {
        if (tipo == 1){
            Burguer burguer = new Burguer();
            burguer.setDescricao("Master burguer");
            burguer.setPreco(29.99);
            burguer.setGramas(300);
            Bebida bebida = new Bebida();
            bebida.setDescricao("Master drink");
            bebida.setPreco(12.99);
            bebida.setMl(500);

            this.setComboBurguer(burguer);
            this.setComboBebida(bebida);
        }
        if (tipo == 2) {
            Burguer burguer = new Burguer();
            burguer.setDescricao("Super burguer");
            burguer.setPreco(39.99);
            burguer.setGramas(400);
            Bebida bebida = new Bebida();
            bebida.setDescricao("Super bebida");
            bebida.setPreco(15.99);
            bebida.setMl(700);
            Sobremesa sobremesa = new Sobremesa();
            sobremesa.setDescricao("Super sobremesa");
            sobremesa.setPreco(19.99);
            sobremesa.setTamanho("Super");

            this.setComboBurguer(burguer);
            this.setComboBebida(bebida);
            this.setComboSobremesa(sobremesa);
        }
    }

    public void printCombo(int tipo){
        if (tipo == 1) {
            System.out.println("Combo Master:\nBurguer: " + this.getComboBurguer() + "\nBebida: " + this.getComboBebida());
        }
        if (tipo == 2){
            System.out.println("Combo Master:\nBurguer: " + this.getComboBurguer() +
                    "\nBebida: " + this.getComboBebida() +
                    "\nSobremesa: " + this.getComboSobremesa());
        }
    }
}
