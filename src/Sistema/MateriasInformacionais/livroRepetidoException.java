package Sistema.MateriasInformacionais;


import java.util.Scanner;

public class livroRepetidoException extends Exception {

    public livroRepetidoException() {
        System.out.println("Livro ja cadastrado! Favor cadastrar outro");
    }
    public livroRepetidoException(String message) {
       super(message);
    }
    public static boolean isLivroValido()throws  livroRepetidoException{
        System.out.println("digite outro livro");
        String r= Scanner.nextLine();
        for(Livro livro: livros)
    }

}