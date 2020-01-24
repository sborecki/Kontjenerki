package com.sebik.multimodule.frontend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages =
        {"com.sebik.multimodule.backend", "com.sebik.multimodule.frontend"} )
@EnableJpaRepositories("com.sebik.multimodule.backend")
@EntityScan("com.sebik.multimodule.backend")
public class FrontendApplication {
    public static void main(String[] args) {
        SpringApplication.run(FrontendApplication.class, args);
    }
}
