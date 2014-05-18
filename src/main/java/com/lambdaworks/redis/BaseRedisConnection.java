package com.lambdaworks.redis;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * 
 * Basic synchronous executed commands.
 * 
 * @author <a href="mailto:mpaluch@paluch.biz">Mark Paluch</a>
 * @since 17.05.14 21:05
 */
public interface BaseRedisConnection<K, V> extends AutoCloseable {
    void setTimeout(long timeout, TimeUnit unit);

    String auth(String password);

    Long publish(K channel, V message);

    V echo(V msg);

    String ping();

    String quit();

    String select(int db);

    void close();

    String digest(V script);

    String discard();

    List<Object> exec();

    String multi();

    String watch(K... keys);

    String unwatch();

}