
package br.edu.ifnmg.modelo;
import java.util.Objects;
/**
 *
 * @author Zelia
 */
public abstract class RevistaCientifica implements Comparable<RevistaCientifica>  {
    private String tituloRevista;
    private String issn;
    private String periodicidade;
    
    public RevistaCientifica(String tituloRevista, String issn, String periodicidade){
        this.tituloRevista = tituloRevista;
        this.issn = issn;
        this.periodicidade= periodicidade;
       
    }

    
    public String getTituloRevista() {
        return tituloRevista;
    }
    
    public String getIssn() {
        return issn;
    }
    
    public String getPeriodicidade() {
        return periodicidade;
    }
    
    
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.getTituloRevista());
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
        final RevistaCientifica other = (RevistaCientifica) obj;
        if (!Objects.equals(this.tituloRevista, other.tituloRevista)) {
            return false;
        }
        return true;
    }
    @Override
    public int compareTo(RevistaCientifica revistaCientifica){
        
        return this.getTituloRevista().compareToIgnoreCase(revistaCientifica.getTituloRevista());
    }

    
}
