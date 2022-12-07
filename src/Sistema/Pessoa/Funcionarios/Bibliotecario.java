package Sistema.Pessoa.Funcionarios;

import java.util.HashSet;
import java.util.Iterator;

public class Bibliotecario extends Funcionario implements ExibeFuncionario {
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
    public void Exibe() {
        HashSet<Admin> administradores = new HashSet<Admin>();
        administradores.add(new Admin("Caio", 843, "administrador"));
        administradores.add(new Admin("Flavio", 976, "administrador"));

        Iterator<Admin> iterator = administradores.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");

        }
    }



    @Override
    public void batePonto() {
        System.out.println("6:00");
    }
}
