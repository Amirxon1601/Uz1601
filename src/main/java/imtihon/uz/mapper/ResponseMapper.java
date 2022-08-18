package imtihon.uz.mapper;

import imtihon.uz.dto.ResponseDto;

public class ResponseMapper {
    public static ResponseDto getResponseDto(Integer code, Boolean success, String message, Object o) {
        return ResponseDto.builder()
                .code(code)
                .success(success)
                .message(message)
                .build();
    }
}