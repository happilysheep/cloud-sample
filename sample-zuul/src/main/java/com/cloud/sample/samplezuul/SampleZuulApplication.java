package com.cloud.sample.samplezuul;


import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringCloudApplication
public class SampleZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleZuulApplication.class, args);
    }
}
