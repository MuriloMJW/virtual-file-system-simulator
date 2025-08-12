package trabalho.sistema_arquivos;

import java.io.Serializable;
import javax.swing.JProgressBar;

/* Classe Arquivo e seus atributos */
public class Arquivo implements Serializable
{
    private int bloco; //Bloco que o arquivo ocupa
    private byte[] dados;
    private int size;

    
    
    public JProgressBar jb = null;

    
    private static final long serialVersionUID = 1L;
    
    
    public Arquivo(int bloco)
    {
        this.bloco = bloco;
    }
    
    public Arquivo(int bloco, byte[] conteudo)
    {
        this.bloco = bloco;
        this.dados = conteudo;
        this.size = conteudo.length;
    }
    
    public byte[] getDados()
    {
        return dados;
    }
    
    public int getSize()
    {
        return size;
    }
    
    public JProgressBar getJb() 
    {
        return jb;
    }
    
    public void setJb(JProgressBar jb) 
    {
        this.jb = jb;
    }
    
    public int getBloco()
    {
        return bloco;
    }
}
