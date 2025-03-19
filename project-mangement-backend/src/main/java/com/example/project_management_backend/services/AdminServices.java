package com.example.project_management_backend.services;

import com.example.project_management_backend.entity.UserEntity;
import com.example.project_management_backend.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.project_management_backend.repository.UserRespository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AdminServices {
    @Autowired
    UserRespository userRespository;

    public void saveUser(UserModel newUser){
        System.out.println("save in userservice called");
        UserEntity userEntity = new UserEntity();
        userEntity.setEmail(newUser.getEmail());
        userEntity.setIsActive(newUser.getIsActive());
        userEntity.setEmpId(newUser.getEmpId());
        userEntity.setPasswordHash(newUser.getHashedPassword());

        userRespository.save(userEntity);
    }


    public List<UserModel> getAllUsers(){
        List<UserEntity> userList = userRespository.findAll();
        for (UserEntity user : userList) {
            System.out.println("email: " + user.getEmail() +
                    "id: " + user.getId() +
                    ", Description: " + user.getEmpId() +
                    ", Completed: " + user.getIsActive());
        }

        return  userList.stream().map(user -> {
            UserModel userModel = new UserModel();
            System.out.println("userEmail:"+user.getEmail());
            userModel.setEmail(user.getEmail());
            userModel.setId(user.getId());
            userModel.setEmpId(user.getEmpId());
            userModel.setIsActive(user.getIsActive());
            return  userModel;
        }).collect(Collectors.toList());
    }
}
