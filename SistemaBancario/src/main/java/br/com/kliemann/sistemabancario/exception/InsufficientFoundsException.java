package br.com.kliemann.sistemabancario.exception;

public class InsufficientFoundsException extends RuntimeException {
    
    public InsufficientFoundsException() {
        super("Dinheiro insuficiente");
    }
    
}
