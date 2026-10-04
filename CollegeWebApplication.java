package com.college;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import org.springframework.boot.builder.SpringApplicationBuilder;
import javax.swing.SwingUtilities;

@SpringBootApplication
public class CollegeWebApplication {
    public static void main(String[] args) {
        // Run Spring Boot without headless mode
        new SpringApplicationBuilder(CollegeWebApplication.class)
                .headless(false)
                .run(args);
                
        // Launch ERP Desktop GUI with Proper Java Graphics
        SwingUtilities.invokeLater(() -> {
            new CollegeERP().setVisible(true);
        });
    }
}
