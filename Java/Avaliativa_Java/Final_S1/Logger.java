import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.BufferedWriter;

public class Logger {
    private static final String LOG_FILE_PATH = "log.txt";

    public void registrarLog(String mensagem) {
        // Formatar a data e hora atual para adicionar ao log
        DateTimeFormatter formatoTempo = DateTimeFormatter.ofPattern("dd-MM-yyyy " + "HH:mm:ss");
        String tempo = LocalDateTime.now().format(formatoTempo);
        // Adiciona a mensagem ao log junto com seu tempo.
        String logMensagem = "[" + tempo + "] " + mensagem;
        //
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(LOG_FILE_PATH, true))) {
            bw.write(logMensagem);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}