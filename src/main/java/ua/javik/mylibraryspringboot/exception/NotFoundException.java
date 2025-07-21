package ua.javik.mylibraryspringboot.exeption;

public class NotFoundException extends RuntimeException {

    public NotFoundException(String message) {
        super(message);
    }
}
