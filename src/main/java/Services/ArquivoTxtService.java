package Services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class ArquivoTxtService {

    public void criarArquivoTxt () throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path path = Path.of("C:\\Users\\icarodazini\\Documents\\Java\\ClinicaMentoria\\clinicaMentoria\\texto.txt");

        if (Files.notExists(path)){
            Files.createFile(path);
        }

        System.out.println("DIGITE O TEXTO PARA SER ARMAZENADO DENTRO DO ARQUIVO");
        String texto = scanner.nextLine();

        Files.writeString(path, texto);
        System.out.println("TEXTO ARMAZENADO COM SUCESSO NO ARQUIVO");

        try {
            criarArquivoTxt();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
