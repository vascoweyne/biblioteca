package Sistema.MateriasInformacionais;


public class livroRepetidoException extends Exception {

    public livroRepetidoException() {
        super("Livro ja cadastrado! Favor cadastrar outro");
    }

}