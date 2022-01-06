package com.example.member.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberLoginDTO {
    @NotBlank(message = "로그인시 이메일은 필수입니다.") //
    private String memberEmail;
    @NotBlank
    @Length(min = 2, max = 8, message = "2~8자로 입력해주세요")
    private String memberPassword;
}
