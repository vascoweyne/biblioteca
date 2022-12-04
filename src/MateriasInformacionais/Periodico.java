package MateriasInformacionais;

import java.util.Scanner;

public class Periodico extends MaterialInformacional implements Cadastro {
    public Periodico(int codigoDeBarra, int numeroDaEstante, int exemplares, int exemplaresDisponivel, String nome) {
        super(codigoDeBarra, numeroDaEstante, exemplares, exemplaresDisponivel, nome);
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
        }
    }
}
