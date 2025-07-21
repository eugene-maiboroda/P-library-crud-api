package ua.javik.mylibraryspringboot.exception;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashSet;
import java.util.Set;
/**
    Чому зазвичай використовують ResponseEntity.status(...).body(...)?
    ✔ 1. Фабричний метод (builder-style API)

Цей підхід використовує статичний метод status(...) як фабрику для створення ResponseEntity. Він повертає проміжний об’єкт (типу BodyBuilder), на якому ти можеш зручно викликати .body(...).

Перевага:
•	Легше читати
•	Менше ризику зробити помилку
•	Виглядає як DSL (Domain-Specific Language)

✔ 2. Метод body(...) під капотом викликає конструктор

Так, як ти підозрюєш, метод body(...) в результаті викликає той самий конструктор, який ти можеш викликати самостійно:
Це повністю валідно. Обидва варіанти працюють однаково, і результат буде один і той же.

⸻

🔍 То в чому різниця між двома варіантами?
📌 Приклад розширеного використання:
return ResponseEntity
    .status(HttpStatus.BAD_REQUEST)
    .header("X-Error-Code", "400123")
    .contentType(MediaType.APPLICATION_JSON)
    .body(errorResponse);
    Таке зробити через конструктор незручно.

⸻

🔚 Висновок
•	Обидва варіанти валідні
•	.status().body() — це зручний спосіб створити відповідь в декларативному стилі
•	Якщо тобі потрібно щось швидко і просто — можна використовувати new ResponseEntity<>(...)
•	Якщо ж потрібен гнучкий контроль (headers, contentType тощо), краще .status().body(...)
     */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(IllegalArgumentException.class)
    protected ResponseEntity<Object> handleIllegalArgumentException(IllegalArgumentException e) {
        return buildErrorResponse(HttpStatus.BAD_REQUEST, e.getMessage());
    }
    @ExceptionHandler(NotFoundException.class)
    protected ResponseEntity<Object> handleNoFoundException(NotFoundException e) {
        return buildErrorResponse(HttpStatus.BAD_REQUEST, e.getMessage());

    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    protected ResponseEntity<Object> handleValidationException(MethodArgumentNotValidException ex) {
        Set<String> errorSet = new HashSet<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String errorMessage = error.getDefaultMessage();
            errorSet.add(errorMessage);
        });

        return buildErrorResponse(HttpStatus.BAD_REQUEST, ex.getMessage());
    }

    private static ResponseEntity<Object> buildErrorResponse(HttpStatus httpStatus, String message) {
        ErrorResponse errorResponse = new ErrorResponse(httpStatus.value(), httpStatus.getReasonPhrase(), message);
        return ResponseEntity.status(httpStatus.value()).body(errorResponse);
    }
    private static ResponseEntity<Object> buildArrayErrorResponse(String[] message) {
        ErrorArrayResponse errorArrayResponse = new ErrorArrayResponse(
                HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), message);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST.value()).body(errorArrayResponse);
    }


    @AllArgsConstructor
    @Getter
    @JsonInclude(JsonInclude.Include.NON_NULL)
    static class ErrorResponse {

        private int status;
        private String error;
        private String massage;
    }

    @AllArgsConstructor
    @Getter
    @JsonInclude(JsonInclude.Include.NON_NULL)
    static class ErrorArrayResponse {

        private int status;
        private String error;
        private String[] massage;
    }
}
