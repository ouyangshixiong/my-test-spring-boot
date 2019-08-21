package com.simo.vsim;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author alexouyang
 * @Date 2019-08-21
 */
@ConfigurationProperties(prefix = MyProperties.prefix)
@Data
public class MyProperties {

    final static String prefix = "com.simo.vsim";
    private MyDataLayer myDataLayer;

    @Data
    public static class MyDataLayer{
        private String host;
        private int port;
    }
}
