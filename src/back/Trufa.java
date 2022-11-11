package back;

public class Trufa {

    private String sabor;
    private double valor;
    private int estoque;

    public Trufa(String sabor, double valor, int estoque) {
        this.sabor = sabor;
        this.valor = valor;
        this.estoque = estoque;
    }

    // Getters e Setters
    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    @Override // Polimorfismo de Sobrecarga, exibe no console os dados da trufa
    public String toString() {
        return "Trufa{" + "sabor=" + sabor + ", valor=" + valor + ", estoque=" + estoque + '}';
    }

}
