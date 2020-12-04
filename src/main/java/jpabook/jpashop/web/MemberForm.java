package jpabook.jpashop.web;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.Transient;
import javax.validation.constraints.NotEmpty;

@Getter
@Setter
public class MemberForm {

    @NotEmpty(message = "회원 이름은 필수 입니다")
    private String name;

    private String city;

    private String street;

    private String zipcode;

//    @ContentType(fileExtension = {"pdf", "jpg", "jpeg"}, contentType = {"image/jpeg", "image/png"})
    private MultipartFile attachedfile;

}
