package bo.gob.aduana.base.controller;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import bo.gob.aduana.base.model.Parametrizacion;


@Controller
@Transactional
public class RESTController {


	
	@RequestMapping(value="/rest/getParam", method = RequestMethod.GET)
	public @ResponseBody Parametrizacion getParam() {				
		Parametrizacion p1 = new Parametrizacion();
		p1.setDescrip("Descrip Original");
		p1.setIdParametrizacion(12l);
		p1.setValor("Valor Original");
		return p1;
	}
	
	@RequestMapping(value="/rest/setParam", method = RequestMethod.POST)
	public @ResponseBody Parametrizacion setParam(@RequestBody Parametrizacion param) {	
		param.setDescrip(param.getDescrip() + " Agregado Descrip");
		param.setIdParametrizacion(10l);
		param.setValor(param.getValor() + " Agregado Valor");
		return param;
	}
	
}