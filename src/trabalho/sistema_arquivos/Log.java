package trabalho.sistema_arquivos;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTextArea;
import javax.swing.text.BadLocationException;

/* Classe para executar a função de log, mostrando informações sobre as atividades dos processos que estão sendo realizados */
public class Log
{

    private JTextArea logPanel;

    public Log(JTextArea logPanel)
    {
        super();
        this.logPanel = logPanel;
    }

    public void inserirLog(String log)
    {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        logPanel.setText(logPanel.getText().concat("[" + sdf.format(new Date()) + "] ").concat(log).concat("\n"));

        try
        {
            logPanel.setCaretPosition(logPanel.getLineStartOffset(logPanel.getLineCount() - 1));
        }
        catch (BadLocationException e)
        {
            e.printStackTrace();
        }
    }

}
