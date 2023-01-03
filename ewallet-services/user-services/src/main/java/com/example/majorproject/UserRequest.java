package com.example.majorproject;

import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class UserRequest {

    private String userName;
    private String email;
    private String name;
    private int age;
}
