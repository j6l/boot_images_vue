package com.jie.images.Config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import java.text.SimpleDateFormat;

/**
 * Description:
 *
 * @author LiJie
 * @date Created on 2020/4/10
 * WWW https://github.com/j6l
 */

@Configuration
public class WebMVCConfig {
    @Bean
    MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter() {
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setDateFormat( new SimpleDateFormat( "yyyy-MM-dd" ) );
        converter.setObjectMapper( objectMapper );
        return converter;
    }
}
