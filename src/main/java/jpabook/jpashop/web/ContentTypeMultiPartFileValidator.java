package jpabook.jpashop.web;

import org.springframework.web.multipart.MultipartFile;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;

public class ContentTypeMultiPartFileValidator implements ConstraintValidator<ContentType, MultipartFile> {

    private static String[] fileExtension;
    private static String[] contentType;

    @Override
    public void initialize(ContentType constraintAnnotation) {
        fileExtension = constraintAnnotation.fileExtension();
        contentType =constraintAnnotation.contentType();
    }

    @Override
    public boolean isValid(MultipartFile value, ConstraintValidatorContext context) {
        System.out.println(Arrays.toString(fileExtension));
        System.out.println(Arrays.toString(contentType));
        return false;
    }
}
