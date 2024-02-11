package jpabook.jpashop.controller;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MemberForm {
    /*
    * domain객체와 form에서 사용할 파라메터가 다를 수 있다 실제 폼에서 요구하는 데이터가 실무에서 다양하기 때문에 form에서 사용할 객체를 따로 생성해준다.
    * MemberEntity를 그대로 사용할 수 있다. 하지만 화면을 처리하기 위한 로직이 추가되기 때문에 엔티티를 최대한 순수하게 유지하는것이 좋다. 예외로 DTO를 사용하는것도 방법이다.
    * */
    @NotEmpty(message = "회원 이름은 필수 입니다.")
    private String name;

    private String city;
    private String street;
    private String zipcode;
}
