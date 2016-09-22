package com.gft;

import com.gft.socket.WebSocketConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ComponentScan
@ImportResource("/beans.xml")
@Import(value = WebSocketConfig.class)
public class Program {

	public static void main(String[] args) {
		SpringApplication.run(Program.class, args);
	}
}
