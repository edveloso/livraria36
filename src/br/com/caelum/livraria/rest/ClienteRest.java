package br.com.caelum.livraria.rest;

import java.io.Serializable;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import br.com.caelum.livraria.modelo.Link;
import br.com.caelum.livraria.modelo.Pagamento;
import br.com.caelum.livraria.modelo.Transacao;
import br.com.caelum.rest.oauth2.AcessToken;

@Component
@Scope("request")
public class ClienteRest implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private static final String SERVER_URI = "http://localhost:8080/payfast";

	private static final String ENTRY_POINT = "/pagamentos/";
	
	@Autowired
	private AcessToken acessToken;

	public Pagamento criarPagamento(Transacao transacao) {
		Client client = ClientBuilder.newClient();
		Pagamento pagamento = client.target(SERVER_URI+ENTRY_POINT)
				.request()
				.header("Authorization","Bearer "+ acessToken.getToken())
				.buildPost(Entity.json(transacao))
				.invoke(Pagamento.class);
		return pagamento;
	}

	public Pagamento confirmarPagamento(Pagamento pagamento) {
		Link linkConfirmar = pagamento.getLinkPeloRel("confirmar");
		Client client = ClientBuilder.newClient();
		Pagamento pag = client.target(SERVER_URI+linkConfirmar.getUri())
				.request()
				.header("Authorization","Bearer"+ acessToken.getToken())
				.build(linkConfirmar.getMethod())
				.invoke(Pagamento.class);
		return pag;
	}

	public AcessToken getAcessToken() {
		return acessToken;
	}

	public void setAcessToken(AcessToken acessToken) {
		this.acessToken = acessToken;
	}

}
