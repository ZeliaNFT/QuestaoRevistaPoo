
package br.edu.ifnmg.dados;
import br.edu.ifnmg.modelo.Edicao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 *
 * @author Zelia
 */
public class EdicaoDAO {
    private static Map<String,Edicao> edicoes = new HashMap<>();
    
    public static void adicionarEdicao(Edicao edicao){
        edicoes.put(edicao.getDataEdicao(), edicao);
    }

    public static Edicao buscarEdicao(String dataEdicao) {
        Edicao edicao = edicoes.get(dataEdicao);
        
        return edicao;
    }
    
    public static List<Edicao> buscarTodosEdicoes(){
        return new ArrayList<>(edicoes.values());
    }
    
}