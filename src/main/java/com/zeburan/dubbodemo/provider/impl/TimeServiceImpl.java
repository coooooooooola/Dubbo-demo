package com.zeburan.dubbodemo.provider.impl;

import com.zeburan.dubbodemo.TimeService;
import org.apache.dubbo.config.annotation.DubboService;

import java.time.LocalDateTime;

/**
 * Create by swtywang on 11/21/23 10:53 PM
 */
@DubboService
public class TimeServiceImpl implements TimeService {
    @Override
    public LocalDateTime getTime() {
        System.out.println("------------------------------------");
        return LocalDateTime.now();
    }
}
