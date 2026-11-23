package in.dhruvsood.ledgerly.auth.dto;


import in.dhruvsood.ledgerly.user.dto.UserResponseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class AuthResponseDto {

    private String accessToken;
    private String tokenType;
    private long expiresIn;
    private UserResponseDto user;
}
