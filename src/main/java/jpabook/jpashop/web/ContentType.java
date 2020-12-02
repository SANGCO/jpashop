package jpabook.jpashop.web;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

@Documented
@Retention(RUNTIME)
@Constraint(validatedBy = ContentTypeMultiPartFileValidator.class)
@Target(FIELD)
public @interface ContentType {

    String message() default "invalid";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    String[] fileExtension() default {"pdf", "jpg", "jpeg", "png"};

    String[] contentType() default {"image/jpeg", "image/png", "application/pdf"};

}
