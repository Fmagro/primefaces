package it.daguanno.corso.controller.beans;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@ManagedBean
@Component
@Scope(value ="view")
public class NewLoginBean {

	private String username;
	private String password;
	private String confPwd;
	private Date nascita;
	private Date inizioStudi;
	private Date fineStudi;

	
	public void insert() {
		System.out.println(this);
		
	}
	
	



	@Override
	public String toString() {
		return "NewLoginBean [username=" + username + ", password=" + password + ", confPwd=" + confPwd + ", nascita="
				+ nascita + ", fineStudi=" + fineStudi + ", inizioStudi=" + inizioStudi + "]";
	}





	public Date getFineStudi() {
		return fineStudi;
	}



	public void setFineStudi(Date fineStudi) {
		this.fineStudi = fineStudi;
	}



	public Date getInizioStudi() {
		return inizioStudi;
	}



	public void setInizioStudi(Date inizioStudi) {
		this.inizioStudi = inizioStudi;
	}



	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfPwd() {
		return confPwd;
	}
	public void setConfPwd(String confPwd) {
		this.confPwd = confPwd;
	}
	public Date getNascita() {
		return nascita;
	}
	public void setNascita(Date nascita) {
		this.nascita = nascita;
	}
	
	
}
