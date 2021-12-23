package com.example.demo.Controller;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import com.example.demo.DTO.userDTO;
import com.example.demo.entity.user;
import com.example.demo.service.userService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;


@RestController
@RequestMapping(value = "api/v1/")
@CrossOrigin
public class userController {
private final userService userService;
    private Object user;


    public userController(com.example.demo.service.userService userService) {
    this.userService = userService;
}
    @PostMapping("user")
    public ResponseEntity<user> adduser(@RequestBody userDTO userDTO){
 user add = userService.addUser(userDTO);
 return new ResponseEntity<>(add, HttpStatus.CREATED);

    }
    @DeleteMapping("user/{id}")
    public ResponseEntity<?> delByid(@PathVariable("id") Long Id) {
     userService.deleteUser(Id);
return new ResponseEntity<>(HttpStatus.OK);

    }
    @PutMapping(value="user")
    public ResponseEntity<user> updateUser(@RequestBody userDTO userDTO) {

        user updateUser = userService.updateUser(userDTO);
        return new ResponseEntity<>(updateUser,HttpStatus.OK);


    }
    @GetMapping(value="user")
    public ResponseEntity<List<user>> allUser() {

return new ResponseEntity<>(userService.allUser(),HttpStatus.OK);


    }

    @GetMapping(value="user/{uid}")
    public List<user> finduserbyId(@PathVariable("uid") Long id) {
return userService.findUserById(id);



    }


}
