package com.simo.vsim;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * @author alexouyang
 * @Date 2019-08-21
 */
@EnableConfigurationProperties(MyProperties.class)
public class MyAutoConfiguration {

    @Bean
    @ConditionalOnProperty(prefix = "com.simo.vsim", name = "my-data-layer", matchIfMissing = false)
    public MyServer getConnectString(MyProperties myProperties){
        String host = myProperties.getMyDataLayer().getHost();
        int port = myProperties.getMyDataLayer().getPort();
        MyServer myServer = new MyServer(host,port);
        return myServer;
    }
}
