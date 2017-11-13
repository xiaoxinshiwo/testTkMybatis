package com.xiaoxin.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Table(name = "user_tk")
@Getter
@Setter
@ToString
public class UserTk {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name ="user_name")
    private String userName;

    private String password;

    private Integer age;

    public Integer getId() {
        return id;
    }
}