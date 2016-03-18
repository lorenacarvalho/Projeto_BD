/*
 * @autor: Jaqueline Ribeiro, Lorena Nascimento e Sarah Cabral
 * Controle Patrimonial
 */
package model.bean;

import java.util.Objects;

/**
 *
 * @author Jaqueline
 */
public class Concorrente {
 
        public String nomeEmpresa;
        public int idEmpresa;
        public int num;

        public Concorrente(String nomeEmpresa, int idEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
        this.idEmpresa = idEmpresa;
    }
	
	
	/**
	 * @return the NomeEmpresa
	 */
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}
        
        /**
	 * @return the idEmpresa
	 */
	public int getIdEmppresa() {
		return idEmpresa;
	}
	/**
	 * @param nomeEmpresa the nomeEmpresa to set
	 */
	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}
        
        
        /**
	 * @param idEmpresa the idEmpresa to set
	 */
        public void setIdEmpresa(int idEmpresa) {
            this.idEmpresa = idEmpresa;
        }

        
   
        public String toString() {
        return "Nome da Empresa:" + getNomeEmpresa();
        }

    
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.nomeEmpresa);
        hash = 47 * hash + this.idEmpresa;
        return hash;
    }

    
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
        final Concorrente other = (Concorrente) obj;
        if (this.idEmpresa != other.idEmpresa) {
            return false;
        }
        if (!Objects.equals(this.nomeEmpresa, other.nomeEmpresa)) {
            return false;
        }
        return true;
    }
    
    
	
        
    
}
