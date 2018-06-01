package it.daguanno.corso.controller.beans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import org.primefaces.context.RequestContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@ManagedBean
@Component
@Scope(value = "application")
public class ChatBean {

	private String messaggio;
	private List<String> listaMsg;

	@PostConstruct
	public void init() {
		listaMsg = new ArrayList<>();
	}

	public void aggiungi() {
		if (messaggio != null || !messaggio.equals("")) {
			this.listaMsg.add(messaggio);
		}
	}

	public String nomeACaso() {
		RequestContext.getCurrentInstance().execute("clear();");
		
		return "spedizioneMail";
	}
	
	public String getMessaggio() {
		return messaggio;
	}

	public void setMessaggio(String msg) {
		this.messaggio = msg;
	}

	public List<String> getListaMsg() {
		return listaMsg;
	}

	public void setListaMsg(List<String> listaMsg) {
		this.listaMsg = listaMsg;
	}

}
