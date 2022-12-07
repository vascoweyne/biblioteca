package Sistema.Pessoa.Clientes;

import java.util.HashSet;
import java.util.Iterator;

public class Cliente {
    String nome;
    int id;

    public Cliente(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public Cliente() {
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                '}';
    }

    public void identificaCliente() {
        HashSet<Cliente> clientes = new HashSet<Cliente>();
        clientes.add(new Cliente("Jessica", 5834));
        clientes.add(new Cliente("Lara", 7898));

        Iterator<Cliente> iterator = clientes.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");

        }
    }
}
