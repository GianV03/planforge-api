package com.planforge.planforge_api.common.response;

public record ApiResponse<T>(

        boolean success,
        T data,
        String message

) {
}
