package imtihon.uz.dto;

import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class ResponseDto<T> {

    private Integer code;

    private Boolean success;

    private String message;

    private T data;

}