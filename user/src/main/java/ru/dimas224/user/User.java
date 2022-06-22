package ru.dimas224.user;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
}
