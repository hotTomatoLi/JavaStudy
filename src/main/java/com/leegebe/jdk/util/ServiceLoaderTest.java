package com.leegebe.jdk.util;

import java.util.ServiceLoader;

/**
 * Description: ServiceLoader使用<br>
 *
 * @author 李恩全
 * @date 2017/9/10 下午6:17
 */
public class ServiceLoaderTest {

    public static void main(String[] args){
        ServiceLoader<Service> serviceLoader =
                ServiceLoader.load(Service.class);
        for(Service service : serviceLoader) {
            System.out.println(service.service());
        }
    }
}
