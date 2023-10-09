package com.sfbm.serviceedu.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.sfbm.serviceedu.mapper")
public class EduConfig {
}
