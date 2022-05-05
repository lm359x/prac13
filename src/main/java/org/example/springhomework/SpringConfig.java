package org.example.springhomework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.example.springhomework")
//@PropertySource("classpath:application.yml")
@PropertySource("classpath:student.properties")
public class SpringConfig {
    @Bean
    public Student student(){
        return new Student();
    }
}
