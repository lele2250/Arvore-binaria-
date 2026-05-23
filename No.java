public class No {
    private int valor;
    private No esquerdo;
    private No direito;

    public No(int valor) {
        this.valor = valor;
        this.esquerdo = null;
        this.direito = null;
    }

    public int getValor() {
        return valor;
    }

    public No getEsquerdo() {
        return esquerdo;
    }

    public void setEsquerdo(No esquerdo) {
        this.esquerdo = esquerdo;
    }

    public No getDireito() {
        return direito;
    }

    public void setDireito(No direito) {
        this.direito = direito;
    }
}