package com.example.project_management_backend.controller;

import com.example.project_management_backend.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.project_management_backend.services.AdminServices;

import java.util.HashMap;
import java.util.List;

@CrossOrigin(origins = "*") // Allow requests from any origin
@RestController
@RequestMapping("/admin")
//@CrossOrigin(origins = "http://localhost:4200/")
public class Admincontroller {

    @Autowired
    AdminServices adminServices;

    @GetMapping("/")
    public ResponseEntity<String>  hello(){
        return  ResponseEntity.ok("hello");
    }

    @PostMapping("/save")
    public ResponseEntity<HashMap<Object, Object>> saveUser(@RequestBody UserModel newUser){
        System.out.println("in save controller");
        adminServices.saveUser(newUser);
        HashMap<Object, Object> response = new HashMap<>();
        response.put("message","save successfully");
        return ResponseEntity.ok(response);
    }




    @GetMapping("/users")
    public ResponseEntity<List<UserModel>> getUsers(){
        System.out.println("in getUsers");
        List<UserModel> users = adminServices.getAllUsers();
        return ResponseEntity.ok(users);
    }



}
