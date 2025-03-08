package com.example.GreetingApp.interfaces;

import com.example.GreetingApp.dto.AuthUserDTO;
import com.example.GreetingApp.dto.LoginDTO;
import com.example.GreetingApp.model.AuthUser;

public interface IAuthenticationService {
    AuthUser register(AuthUserDTO userDTO) throws Exception;

    String login(LoginDTO loginDTO);

    String forgotPassword(String email, String newPassword);


}
