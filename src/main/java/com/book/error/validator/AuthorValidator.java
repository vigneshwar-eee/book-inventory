package com.book.error.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

public class AuthorValidator implements ConstraintValidator<Author, String> {

    List<String> authors = Arrays.asList("Santideva", "Marie Kondo", "Martin Fowler", "raina");

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {

        return authors.contains(value);

    }
}
