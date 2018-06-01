package it.daguanno.corso.validatori;

import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("dateRangeValidator")
public class DateRangeValidator implements Validator{

	@Override
	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		
		String attr = (String) component.getAttributes().get("dataInizio");
		
		if(attr == null) {
			try {
				throw new Exception("Attenzione!! Manca l'attributo Data Inizio");
			}catch(Exception e) {
				e.printStackTrace();
				FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, 
						"errore interno", "contattare consulenza");
				throw new ValidatorException(msg);
			}
		}
		
		Date inizio = (Date) ((UIInput)component
				.getParent()
				.findComponent(attr)).getLocalValue();
				
		Date fine = (Date) value;
		
		if(fine.getTime() < inizio.getTime()) {
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR
					, "Errore di validazione"
					, "la data di fineStudi deve essere successiva alla data di inizio!");
			throw new ValidatorException(message);
		}
		
	}

}
