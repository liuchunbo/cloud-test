package org.example.service;

import java.util.List;
import org.springframework.cloud.client.ServiceInstance;

/**
 * Creat by liuchunbo 2023/3/23
 */
public interface LoadBalance {

    ServiceInstance instances(List<ServiceInstance> list);

}
