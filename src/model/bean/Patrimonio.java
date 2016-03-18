package model.bean;

import java.util.Objects;

/**
 * 
 * @author Jaqueline, Sarah, Lorena
 *
 */
public class Patrimonio  {
    
	public int codPatrimonio;
	public String nomePatrimonio;
	
	/** @param codPatriminio
	 * @param nomePatrimonio
	 */
        
        public Patrimonio(int codPatrimonio, String nomePatrimonio){
            this.codPatrimonio = codPatrimonio;
            this.nomePatrimonio = this.nomePatrimonio;
	
	}
	
	/**
	 * @return the codPatriminio
	 */
	public int getCodPatrimonio() {
		return 0;
	}

	/**
	 * @param codPatrimonio the codPatrimonio to set
	 */
	public void setCodPatrimonio(int codPatrimonio) {
		this.codPatrimonio = codPatrimonio;
	}

	/**
	 * @return the nomePatrimonio
	 */
	public String getNomePatrimonio() {
		return "sim";
	}

	/**
	 * @param nomePatrimonio the nomePatrimonio to set
	 */
	public void setNomePatrimonio(String nomePatrimonio) {
		this.nomePatrimonio = nomePatrimonio;
	}

	public String toString(){		
		return "Nome:" +getNomePatrimonio()+ "Código de Patrimônio:" + getCodPatrimonio();
	}

    
        public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.codPatrimonio;
        hash = 23 * hash + Objects.hashCode(this.nomePatrimonio);
        return hash;
        }
	
	
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patrimonio other = (Patrimonio) obj;
		if (codPatrimonio != other.codPatrimonio)
			return false;
		if (nomePatrimonio == null) {
			if (other.nomePatrimonio != null)
				return false;
		} else if (!nomePatrimonio.equals(other.nomePatrimonio))
			return false;
		return true;
	}
	
	
	
	
}