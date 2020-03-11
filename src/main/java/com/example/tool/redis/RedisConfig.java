package com.example.tool.redis;

import com.example.domain.ReceiveBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class RedisConfig {

    @Bean
    RedisConnectionFactory lettuceConnectionFactory() {
        return new LettuceConnectionFactory();
    }
    //redis连接池
    @Bean
    public RedisTemplate<String, ReceiveBean> redisTemplate(RedisConnectionFactory factory) {
        RedisTemplate<String, ReceiveBean> template = new RedisTemplate<String, ReceiveBean>();
        template.setConnectionFactory(lettuceConnectionFactory());
        template.setKeySerializer(new StringRedisSerializer());
        return template;
    }
}
