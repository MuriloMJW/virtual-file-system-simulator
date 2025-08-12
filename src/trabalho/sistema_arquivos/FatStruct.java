package trabalho.sistema_arquivos;

import java.awt.Color;
import java.io.Serializable;


/* Estrutura da classe Fat lista de index apontados */
public class FatStruct implements Serializable
{
    private String nomeArquivo;
    private int bloco;
    private Color cor;
    private int id;
    
    public FatStruct(String nomeArquivo, int bloco, Color cor, int id)
    {
        this.nomeArquivo = nomeArquivo;
        this.bloco = bloco;
        this.cor = cor;
        this.id = id;
    }
    
    public String getNomeArquivo()
    {
        return nomeArquivo;
    }

    public int getBloco()
    {
        return bloco;
    }
    
    public Color getCor()
    {
        return cor;
    }
    
    public int getId()
    {
        return id;
    }

}
