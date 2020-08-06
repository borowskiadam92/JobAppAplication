package pl.sda.JobAppAplication.user;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.sda.JobAppAplication.user.model.UserInput;
import pl.sda.JobAppAplication.user.model.UserOutput;
import pl.sda.JobAppAplication.user.service.UserService;

import java.util.List;


@RequestMapping("/users")
@RestController
public class UserController {


    private UserService userService;
    public UserController(UserService userService){
        this.userService=userService;
    }
    @GetMapping
    public ResponseEntity <List<UserOutput>> getAllUsers(){

        userService.getAllUsers();
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(userService.getAllUsers());
    }

    @GetMapping("/{id}")
    public ResponseEntity <UserOutput> getUserById(@PathVariable (value="id") Long id){
        UserOutput userById = userService.getUserById(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(userById);
    }
    @PostMapping
    public ResponseEntity <Void> postUser(@RequestBody UserInput userInput){
        userService.createUser(userInput);
        return ResponseEntity.status(HttpStatus.CREATED)
                .build();



    }



}
