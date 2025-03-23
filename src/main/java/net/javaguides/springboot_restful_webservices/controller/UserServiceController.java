package net.javaguides.springboot_restful_webservices.controller;

import lombok.AllArgsConstructor;
import net.javaguides.springboot_restful_webservices.dto.UserDto;
import net.javaguides.springboot_restful_webservices.entity.User;
import net.javaguides.springboot_restful_webservices.exception.ErrorDetails;
import net.javaguides.springboot_restful_webservices.exception.ResourceNotFoundException;
import net.javaguides.springboot_restful_webservices.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/users")
public class UserServiceController {

    private UserService userService;

    //Build create user Rest Api
    @PostMapping
    public ResponseEntity<UserDto> createUser(@RequestBody  UserDto user)
    {
        UserDto savedUser = userService.createUser(user);
        return ResponseEntity.ok(savedUser);
    }

    //Build get user by id Rest Api
    @GetMapping("{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable("id") Long userId)
    {
        UserDto getuser = userService.getUserById(userId);
        return ResponseEntity.ok(getuser);
    }

    //Build get all user Rest Api
    @GetMapping
    public ResponseEntity<List<UserDto>> getAllUser()
    {
        List<UserDto> allUser = userService.getAllUsers();
        return ResponseEntity.ok(allUser);
    }

    //Build Update user Rest Api
    @PutMapping("{id}")
    public ResponseEntity<UserDto> updateUser(@PathVariable("id") Long userId,
                                           @RequestBody UserDto user)
    {
        user.setId(userId);
        UserDto updatedUser = userService.updateUser(user);
        return ResponseEntity.ok(updatedUser);
    }

    //Build delete user REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") Long userId)
    {
        userService.deleteUser(userId);
        return new ResponseEntity<>("User Successfully Deleted!", HttpStatus.OK);
    }

//    Handling Exception
//    @ExceptionHandler(ResourceNotFoundException.class)
//    public ResponseEntity<ErrorDetails> handleResourceNotFoundException(ResourceNotFoundException exception,
//                                                                        WebRequest webRequest)
//    {
//        ErrorDetails errorDetails = new ErrorDetails(
//                LocalDateTime.now(),
//                exception.getMessage(),
//                webRequest.getDescription(false),
//                "User Not Found!"
//        );
//        return new ResponseEntity<>(errorDetails,HttpStatus.NOT_FOUND);
//    }

}
