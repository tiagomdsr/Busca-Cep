import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GeradorDeArquivo {
    public void geraJson(Endereco endereco) throws IOException {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        File diretorio = new File("./CEPs");
        if (!diretorio.exists()) {
            diretorio.mkdir();
        }

        FileWriter escrita = new FileWriter("./CEPs/" + endereco.getCep() + ".json");
        escrita.write(gson.toJson(endereco));
        escrita.close();
    }
}