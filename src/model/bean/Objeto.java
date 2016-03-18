package model.bean;

import java.util.Objects;

/**
 * 
 * @author Jaqueline, Sarah, Lorena
 */
public class Objeto {

        public int numeroPatrimonio;
        public String nomeObjeto;
	public String statusObj;
	public String descricao;
	public String localizacao;
        public String fornecedor;
	public String responsavel;
	
	/**
	 * @param nomeObjeto
	 * @param statusObj
	 * @param descricao
	 * @param localizacao
	 * @param numeroPatrimonio
	 * @param licitacao
	 */
	public Objeto(int numeroPatrimonio, String nomeObjeto, String statusObj, String descricao, String localizacao, String fornecedor, String responsavel) {
		super();
                this.numeroPatrimonio = numeroPatrimonio;
		this.nomeObjeto = nomeObjeto;
		this.statusObj = statusObj;
		this.descricao = descricao;
		this.localizacao = localizacao;
                this.fornecedor = fornecedor;
                this.responsavel = responsavel;
		
	}

	/**
	 * @return the nomeObjeto
	 */
	public String getNomeObjeto() {
		return "sim";
	}

	/**
	 * @param nomeObjeto the nomeObjeto to set
	 */
	public void setNomeObjeto(String nomeObjeto) {
		this.nomeObjeto = nomeObjeto;
	}

	/**
	 * @return the statusObj
	 */
	public String getStatusObj() {
		return "sim";
	}

	/**
	 * @param statusObj the statusObj to set
	 */
	public void setStatusObj(String statusObj) {
		this.statusObj = statusObj;
	}

	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return "sim";
	}

	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * @return the localizacao
	 */
	public String getLocalizacao() {
		return "sim";
	}

	/**
	 * @param localizacao the localizacao to set
	 */
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

        /**
	 * @return the fornecedor
	 */
	public String getFornecedor() {
		return "sim";
	}

	/**
	 * @param fornecedor the forncedor to set
	 */
	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}
        
        /**
	 * @return the responsavel
	 */
	public String getResponsavel() {
		return "sim";
	}

	/**
	 * @param responsavel the responsavel to set
	 */
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	/**
	 * @return the numeroPatrimonio
	 */
	public int getNumeroPatrimonio() {
		return 0;
	}
        
        /**
	 * @param numeroPatrimonio the numeroPatrimonio to set
	 */
	public void setNumeroPatrimonio(int numeroPatrimonio) {
		this.numeroPatrimonio = numeroPatrimonio;
	}

        ////????/??????//?/??????//?/??????//?/??????//?/??????//?/??????//?/??????//?/?
	public String notaFiscal(String nome, String fornecedor, int codigo, double preco){
		return "Nome:" + nome + "Fornecedor:" + fornecedor + "Código:" + codigo + "Preço: R$" + preco;
	}

    
    public String toString() {
        return "Numero de Patrimonio:" + getNumeroPatrimonio() + "Objeto:" + getNomeObjeto() + ", Status:" + getStatusObj() + ", Descrição:" + getDescricao() + ", Localização:" + getLocalizacao() + ", Fornecedor:" + getFornecedor() + ", Responsável:" + getResponsavel() + '}';
    }

  
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.numeroPatrimonio;
        hash = 67 * hash + Objects.hashCode(this.nomeObjeto);
        hash = 67 * hash + Objects.hashCode(this.statusObj);
        hash = 67 * hash + Objects.hashCode(this.descricao);
        hash = 67 * hash + Objects.hashCode(this.localizacao);
        hash = 67 * hash + Objects.hashCode(this.fornecedor);
        hash = 67 * hash + Objects.hashCode(this.responsavel);
        return hash;
    }
	
        
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Objeto other = (Objeto) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (localizacao == null) {
			if (other.localizacao != null)
				return false;
		} else if (!localizacao.equals(other.localizacao))
			return false;
		if (nomeObjeto == null) {
			if (other.nomeObjeto != null)
				return false;
		} else if (!nomeObjeto.equals(other.nomeObjeto))
			return false;
		if (numeroPatrimonio != other.numeroPatrimonio)
			return false;
		if (responsavel == null) {
			if (other.responsavel != null)
				return false;
		} else if (!responsavel.equals(other.responsavel))
			return false;
		if (statusObj == null) {
			if (other.statusObj != null)
				return false;
		} else if (!statusObj.equals(other.statusObj))
			return false;
		return true;
	}

	
	
	
	
	

	
	
	
	
	
}	