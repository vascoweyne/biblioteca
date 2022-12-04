package MateriasInformacionais;

import java.util.ArrayList;
import java.util.Scanner;

public class MaterialEspecial extends MaterialInformacional implements Cadastro {
    private String tipo;


    public MaterialEspecial() {
    }

    public MaterialEspecial(int codigoDeBarra, int numeroDaEstante, int exemplares, int exemplaresDisponivel, String nome, String tipo) {
        super(codigoDeBarra, numeroDaEstante, exemplares, exemplaresDisponivel, nome);
        this.tipo = tipo;
    }


    @Override
    public String toString() {
        return "MaterialEspecial{" +
                "tipo='" + tipo + '\'' +
                ", codigoDeBarra=" + codigoDeBarra +
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
            entrada.nextLine();
            System.out.println("digite a tipo ");
            tipo = entrada.nextLine();

            ArrayList <MaterialEspecial> materialEspecials = new ArrayList<>();
            MaterialEspecial me = new MaterialEspecial(codigoDeBarra, numeroDaEstante, exemplares,exemplaresDisponivel, nome, tipo);
            materialEspecials.add(me);
            for(int j=0; j < materialEspecials.size(); j++){
                System.out.println(materialEspecials.get(j));
            }
        }
    }
}
