package trabalho.sistema_arquivos;

import java.util.List;
import java.util.ArrayList;
import javax.swing.JProgressBar;

/* Classe Index com a lista de blocos apontadas pelo mesmo */

public class Index extends Arquivo
{
    private List<IndexStruct> blocoList;
    
    public Index(int bloco)
    {
        super(bloco);
        this.blocoList = new ArrayList<IndexStruct>();
        
    }
    
    protected void addBloco(IndexStruct bloco)
    {
        this.blocoList.add(bloco);
    }
    
    protected int getTotalBlocos()
    {
        return this.blocoList.size();
    }

    protected List<IndexStruct> getBlocos()
    {
        return this.blocoList;
    }
    
    

}
