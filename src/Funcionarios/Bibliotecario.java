package Funcionarios;

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
        HashSet<Bibliotecario> bibliotecarios = new HashSet<Bibliotecario>();
        bibliotecarios.add(new Bibliotecario("JULIA", 123, "administrador"));
        bibliotecarios.add(new Bibliotecario("VANESSA", 456, "administrador"));

        Iterator<Bibliotecario> iterator = bibliotecarios.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");

        }
    }



    @Override
    public void batePonto() {
        System.out.println("6:00");
    }
}
