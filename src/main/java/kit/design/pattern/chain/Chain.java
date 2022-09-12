package kit.design.pattern.chain;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * chain
 *
 * @param <C> chain context type
 * @param <R> chain result type
 * 
 */
@Data
@Accessors(chain = true)
public class Chain<C extends ChainContext, R> {
    private List<? extends AbstractHandler<C, R>> handlers;

    public Chain(List<? extends AbstractHandler<C, R>> handlers) {
        this.handlers = handlers;
    }

    public R execute(C context) {
        for (AbstractHandler<C, R> handler : handlers) {
            final HandlerResult<R> result = handler.handle(context);

            if (!result.isExecuteNextHandlerMark()) {
                return result.getResult();
            }
        }

        throw new NoHandlerProcessException();
    }
}
