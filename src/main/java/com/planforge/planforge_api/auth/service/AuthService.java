package com.planforge.planforge_api.auth.service;

import com.planforge.planforge_api.auth.dto.request.LoginRequest;
import com.planforge.planforge_api.auth.dto.response.AuthResponse;
import com.planforge.planforge_api.user.entity.User;
import com.planforge.planforge_api.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final AuthenticationManager authenticationManager;
    private final JwtService jwtService;
    private final UserRepository userRepository;

    public AuthResponse login(
            LoginRequest request
    ) {

        try{
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            request.email(),
                            request.password()
                    )
            );

            User user =
                    userRepository.findByEmail(
                            request.email()
                    ).orElseThrow();

            String token =
                    jwtService.generateToken(user);

            return new AuthResponse(token);
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
