package br.com.codeMouse.store.conf;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ServletSpringMvc extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { AppWebConfiguration.class, JPAConfiguration.class }; // Maps configuration Classes to be
																					// considered by Spring
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}
