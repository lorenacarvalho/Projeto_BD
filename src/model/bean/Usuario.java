package model.bean;

import java.util.Objects;

/**
 * 
 * @author Jaqueline, Lorena, Sarah
 *
 */
public class Usuario {

        public String nickname;
	public String senha;
	
	public Usuario(String nickname, String senha) {
		this.nickname = nickname;
		this.senha = senha;
	}
	
	/**
	 * @return the nickname
	 */
	public String getNickname() {
		return nickname;
	}
	/**
	 * @param nickname the nickname to set
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	/**
	 * @return the senha
	 */
	public String getSenha() {
		return senha;
	}
	/**
	 * @param senha the senha to set
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}

    
        public String toString() {
        return "Nick:" + getNickname() + ", Senha:" + getSenha();
        }


        public int hashCode() {
        int hash = 5;
        hash = 31 * hash + Objects.hashCode(this.nickname);
        hash = 31 * hash + Objects.hashCode(this.senha);
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
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.nickname, other.nickname)) {
            return false;
        }
        if (!Objects.equals(this.senha, other.senha)) {
            return false;
        }
        return true;
    }
	
	
	
	

	
}
