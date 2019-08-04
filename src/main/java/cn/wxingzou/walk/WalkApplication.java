package cn.wxingzou.walk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "cn.wxingzou.walk")
public class WalkApplication {

	public static void main(String[] args) {
		SpringApplication.run(WalkApplication.class, args);
	}

}
