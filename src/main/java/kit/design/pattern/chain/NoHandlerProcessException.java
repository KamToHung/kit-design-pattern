package kit.design.pattern.chain;

/**
 * 
 */
public class NoHandlerProcessException extends RuntimeException {
    public NoHandlerProcessException() {
        super("no handler process");
    }
}
