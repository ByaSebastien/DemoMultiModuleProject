package be.bstorm.demomultimoduleproject.controllers;

import entities.Animal;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping("/login")
    public ResponseEntity<?> login(){
        Animal a;
        return ResponseEntity.ok(null);
    }
}
