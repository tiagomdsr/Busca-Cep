import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Digite o cep que deseja buscar: ");
                String busca = leitura.nextLine();

                ConsultaCep consultaCep = new ConsultaCep();
                Endereco meuEndereco = consultaCep.buscaEndereco(busca);

                System.out.println(meuEndereco);

                GeradorDeArquivo gerador = new GeradorDeArquivo();
                gerador.geraJson(meuEndereco);

                break;
            } catch (RuntimeException | IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}