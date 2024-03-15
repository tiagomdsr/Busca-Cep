public class CepNaoEncontradoException extends RuntimeException {

    private final String menssagem;

    public CepNaoEncontradoException(String menssagem) {
        this.menssagem = menssagem;
    }

    @Override
    public String getMessage() {
        return menssagem;
    }
}