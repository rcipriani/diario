package br.com.diario.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("cnpjConverter")
public class CnpjConverter implements Converter {

	 /**
     * Formata o cnpj passado de acordo com o padrao visual de um cnpj
     * 
     * @param context
     * @param component
     * @param value
     * @return cnpj formatado
     */
    public String getAsString(FacesContext context, UIComponent component, Object value) {
            if(value == null) return null;
            
            String cnpj = value.toString();
            if (cnpj.length() == 18 || cnpj.length() < 14) {
                    return cnpj;
            } else {
                    return cnpj.substring(0, 2) + "." + cnpj.substring(2, 5) + "." + cnpj.substring(5, 8) + "/" + cnpj.substring(8, 12) + "-" + cnpj.substring(12, 14);
            }
    }

    /**
     * Retorna o cnpj sem sua formatacao.
     * 
     * @param context
     * @param component
     * @param value
     * @return cnpj sem formatacao
     */
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
            if(value == null || value.trim().equals("")) return null;
            return value.replace(".", "").replace("-", "").replace("/", "");
    }
    
}