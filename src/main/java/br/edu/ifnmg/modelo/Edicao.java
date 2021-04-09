
package br.edu.ifnmg.modelo;
import java.util.Objects;
/**
 *
 * @author Zelia
 */
public abstract class Edicao implements Comparable<Edicao> {
    private int numeroEdicao;
    private int volumeEdicao;
    private String dataEdicao;

  public Edicao (int numeroEdicao, int  volumeEdicao, String dataEdicao){
      this.numeroEdicao = numeroEdicao;
      this.volumeEdicao = volumeEdicao;
      this.dataEdicao= dataEdicao;
  }
    public int getNumeroEdicao() {
        return numeroEdicao;
    }

    public int getVolumeEdicao() {
        return volumeEdicao;
    }

    public String getDataEdicao() {
        return dataEdicao;
    }
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.getDataEdicao());
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
        final Edicao other = (Edicao) obj;
        if (!Objects.equals(this.dataEdicao, other.dataEdicao)) {
            return false;
        }
        return true;
    }
    @Override
    public int compareTo(Edicao edicao){
        
        return this.getDataEdicao().compareToIgnoreCase(edicao.getDataEdicao());
    }
    
}
