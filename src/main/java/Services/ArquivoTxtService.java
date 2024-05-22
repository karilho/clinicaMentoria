package Services;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ArquivoTxtService {

    public void criarArquivoTxt(String prefixo, String nome, String conteudo)  {
        String cadastroDeCidadoes = prefixo + nome + ".txt";
        Path path = Path.of(cadastroDeCidadoes);

        try{
            if (Files.notExists(path)) {
                Files.createFile(path);
            }
        } catch (IOException e) {
            System.out.println("Erro ao criar o arquivo: " + e.getMessage());
        }

        try (FileWriter salvarCidadao = new FileWriter(path.toFile())) {
            salvarCidadao.write(conteudo);
            System.out.println("Arquivo salvo com sucesso! " + cadastroDeCidadoes);
        } catch (IOException e) {
            System.out.println("Erro ao salvar o arquivo: " + e.getMessage());
        }
    }
}
