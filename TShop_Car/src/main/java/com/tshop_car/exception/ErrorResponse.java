package com.tshop_car.exception;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Map;

@Getter
@Setter
public class ErrorResponse {
    private String timestamp;
    private String message;
    private Map<String, String> errors;

    public ErrorResponse(String message) {
        this.timestamp = LocalDateTime.now().toString();
        this.message = message;
    } // lí do dùng 2 contructor là vì ko phải lỗi nào cũng trả về 1 message
     // nếu lỗi nào ko  có message sẽ vào contructor ở trên
    // còn nếu lỗi nào có message thì sẽ vào contructor ở dưới

    public ErrorResponse(String message, Map<String, String> errors) {
        this(message);
        this.errors = errors;
    }
}
