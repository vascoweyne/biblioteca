package MateriasInformacionais;

public abstract class MaterialInformacional  {
    protected int codigoDeBarra;
    protected int numeroDaEstante;
    protected int exemplares;
    protected int exemplaresDisponivel;
    protected String nome;

    public MaterialInformacional(int codigoDeBarra, int numeroDaEstante, int exemplares, int exemplaresDisponivel, String nome) {
        this.codigoDeBarra = codigoDeBarra;
        this.numeroDaEstante = numeroDaEstante;
        this.exemplares = exemplares;
        this.exemplaresDisponivel = exemplaresDisponivel;
        this.nome = nome;
    }

    public MaterialInformacional() {
    }
}
