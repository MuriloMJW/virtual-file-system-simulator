package trabalho.sistema_arquivos;

import java.io.Serializable;


/* Estrutura da classe Index */
public class IndexStruct implements Serializable
{
    private int bloco;
    private long size;

    public int getBloco()
    {
        return bloco;
    }

    public long getSize()
    {
        return size;
    }

    public IndexStruct(int bloco, long size)
    {
        this.bloco = bloco;
        this.size = size;
    }
    
    
}
