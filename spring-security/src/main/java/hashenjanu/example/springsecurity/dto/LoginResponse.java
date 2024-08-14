package hashenjanu.example.springsecurity.dto;

import hashenjanu.example.springsecurity.entity.User;
import lombok.Data;

@Data
public class LoginResponse {
    private User user;
    private String jwtToken;

    public LoginResponse(User user, String jwtToken) {
        this.user = user;
        this.jwtToken = jwtToken;
    }
}

