package br.com.caelum.livraria.rest;

import java.io.Serializable;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;

import br.com.caelum.livraria.modelo.Link;
import br.com.caelum.livraria.modelo.Pagamento;
import br.com.caelum.livraria.modelo.Transacao;

@Component
@Scope("request")
public class ClienteRest implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private static final String SERVER_URI = "http://localhost:8080/payfast";

	private static final String ENTRY_POINT = "/pagamentos/";

	public Pagamento criarPagamento(Transacao transacao) {
		Client client = ClientBuilder.newClient();
		Pagamento pagamento = client.target(SERVER_URI+ENTRY_POINT)
				.request()
				.buildPost(Entity.json(transacao))
				.invoke(Pagamento.class);
		return pagamento;
	}

	public Pagamento confirmarPagamento(Pagamento pagamento) {
		Link linkConfirmar = pagamento.getLinkPeloRel("confirmar");
		Client client = ClientBuilder.newClient();
		Pagamento pag = client.target(SERVER_URI+linkConfirmar.getUri())
				.request()
				.build(linkConfirmar.getMethod())
				.invoke(Pagamento.class);
		return pag;
	}

}
