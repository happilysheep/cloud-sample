package com.cloud.shiro;

import com.alibaba.fastjson.JSON;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

//@EnableScheduling
@SpringBootApplication
public class SampleShiroApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = new SpringApplication(SampleShiroApplication.class).run(args);
		Object test = run.getBean("test1");
		System.out.println("args = [" + JSON.toJSONString(test) + "]");
		//System.out.println("*******************ConfigurableApplicationContext run  = [" + JSON.toJSONString(run) + "]");
	}
}
