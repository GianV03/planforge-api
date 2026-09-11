package com.planforge.planforge_api.auth.expose;

import com.planforge.planforge_api.auth.dto.request.LoginRequest;
import com.planforge.planforge_api.auth.dto.response.AuthResponse;
import com.planforge.planforge_api.auth.service.AuthService;
import io.swagger.v3.oas.annotations.Parameter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @Value("${spring.datasource.url}")
    private String url;

    @PostMapping("/login")
    public AuthResponse login(
            @RequestBody LoginRequest request
    ) {

        return authService.login(request);
    }
    @GetMapping
    public String testController(){
        return url;
    }
}