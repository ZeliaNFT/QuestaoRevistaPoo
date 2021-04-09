
package br.edu.ifnmg.dados;
import br.edu.ifnmg.modelo.Artigo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 *
 * @author Zelia
 */
public class ArtigoDAO {
    private static Map<String,Artigo> artigos = new HashMap<>();
    
    public static void adicionarArtigo(Artigo artigo){
        artigos.put(artigo.getTituloArtigo(), artigo);
    }

    public static Artigo buscarArtigo(String tituloArtigo) {
        Artigo artigo = artigos.get(tituloArtigo);
        
        return artigo;
    }
     public static List<Artigo> buscarTodosArtigos(){
        return new ArrayList<>(artigos.values());
    }
    
  
}


