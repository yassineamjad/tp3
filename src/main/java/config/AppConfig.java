package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"dao", "metier"})
@Import(DynamicDaoConfig.class)
@PropertySource("classpath:app.properties")
public class AppConfig {
}