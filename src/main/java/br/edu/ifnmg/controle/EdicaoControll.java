
package br.edu.ifnmg.controle;
import java.util.List;
import br.edu.ifnmg.modelo.Edicao;
import br.edu.ifnmg.dados.EdicaoDAO;
/**
 *
 * @author Zelia
 */
public class EdicaoControll {
    
    public void cadastrarEdicao(Edicao edicao){
        EdicaoDAO.adicionarEdicao(edicao);
    }

    public Edicao buscarEdicao(String dataEdicao) {
            return EdicaoDAO.buscarEdicao(dataEdicao);
    }
    
    public List<Edicao> buscarTodosEdicoes(){
        return EdicaoDAO.buscarTodosEdicoes();
    }
}
