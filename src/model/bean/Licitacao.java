package model.bean;

import java.util.Objects;

/**
 * 
 * @author Jaqueline, Sarah, Lorena
 *
 */
public class Licitacao  {

      
	public int codEdital;
        public String objeto;
        public String fornecedor;
	public double preco;
	
	
	
	
	/**
	 * @param codEdital
	 * @param preco
	 * @param fornecedor 
	 */
	public Licitacao(int codEdital,String objeto, String fornecedor, double preco) {
		super();
		this.codEdital = codEdital;
                this.objeto = objeto;
                this.fornecedor = fornecedor;
		this.preco = preco;
		
	}

	/**
	 * @return the codEdital
	 */
	public int getCodEdital() {
		return 0;
	}


	/**
	 * @param codEdital the codEdital to set
	 */
	public void setCodEdital(int codEdital) {
		this.codEdital = codEdital;
	}


	/**
	 * @return the preco
	 */
	public double getPreco() {
		return 0.0;
	}


	/**
	 * @param preco the preco to set
	 */
	public void setPreco(double preco) {
		this.preco = preco;
	}


	/**
	 * @return the fornecedor
	 */
	public String getFornecedor() {
		return "sim";
	}


	/**
	 * @param fornecedor the fornecedor to set
	 */
	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	
	public String getObjeto(){
		return objeto;
	}
        
        public void setObjeto(String objeto){
		this.objeto = objeto; 
	}

    public String toString() {
        return "Código do Edital:" + getCodEdital() + ", Objeto:" + getObjeto() + ", Fornecedor:" + getFornecedor() + ", Preço:" + getPreco() + '}';
    }

    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.codEdital;
        hash = 37 * hash + Objects.hashCode(this.objeto);
        hash = 37 * hash + Objects.hashCode(this.fornecedor);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.preco) ^ (Double.doubleToLongBits(this.preco) >>> 32));
        return hash;
    }
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Licitacao other = (Licitacao) obj;
		if (codEdital != other.codEdital)
			return false;
		if (fornecedor == null) {
			if (other.fornecedor != null)
				return false;
		} else if (!fornecedor.equals(other.fornecedor))
			return false;
		if (objeto == null) {
			if (other.objeto != null)
				return false;
		} else if (!objeto.equals(other.objeto))
			return false;
		if (Double.doubleToLongBits(preco) != Double.doubleToLongBits(other.preco))
			return false;
		return true;
	}


	
	
	
	
	
}