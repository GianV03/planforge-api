package com.planforge.planforge_api.apikey.dto.response;

import java.util.UUID;

public record ApiKeyResponse (

        UUID id,

        String keyValue,

        boolean active

){}
