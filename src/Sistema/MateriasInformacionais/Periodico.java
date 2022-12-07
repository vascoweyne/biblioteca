package Sistema.MateriasInformacionais;

import java.util.ArrayList;
import java.util.Scanner;

public class Periodico extends MaterialInformacional implements exibeM{
    public Periodico(int codigoDeBarra, int numeroDaEstante, int exemplares, int exemplaresDisponivel, String nome) {
        super(codigoDeBarra, numeroDaEstante, exemplares, exemplaresDisponivel, nome);
    }

    public Periodico() {
    }

    @Override
    public String toString() {
        return "Periodico{" +
                "codigoDeBarra=" + codigoDeBarra +
                ", numeroDaEstante=" + numeroDaEstante +
                ", exemplares=" + exemplares +
                ", exemplaresDisponivel=" + exemplaresDisponivel +
                ", nome='" + nome + '\'' +
                '}';
    }

    @Override
    public void cadastroMaterial() {
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < 1000; i++) {
            System.out.println("realize o cadastro");
            System.out.println("digite o codigo de barra");
            codigoDeBarra = entrada.nextInt();
            System.out.println("digite o numero da estante");
            numeroDaEstante = entrada.nextInt();
            System.out.println("digite o numero de exemplares");
            exemplares = entrada.nextInt();
            System.out.println("digite o numero de  exemplares disponivel");
            exemplaresDisponivel = entrada.nextInt();
            System.out.println("digite o nome");
            nome = entrada.nextLine();
            ArrayList<Periodico> periodicos = new ArrayList<>();
            Periodico p = new Periodico(codigoDeBarra, numeroDaEstante, exemplares, exemplaresDisponivel, nome);
            periodicos.add(p);
            for (int j = 0; j < periodicos.size(); j++) {
                System.out.println(periodicos.get(j));
            }
        }
    }

    @Override
    public void exibeM() {

    }
}
