package com.yusufakbas.customquery.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class UserDto {

    private String username;
    private boolean active;
    private long salary;
    private Date birthDate;

}
