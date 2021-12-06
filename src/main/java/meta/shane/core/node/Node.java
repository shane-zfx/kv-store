package meta.shane.core.node;

import meta.shane.core.Lifecycle;
import meta.shane.core.LifecycleEnum;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import static meta.shane.core.LifecycleEnum.INITED;

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
    private LifecycleEnum status;
    private RoleEnum role;
    /**
     * 所有节点的时钟周期保持一致
     */
    private int term;

    public Node() {
        this.role = RoleEnum.FOLLOWER;
        this.term = 0;
        this.status = INITED;
    }

    private void t() {
        // 时钟
    }

    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
        service.scheduleAtFixedRate(
                () -> System.out.println("定时打印，时间 : " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))),
                0,
                2,
                TimeUnit.SECONDS);
    }

    @Override
    public void start() {

    }

    @Override
    public void close() {

    }
}
