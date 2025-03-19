package com.example.project_management_backend.model;

public class UserModel {
    private Long id;
    private String email;
    private String empId;
    private Boolean isActive;
    private String hashedPassword;

    public UserModel(){}
    public UserModel(Long id, String email, String empId, Boolean isActive, String hashedPassword){
        this.id = id;
        this.email = email;
        this.empId = empId;
        this.isActive = isActive;
        this.hashedPassword = hashedPassword;
    }

    public Long getId(){ return  id;}
    public void setId(Long id){this.id = id;}

    public String getEmail(){ return  email;}
    public void setEmail(String email){this.email = email;}

    public String getEmpId(){ return  empId;}
    public void setEmpId(String empId){this.empId = empId;}

    public String getHashedPassword(){ return  hashedPassword;}
    public void setHashedPassword(String hashedPassword){this.hashedPassword = hashedPassword;}

    public Boolean getIsActive(){ return  isActive;}
    public void setIsActive(Boolean isActive){this.isActive = isActive;}
}
