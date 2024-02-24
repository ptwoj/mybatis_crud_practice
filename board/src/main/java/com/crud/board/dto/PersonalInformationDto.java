package com.crud.board.dto;

import lombok.Getter;

@Getter
public class PersonalInformationDto {

    // 이름
    private String koreaName;
    private String englishName;
    private String chinaName;

    // 생년월일
    private int birthDate;

    // 전화번호
    private int phoneNum;

    // 회사 부서
    private String companyDivisions;

    // 회사직위
    private String CompanyPosition;

    private String text;
}
