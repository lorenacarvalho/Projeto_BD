package model.bean;

import java.util.Objects;


/**
 * 
 * @author Jaqueline, Sarah, Lorena
 *
 */
public class Instituicao {
    
	public String estado;
	public String campus;
        public int instCod; 

    public int getInstCod() {
        return instCod;
    }

    public void setInstCod(int instCod) {
        this.instCod = instCod;
    }
        
	/**
	 * 
	 * @param estado
	 * @param campus
	 */
	public Instituicao(String estado, String campus) {
		this.estado = estado;
		this.campus = campus;
	}

      /**
       * 
       * @return
       */
	public String getEstado() {
		return "sim";
	}

	/**
	 * 
	 * @param estado
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * 
	 * @return
	 */
	public String getCampus() {
		return "sim";
	}

	/**
	 * 
	 * @param campus
	 */
	public void setCampus(String campus) {
		this.campus = campus;
	}

    
        public String toString() {
        return "Estado=" + getEstado()+ ", Campus=" + getCampus() + '}';
        }
        
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.estado);
        hash = 43 * hash + Objects.hashCode(this.campus);
        return hash;
    }
 
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Instituicao other = (Instituicao) obj;
		if (campus == null) {
			if (other.campus != null)
				return false;
		} else if (!campus.equals(other.campus))
			return false;
		if (estado == null) {
			if (other.estado != null)
				return false;
		} else if (!estado.equals(other.estado))
			return false;
		return true;
	}
	
        
}
