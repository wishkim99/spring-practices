package com.poscoict.container.config.soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //설정파일
@ComponentScan(basePackages= {"com.poscoict.container.soundsystem"}) //뽑아서 scanning 해라
public class CDPlayerConfig {
	
}
