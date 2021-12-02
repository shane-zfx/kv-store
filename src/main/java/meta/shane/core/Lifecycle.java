package meta.shane.core;

import java.io.Closeable;

/**
 * @author Shane
 * @version 1.0
 * @date 2021-12-02 23:43
 */
public interface Lifecycle extends Closeable {
    void start();

    @Override
    void close();
}
