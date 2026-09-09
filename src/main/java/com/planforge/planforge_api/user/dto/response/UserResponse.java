package com.planforge.planforge_api.user.dto.response;

import java.util.UUID;

public record UserResponse(

        UUID id,

        String name,

        String email,

        String role

) {
}
