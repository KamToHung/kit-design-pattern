package kit.design.pattern.chain;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 处理器结果
 *
 * 
 */
@Data
@Accessors(chain = true)
public class HandlerResult<T> {
    /**
     * 执行下一个处理器标识
     */
    private boolean executeNextHandlerMark = true;

    /**
     * 结果
     */
    private T result;

    private HandlerResult(T result) {
        this.executeNextHandlerMark = false;
        this.result = result;
    }

    private HandlerResult() {
    }

    public static <T> HandlerResult<T> finish(T result) {
        return new HandlerResult<>(result);
    }

    public static <T> HandlerResult<T> keepRunning() {
        return new HandlerResult<>();
    }
}
