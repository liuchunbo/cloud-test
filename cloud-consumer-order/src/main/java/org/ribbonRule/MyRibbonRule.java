package org.ribbonRule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Creat by liuchunbo 2023/3/23
 */
@Configuration
public class MyRibbonRule {

    @Bean
    public IRule myRule() {
        // 此处将ribbon默认使用的轮询策略改为随机策略,,还需要在启动类上声明
        return new RandomRule();
    }
}
