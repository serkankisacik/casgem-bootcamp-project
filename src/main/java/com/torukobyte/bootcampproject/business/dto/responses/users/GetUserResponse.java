package com.torukobyte.bootcampproject.business.dto.responses.users;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GetUserResponse {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
}