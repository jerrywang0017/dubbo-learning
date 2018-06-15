package com.alibaba.dubbo.consumer;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.dubbo.demo.DemoService;

public class Consumer {
	public static void main(String[] args) throws IOException {
		// 测试常规服务
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
		context.start();
		System.out.println("consumer start");
		DemoService demoService = context.getBean(DemoService.class);
		System.out.println("consumer");
		System.out.println(demoService.getPermissions(1L));
		System.in.read();
		context.close();
	}
}
