package it.daguanno.corso.vo;

public class MailVO {

	private String a;
	private String da;
	private String cc;
	private String oggetto;
	private String testo;
	
	public MailVO() {
		
	}
	
	public MailVO(String a, String da, String cc, String oggetto, String testo) {
		super();
		this.a = a;
		this.da = da;
		this.cc = cc;
		this.oggetto = oggetto;
		this.testo = testo;
	}

	public String getTesto() {
		return testo;
	}
	public void setTesto(String testo) {
		this.testo = testo;
	}
	public String getEmail() {
		return a;
	}
	public void setEmail(String email) {
		this.a = email;
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

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((a == null) ? 0 : a.hashCode());
		result = prime * result + ((cc == null) ? 0 : cc.hashCode());
		result = prime * result + ((da == null) ? 0 : da.hashCode());
		result = prime * result + ((oggetto == null) ? 0 : oggetto.hashCode());
		result = prime * result + ((testo == null) ? 0 : testo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MailVO other = (MailVO) obj;
		if (a == null) {
			if (other.a != null)
				return false;
		} else if (!a.equals(other.a))
			return false;
		if (cc == null) {
			if (other.cc != null)
				return false;
		} else if (!cc.equals(other.cc))
			return false;
		if (da == null) {
			if (other.da != null)
				return false;
		} else if (!da.equals(other.da))
			return false;
		if (oggetto == null) {
			if (other.oggetto != null)
				return false;
		} else if (!oggetto.equals(other.oggetto))
			return false;
		if (testo == null) {
			if (other.testo != null)
				return false;
		} else if (!testo.equals(other.testo))
			return false;
		return true;
	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public String getDa() {
		return da;
	}

	public void setDa(String da) {
		this.da = da;
	}

	@Override
	public String toString() {
		return "MailVO [email=" + a + ", cc=" + cc + ", oggetto=" + oggetto + ", testo=" + testo + "]";
	}
	
	
}
