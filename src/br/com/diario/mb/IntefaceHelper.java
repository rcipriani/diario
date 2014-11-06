package br.com.diario.mb;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.diario.enums.BooleanEnum;

@Named
@RequestScoped
public class IntefaceHelper extends AbstractMB implements Serializable {
	private static final long serialVersionUID = 1L;

	public List<BooleanEnum> getIsMatrizTipos(){
		return Arrays.asList(BooleanEnum.values());
	}
	
	
	
}