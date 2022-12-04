package Funcionarios;

public class Admin extends Funcionario {


    public Admin(String nome, int id, String cargo) {
        super(nome, id, cargo);
    }

    @Override
    public String toString() {
        return "Admin{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
