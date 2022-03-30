package com.Task5.FlywayMigrationDemo.Models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="REGISTRATION_USERS")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String username;
    private String first_name;
    private String last_name;
    private String email;
    private String mobile;

}
