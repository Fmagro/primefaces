package it.daguanno.corso.validatori;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("pwdValidator")
public class PasswordValidator implements Validator{

	@Override
	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		// TODO Auto-generated method stub
		String attribute = (String)component.getAttributes().get("campoOrig");
		if(attribute == null) {
			try {
				throw new Exception("Attenzione!! manca l'attributo campoOrig");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				FacesMessage msg = 
						new FacesMessage(FacesMessage.SEVERITY_ERROR,"errore interno", 
								"contattare il servizio di consulenza");
				throw new ValidatorException(msg);
			}
		}
		String password = (String)((UIInput)component
				.getParent()
				.findComponent(attribute))
				.getLocalValue();
		String confirm = (String) value;
		
		if(!confirm.equals(password) ) {
			FacesMessage msg = 
					new FacesMessage(FacesMessage.SEVERITY_ERROR,"errore", 
							"test non valido");
			throw new ValidatorException(msg);
		}
	}

}
