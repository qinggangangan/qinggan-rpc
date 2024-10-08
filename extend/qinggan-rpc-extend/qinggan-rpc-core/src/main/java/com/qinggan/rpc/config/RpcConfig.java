package com.qinggan.rpc.config;

import com.qinggan.rpc.fault.retry.RetryStrategyKeys;
import com.qinggan.rpc.fault.tolerant.TolerantStrategyKeys;
import com.qinggan.rpc.loadbalancer.LoadBalancerKeys;
import com.qinggan.rpc.serializer.SerializerKeys;
import lombok.Data;

/**
 * Description: Rpc框架配置
 * Author: 1401687501x's
 * Date: 2024/9/9 17:15
 */
@Data
public class RpcConfig {
    private String name = "qingggan-rpc";

    private String version = "1.0";

    private String serverHost = "localhost";

    private Integer serverPort = 8080;

    /**
     * 模拟调用
     */
    private boolean mock = false;

    /**
     * 序列化器
     */
    private String serializer = SerializerKeys.JDK;

    /**
     * 注册中心配置
     */
    RegistryConfig registryConfig = new RegistryConfig();

    /**
     * 负载均衡器配置
     */
    private String loadBalancer = LoadBalancerKeys.ROUND_ROBIN;

    /**
     * 重试策略配置
     */
    private String retryStrategy = RetryStrategyKeys.NO;

    /**
     * 容错策略配置
     */
    private String TolerantStrategy = TolerantStrategyKeys.FAIL_FAST;
}
