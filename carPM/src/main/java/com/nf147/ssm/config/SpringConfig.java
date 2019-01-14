package com.nf147.ssm.config;

import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan("com.nf147.ssm.config")
@PropertySource("classpath:/application.properties")
@Import({SpringDAOXML.class, RedisConfig.class})
public class SpringConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }


//    @Bean
//    public CacheManager cacheManager(){
//        return RedisCacheManager.create(redisConnectionFactory());
//    }


//    @Bean
//    public void jedisPoolConfig() {
//        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
//        jedisPoolConfig.setMaxIdle(50);
//        jedisPoolConfig.setMaxTotal(100);
//        jedisPoolConfig.setMaxWaitMillis(20000);
//    }
}
