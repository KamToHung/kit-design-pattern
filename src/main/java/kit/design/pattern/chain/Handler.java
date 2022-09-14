package kit.design.pattern.chain;

/**
 * chain handler
 *
 * @param <C> handler context type
 * @param <R> handler result type
 * 
 */
@FunctionalInterface
public interface Handler<C, R> {
    HandlerResult<R> handle(C context);
}
