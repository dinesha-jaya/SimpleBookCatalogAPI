package lk.sbc.config;

import lk.sbc.controller.BookController;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = BookController.class)
public class WebAppConfig {
}
