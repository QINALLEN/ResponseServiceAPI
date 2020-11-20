package com.bank.api.configuration;

import com.bank.api.service.BankService;
import com.bank.api.service.impl.BankServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@Configuration
@ConfigurationProperties(prefix = "com.hxyc.bank.config")
public class BankPropertyConfig {

    public String url;

    public void setURL(String url) {
        this.url = url;
    }

    @ConditionalOnMissingBean
    @Bean
    public RestTemplate restTemplate(){
       return new RestTemplateBuilder().setReadTimeout(Duration.ofSeconds(5)).setConnectTimeout(Duration.ofSeconds(5)).build();
    }

    @Bean
    public BankService bankService(){
        return new BankServiceImpl(url,restTemplate());
    }
}
