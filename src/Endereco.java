import java.util.Objects;

public class Endereco {
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;

    public String getCep() {
        return cep;
    }

    @Override
    public String toString() {

        if (Objects.equals(this.complemento, "")) {
            this.complemento = "Sem complemento.";
        } else if (this.cep == null) {
            throw new CepNaoEncontradoException("CEP não foi encontrado.");
        }
        return "\nEndereço:" +
                "\nCep = " + cep +
                "\nLogradouro = " + logradouro +
                "\nComplemento = " + complemento +
                "\nBairro = " + bairro +
                "\nLocalidade = " + localidade +
                "\nUF = " + uf;
    }
}