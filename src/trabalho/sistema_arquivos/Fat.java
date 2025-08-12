package trabalho.sistema_arquivos;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JProgressBar;

public class Fat extends Arquivo
{
    private int cluster;
    private List<Integer> listaBlocosLivres;
    private List<FatStruct> indexList;
    private int totalIds;
    
    /* Classe da tabela FAT */
    public Fat(int bloco, int cluster)
    {
        super(bloco);
        indexList = new ArrayList<FatStruct>();
        this.cluster = cluster;
        this.listaBlocosLivres = new ArrayList<Integer>();
        this.totalIds = 0;
        
        int aux = (cluster == 32000) ? 1024 : 512;
        for(int i = 1; i < aux; i++)
        {
            this.listaBlocosLivres.add(i);
        }
    }
    
    protected int totalBlocosLivres()
    {
        return this.listaBlocosLivres.size();
    }
    
    protected void addIndex(FatStruct index)
    {
        this.totalIds++;
        this.indexList.add(index);
    }
    
    protected void removeIndex(FatStruct index)
    {
        this.indexList.remove(index);
    }
    
    protected int getCluster()
    {
        return this.cluster;
    }
    
    protected List<Integer> getListaBlocosLivres()
    {
        return listaBlocosLivres;
    }
    
    protected void inserirListaBlocosLivres(int valor)
    {
        this.listaBlocosLivres.add(valor);
    }
    
    protected void removerListaBlocosLivres(int valor)
    {
        this.listaBlocosLivres.remove(valor);
    }
    
    protected List<FatStruct> getIndexList()
    {
        return indexList;
    }
    
    protected int getTotalIds()
    {
        return this.totalIds;
    }
    
}
