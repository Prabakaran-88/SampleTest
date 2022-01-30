package com.prabakaran.libmgmtsyssp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.prabakaran.libmgmtsyssp.util.HibernateUtil;

@SpringBootApplication
@ComponentScan()
public class LibmgmtsysspApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibmgmtsysspApplication.class, args);
	}

	public void destroy()
	{
		HibernateUtil.shutdown();
	}
}
