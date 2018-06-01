package it.daguanno.corso.controller.beans;



import java.util.LinkedList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import it.daguanno.corso.vo.MailVO;

@ManagedBean
@Component
@Scope(value = "view")
public class SpedizioneBean {

	private String da;
	private String a;
	private String cc;
	private String oggetto;
	private String testo;
	private List<MailVO> mails;
	private List<MailVO> arrivateVisualizzate;
	private List<MailVO> arrivate;
	private String ricercaDa;
	private String ricercaOggetto;
	
	@PostConstruct
	public void init() {
		arrivate = new LinkedList<>();
		mails = new LinkedList<>();
		for(int i = 0; i < 1000; i++) {
			arrivate.add(new MailVO(null,"email" + i, "cc" + i, "oggetto" + i,"testo" + i));
			mails.add(new MailVO("email" + i,null, "cc" + i, "oggetto" + i,"testo" + i));
		}
		arrivateVisualizzate  = new LinkedList<>(arrivate);
	}
	
	public void search() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		arrivateVisualizzate.clear();
		for(MailVO mail : arrivate) {
			boolean ins = true;
			if(ricercaDa != null && !mail.getDa().startsWith(ricercaDa)) {
				ins  = false;
			}
			if(ricercaOggetto != null && !mail.getOggetto().startsWith(ricercaOggetto)) {
				ins = false;
			}
			if(ins) {
				arrivateVisualizzate.add(mail);
			}
		}

	}
	
	public void submit() {
		System.out.println(this);

		
		mails.add(new MailVO(this.a, null ,this.cc, this.oggetto, this.testo));
		
		this.a = "";
		this.cc = "";
		this.oggetto = "";
		this.testo = "";
	}
	
	
	public void visualizza(String txt) {
		testo = txt;
		System.out.println(testo);
	}

	public void eliminaInviate(MailVO mail) {
		
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mails.remove(mail);
	}
	
	@Override
	public String toString() {
		return "SpedizioneBean [da=" + da + ", a=" + a + ", cc=" + cc + ", oggetto=" + oggetto + ", testo=" + testo
				+ ", mails=" + mails + ", arrivate=" + arrivate + "]";
	}

	public List<MailVO> getMails() {
		return mails;
	}



	public List<MailVO> getArrivateVisualizzate() {
		return arrivateVisualizzate;
	}

	public void setArrivateVisualizzate(List<MailVO> arrivateVisualizzate) {
		this.arrivateVisualizzate = arrivateVisualizzate;
	}

	public String getRicercaDa() {
		return ricercaDa;
	}

	public void setRicercaDa(String ricercaDa) {
		this.ricercaDa = ricercaDa;
	}

	public String getRicercaOggetto() {
		return ricercaOggetto;
	}

	public void setRicercaOggetto(String ricercaOggetto) {
		this.ricercaOggetto = ricercaOggetto;
	}

	public void setMails(List<MailVO> mails) {
		this.mails = mails;
	}



	public List<MailVO> getArrivate() {
		return arrivate;
	}

	public void setArrivate(List<MailVO> arrivate) {
		this.arrivate = arrivate;
	}


	public String getDa() {
		return da;
	}

	public void setDa(String da) {
		this.da = da;
	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	public String getOggetto() {
		return oggetto;
	}

	public void setOggetto(String oggetto) {
		this.oggetto = oggetto;
	}

	public String getTesto() {
		return testo;
	}

	public void setTesto(String testo) {
		this.testo = testo;
	}
	
	
}
