
package br.edu.ifnmg.modelo;
import java.util.Objects;
/**
 *
 * @author Zelia
 */
public abstract class Artigo implements Comparable<Artigo>{
    private String tituloArtigo;
    private String nomeAutor;

  public Artigo(String tituloArtigo, String nomeAutor){
      this.nomeAutor= nomeAutor;
      this.tituloArtigo= tituloArtigo;
  }
    public String getTituloArtigo() {
        return tituloArtigo;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.getTituloArtigo());
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
            final Artigo other = (Artigo) obj;
        if (!Objects.equals(this.tituloArtigo, other.tituloArtigo)) {
            return false;
        }
        return true;
    }
    @Override
    public int compareTo(Artigo artigo){
        
        return this.getTituloArtigo().compareToIgnoreCase(artigo.getTituloArtigo());
    }
    
}
