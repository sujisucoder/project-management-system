package com.example.project_management_backend.entity;

import jakarta.persistence.*;


@Entity
@Table(name="user")
//@NoArgsConstructor
//@AllArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;
    private String email;
    private String passwordHash;
    private String empId;
    private Boolean isActive;

    public Long getId(){ return  id;}
    public void setId(Long id){this.id = id;}

    public String getEmail(){ return  email;}
    public void setEmail(String email){this.email = email;}

    public String getPasswordHash(){ return  passwordHash;}
    public void setPasswordHash(String passwordHash){this.passwordHash = passwordHash;}

    public String getEmpId(){ return  empId;}
    public void setEmpId(String empId){this.empId = empId;}

    public Boolean getIsActive(){ return  isActive;}
    public void setIsActive(Boolean isActive){this.isActive = isActive;}

}
