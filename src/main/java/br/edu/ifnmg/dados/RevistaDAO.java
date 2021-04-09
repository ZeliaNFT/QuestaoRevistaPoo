
package br.edu.ifnmg.dados;
import br.edu.ifnmg.modelo.RevistaCientifica;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 *
 * @author Zelia
 */
public class RevistaDAO {
    private static Map<String,RevistaCientifica> revistasCientificas = new HashMap<>();
    
    public static void adicionarRevista(RevistaCientifica revistaCientifica){
        revistasCientificas.put(revistaCientifica.getTituloRevista(), revistaCientifica);
    }

    public static RevistaCientifica buscarRevista(String tituloRevista) {
        RevistaCientifica revistaCientifica = revistasCientificas.get(tituloRevista);
        
        return revistaCientifica;
    }
    public static List<RevistaCientifica> buscarTodosRevistas(){
        return new ArrayList<>(revistasCientificas.values());
    }
  
}
  

