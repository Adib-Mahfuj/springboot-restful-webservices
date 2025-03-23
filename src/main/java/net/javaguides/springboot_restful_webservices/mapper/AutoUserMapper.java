package net.javaguides.springboot_restful_webservices.mapper;

import net.javaguides.springboot_restful_webservices.dto.UserDto;
import net.javaguides.springboot_restful_webservices.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

// @Mapper annotation tells MapStruct that this is a mapper interface
@Mapper
public interface AutoUserMapper {

    // This creates an instance of the mapper automatically using MapStruct (Implementation)
    AutoUserMapper MAPPER = Mappers.getMapper(AutoUserMapper.class);

    // Method to convert a User entity to a UserDto (Data Transfer Object)
    UserDto mapToUserDto(User user);

    // Method to convert a UserDto back to a User entity
    User mapToUser(UserDto userDto);
}