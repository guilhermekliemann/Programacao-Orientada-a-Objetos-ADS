package br.com.kliemann.sistemabancario.exception;

public class NullDataException extends RuntimeException {
    
    public NullDataException() {
        super("Data está nula");
    }
    
}
