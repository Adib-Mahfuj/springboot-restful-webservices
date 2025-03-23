package net.javaguides.springboot_restful_webservices.mapper;

import net.javaguides.springboot_restful_webservices.dto.UserDto;
import net.javaguides.springboot_restful_webservices.entity.User;

public class UserMapper {

    //Convert User Jpa entity into UserDto
    public static UserDto mapToUserDto(User user) {
        UserDto userDto = new UserDto(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail()
        );
        return userDto;
    }

    //Convert UderDto into User Jpa entity

    public static User maptoUser(UserDto userDto) {
        User user = new User(
                userDto.getId(),
                userDto.getFirstName(),
                userDto.getLastName(),
                userDto.getEmail()
        );
        return user;

    }
}
