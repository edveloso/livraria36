package br.com.caelum.rest.oauth2;

import java.io.Serializable;

import javax.persistence.Transient;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("session")
public class AcessToken implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Transient
	private String token;


	public boolean isPreenchido(){
		return token != null;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getToken() {
		return token;
	}
	
	
	
	

}
