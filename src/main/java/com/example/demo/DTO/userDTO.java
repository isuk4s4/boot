package com.example.demo.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class userDTO {
    private Long id;

    private String uname;

    private String password;

    private String email;

    private String role;
}
