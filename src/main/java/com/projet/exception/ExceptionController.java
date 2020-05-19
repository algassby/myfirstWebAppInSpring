/**
 * 
 */
package com.projet.exception;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.validator.constraints.EAN;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author algas
 *
 */
@ControllerAdvice
@EnableWebMvc
public class ExceptionController {

	private Log logger = LogFactory.getLog(Exception.class);
	@ExceptionHandler(value = Exception.class)
	public String handleError(HttpServletRequest request, Exception exception) {
		
		logger.error( request.getRequestURI()+"raised"+ exception);
		return "error";
		
		
	}

}
