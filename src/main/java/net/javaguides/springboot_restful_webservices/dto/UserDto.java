package net.javaguides.springboot_restful_webservices.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Schema(
        description = "UserDto Model Information"
)
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private Long id;

    @Schema(
            description = "User First Name"
    )
    @NotNull(message = "User first name should not be null")
    private String firstName;

    @Schema(
            description = "User Last Name"
    )
    @NotNull(message = "User last name should not be null")
    private String lastName;

    @Schema(
            description = "User Email Address"
    )
    @NotBlank(message = "Email should not be blank")
    @Email(message = "Give a valid email address")
    private String email;

}
