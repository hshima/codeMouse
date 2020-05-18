package br.com.codeMouse.store.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import br.com.codeMouse.store.model.Product;

public class ProductValidation implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {

		return Product.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {

		ValidationUtils.rejectIfEmpty(errors, "title", "field.required");
		ValidationUtils.rejectIfEmpty(errors, "description", "required.field");
		
		Product product = (Product) target;
		
		if(product.getPageCount() <= 0) {
			errors.rejectValue("pageCount", "field.required");
		}

	}

}
