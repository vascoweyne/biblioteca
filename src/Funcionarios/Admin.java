package Funcionarios;

import Clientes.Cliente;

import java.util.HashSet;
import java.util.Iterator;

public class Admin extends Funcionario implements ExibeFuncionario {


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

    @Override
    public void Exibe() {
        HashSet<Admin> admins = new HashSet<Admin>();
        admins.add(new Admin("JULIA", 123, "administrador"));
        admins.add(new Admin("VANESSA", 456, "administrador"));

        Iterator<Admin> iterator = admins.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }

    @Override
    public void batePonto() {
        System.out.println("8:00");
    }
}
