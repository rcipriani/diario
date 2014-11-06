package br.com.diario.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("cpfConverter")
public class CpfConverter implements Converter {

	 /**
     * Formata o cpf passado de acordo com o padrao visual de um cpf
     * 
     * @param context
     * @param component
     * @param value
     * @return cpf formatado
     */
    public String getAsString(FacesContext context, UIComponent component, Object value) {
            if (value == null) return null;

            String cpf = value.toString();
            if (cpf.length() == 13) {
                    return cpf;
            } else if (cpf.length() < 11) {
                    return cpf;
            } else {
                    return cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9, 11);
            }
    }

    /**
     * Retorna o cpf sem sua formatacao.
     * 
     * @param context
     * @param component
     * @param value
     * @return cpf sem formatacao
     */
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
    	
    	if(value == null || value.trim().equals("")) return null;
        return value.replace(".", "").replace("-", "").replace("/", "");
        
    }
    
}