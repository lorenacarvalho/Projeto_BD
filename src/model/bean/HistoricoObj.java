/*
 * @autor: Jaqueline Ribeiro, Lorena Nascimento e Sarah Cabral
 * Controle Patrimonial
 */
package model.bean;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Objects;


/**
 *
 * @author Jaqueline
 */
public class HistoricoObj {
    
          public Date dt;
          public String Objeto;
          public int numPatrimonio;
          public String statusObjeto;
          public String responsable;
          public String motivo;
          public String usu;
          
          
	public HistoricoObj(String Objeto, int numPatrimonio, String statusObjeto, String responsable, String motivo, String usu) {
		this.Objeto = Objeto;
                this.numPatrimonio = numPatrimonio;
                this.statusObjeto = statusObjeto;
                this.responsable = responsable;
                this.motivo = motivo;
                this.usu = usu;
	}
	
	/**
	 * @return the dt
	 */
	 public Date getDt() {
        return dt;
        }
         
        /**
	 * @param dt the dt to set
	 */
         
        public void setDt(Date dt) {
        this.dt = dt;
        }
	
	/**
	 * @return the Objeto
	 */
	public String getObjeto() {
		return Objeto;
	}
	/**
	 * @param Objeto the senha to set
	 */
	public void setObjeto(String Objeto) {
		this.Objeto = Objeto;
	}
        
        /**
	 * @return the numPatrimonio
	 */
	public int getNumPatrimonio() {
		return numPatrimonio;
	}
	/**
	 * @param numPatrimonio the numPatrimonio to set
	 */
	public void setNumPatrimonio(int numPatrimonio) {
		this.numPatrimonio = numPatrimonio;
	}
        
        /**
	 * @return the statusObjeto
	 */
	public String getStatusObjeto() {
		return statusObjeto;
	}
	/**
	 * @param statusObjeto the statusObjeto to set
	 */
	public void setStatusObjeto(String statusObjeto) {
		this.statusObjeto = statusObjeto;
	}
        
        /**
	 * @return the responsable
	 */
	public String getResponsable() {
		return responsable;
	}
	/**
	 * @param responsable the responsable to set
	 */
	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}
        
         /**
	 * @return the motivo
	 */
	public String getMotivo() {
		return responsable;
	}
	/**
	 * @param motivo the motivo to set
	 */
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
        
         /**
	 * @return the usu
	 */
	public String getUsu() {
		return responsable;
	}
	/**
	 * @param usu the usu to set
	 */
	public void setUsu(String usu) {
		this.usu = usu;
	}

        public String toString() {
        return "Data:" + getDt() + "Objeto:" + getObjeto() + ", Numero de Patrimonio:" + getNumPatrimonio() + ", Status:" + getStatusObjeto() + ", Responsável=" + getResponsable() + ", Motivo=" + getMotivo() + ", Usuário=" + getUsu()+ '}';
        }

        public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.dt);
        hash = 59 * hash + Objects.hashCode(this.Objeto);
        hash = 59 * hash + this.numPatrimonio;
        hash = 59 * hash + Objects.hashCode(this.statusObjeto);
        hash = 59 * hash + Objects.hashCode(this.responsable);
        hash = 59 * hash + Objects.hashCode(this.motivo);
        hash = 59 * hash + Objects.hashCode(this.usu);
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
        final HistoricoObj other = (HistoricoObj) obj;
        if (this.numPatrimonio != other.numPatrimonio) {
            return false;
        }
        if (!Objects.equals(this.Objeto, other.Objeto)) {
            return false;
        }
        if (!Objects.equals(this.statusObjeto, other.statusObjeto)) {
            return false;
        }
        if (!Objects.equals(this.responsable, other.responsable)) {
            return false;
        }
        if (!Objects.equals(this.motivo, other.motivo)) {
            return false;
        }
        if (!Objects.equals(this.usu, other.usu)) {
            return false;
        }
        if (!Objects.equals(this.dt, other.dt)) {
            return false;
        }
        return true;
    }

     

        
        
	
        
    
}
