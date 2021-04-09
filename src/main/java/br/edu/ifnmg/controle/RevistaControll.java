
package br.edu.ifnmg.controle;
import java.util.List;
import br.edu.ifnmg.modelo.RevistaCientifica;
import br.edu.ifnmg.dados.RevistaDAO;
/**
 *
 * @author Zelia
 */
public class RevistaControll {
    public void cadastrarRevista(RevistaCientifica revistaCientifica){
        RevistaDAO.adicionarRevista(revistaCientifica);
    }

    public RevistaCientifica buscarRevista(String tituloRevista) {
            return RevistaDAO.buscarRevista(tituloRevista);
    }
    
    public List<RevistaCientifica> buscarTodosRevistas(){
        return RevistaDAO.buscarTodosRevistas();
    }
}
