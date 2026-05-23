public class Arvore {

    private No no;
    private Arvore esq;
    private Arvore dir;

    public Arvore() {
        this.no = null;
        this.esq = null;
        this.dir = null;
    }

    public Arvore(No no) {
        this.no = no;
        this.esq = null;
        this.dir = null;
    }

    public boolean isEmpty() {
        return this.no == null;
    }

    public void inserir(No novo) {

        if (isEmpty()) {

            this.no = novo;

        } else {

            Arvore novaArvore = new Arvore(novo);

            if (novo.getValor() < this.no.getValor()) {

                if (this.esq == null) {

                    this.esq = novaArvore;

                    System.out.println("Folha: " + novo.getValor() +" à esquerda de " +this.no.getValor() );

                } else {

                    this.esq.inserir(novo);

                }

            } else if (novo.getValor() > this.no.getValor()) {

                if (this.dir == null) {

                    this.dir = novaArvore;

                    System.out.println("Folha: " + novo.getValor() + " à direita de " +
                        this.no.getValor());

                } else {

                    this.dir.inserir(novo);

                }
            }
        }
    }
    public boolean buscar(int valor) {

    if (isEmpty()) {
        return false;
 }

    if (valor == this.no.getValor()) {
        return true;
    }

    if (valor < this.no.getValor()) {

        if (this.esq == null) {
            return false;
        }

        return this.esq.buscar(valor);

    } else {

        if (this.dir == null) {
            return false;
        }

        return this.dir.buscar(valor);
    }
}
}