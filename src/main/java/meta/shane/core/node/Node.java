package meta.shane.core.node;

import meta.shane.core.Lifecycle;

/**
 * 服务节点
 * 1.存储
 * 2.通信
 * 3.时钟
 * 4.状态 主节点、从节点、候选节点
 *
 * @author Shane
 * @version 1.0
 * @date 2021-12-02 23:16
 */
public final class Node implements Lifecycle {
    private final RoleEnum role;
    /**
     * 所有节点的时钟周期保持一致
     */
    private final int term;

    public Node() {
        this.role = RoleEnum.FOLLOWER;
        this.term = 0;
    }

    @Override
    public void start() {

    }

    @Override
    public void close() {

    }
}
