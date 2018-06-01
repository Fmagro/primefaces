package it.daguanno.corso.controller.beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class WrapperBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@ManagedProperty("#{autoCompleteBean}")
	private AutoCompleteBean autoCompleteBean;
	private boolean nascosto;
	private long count;

	public void init() {
		nascosto = false;
		count = 0L;
	}
	
	public void stampa() {
		
		System.out.println(this);
	}

	public void counter() {
		count++;
	}
	
	public void mostra() {
		setNascosto(true);
	}
	
	@Override
	public String toString() {
		return "WrapperBean [autoCompleteBean=" + autoCompleteBean + "]";
	}



	public boolean isNascosto() {
		return nascosto;
	}



	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	public void setNascosto(boolean nascosto) {
		this.nascosto = nascosto;
	}



	public AutoCompleteBean getAutoCompleteBean() {
		return autoCompleteBean;
	}

	public void setAutoCompleteBean(AutoCompleteBean autoCompleteBean) {
		this.autoCompleteBean = autoCompleteBean;
	}
	
	
	


	
	
}
