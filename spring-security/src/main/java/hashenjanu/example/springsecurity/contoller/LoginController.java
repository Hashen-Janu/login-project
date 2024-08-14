package hashenjanu.example.springsecurity.contoller;

import hashenjanu.example.springsecurity.dto.LoginRequest;
import hashenjanu.example.springsecurity.dto.LoginResponse;
import hashenjanu.example.springsecurity.service.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    private JwtService jwtService;

//    authentication login
    @PostMapping({"/authentication"})
    public LoginResponse createJwtTokenAndLogin(@RequestBody LoginRequest loginRequest)throws Exception{
        return jwtService.createJwtToken(loginRequest);

    }
}
