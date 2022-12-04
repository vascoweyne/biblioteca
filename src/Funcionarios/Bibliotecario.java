package Funcionarios;

public class Bibliotecario extends Funcionario implements Emprestimo {
    public Bibliotecario(String nome, int id, String cargo) {
        super(nome, id, cargo);
    }

    @Override
    public String toString() {
        return "Bibliotecario{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                ", cargo='" + cargo + '\'' +
                '}';
    }

    @Override
    public void emprestaMaterial() {

    }
}
