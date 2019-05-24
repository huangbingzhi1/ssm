package com.hisense.ssm.utils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author Huang.bingzhi
 * @Date 2019/5/9 6:35
 * @Version 1.0
 */
@Component
public class SnowflakeComponent{
    @Value(value = "${snowflake.datacenterId}")
    private long datacenterId;

    @Value(value = "${snowflake.workId}")
    private long workId;

    private static volatile SnowflakeIdWorker instance;

    public SnowflakeIdWorker getInstance() {
        if (instance == null) {
            synchronized (SnowflakeIdWorker.class) {
                if (instance == null) {
                    instance = new SnowflakeIdWorker(workId, datacenterId);
                }
            }
        }
        return instance;
    }
}
