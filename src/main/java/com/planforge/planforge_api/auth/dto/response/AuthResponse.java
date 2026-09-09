package com.planforge.planforge_api.auth.dto.response;

public record AuthResponse(

        String accessToken,

        String tokenType

) {
}
