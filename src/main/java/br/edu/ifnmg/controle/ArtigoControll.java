
package br.edu.ifnmg.controle;
import java.util.List;
import br.edu.ifnmg.modelo.Artigo;
import br.edu.ifnmg.dados.ArtigoDAO;
/**
 *
 * @author Zelia
 */
public class ArtigoControll {
    public void cadastrarArtigo(Artigo artigo){
        ArtigoDAO.adicionarArtigo(artigo);
    }

    public Artigo buscarArtigo(String tituloArtigo) {
            return ArtigoDAO.buscarArtigo(tituloArtigo);
    }
    
    public List<Artigo> buscarTodosArtigos(){
        return ArtigoDAO.buscarTodosArtigos();
    }
}
