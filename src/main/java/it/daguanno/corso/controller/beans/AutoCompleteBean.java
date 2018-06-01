package it.daguanno.corso.controller.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class AutoCompleteBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String selezione;

	public List<String> complete(String query) {
		List<String> all = new ArrayList<>();
		String[] a = { "aa", "ab", "ac", "ba", "bb", "bc", "dd" };

		all.addAll(Arrays.asList(a));

		List<String> ret = new ArrayList<>();
		if (query != null) {
			for (String s : all) {
				if (s.toLowerCase().startsWith(query)) {
					ret.add(s);
				}
			}
		}

		return ret;
	}
	

	@Override
	public String toString() {
		return "AutoCompleteBean [selezione=" + selezione + "]";
	}



	public String getSelezione() {
		return selezione;
	}

	public void setSelezione(String selezione) {
		this.selezione = selezione;
	}

}
