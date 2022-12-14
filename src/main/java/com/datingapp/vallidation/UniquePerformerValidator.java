package com.datingapp.vallidation;

import com.datingapp.service.PostServiceImpl;
import com.datingapp.vallidation.annotation.UniquePerformer;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UniquePerformerValidator implements ConstraintValidator<UniquePerformer, String> {

    private final PostServiceImpl songService;

    public UniquePerformerValidator(PostServiceImpl songService) {
        this.songService = songService;
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return false;
    }
}
