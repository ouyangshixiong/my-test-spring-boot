package com.simo.vsim;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * @author alexouyang
 * @Date 2019-08-21
 */
@Data
@ToString
@AllArgsConstructor
public class MyServer {
    private String host;
    private int port;
}
