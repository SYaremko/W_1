package ua.com.work.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.io.File;

@Configuration
@EnableWebMvc
@ComponentScan("ua.com.work")
public class WebConfig extends WebMvcConfigurerAdapter {

    @Bean
    public MultipartResolver multipartResolver(){
        return new StandardServletMultipartResolver();
    }

    @Bean
    public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver =new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/pages/");
        viewResolver.setSuffix(".jsp");
        viewResolver.setContentType("text/html; charset=UTF-8");
        return viewResolver;
    }
   /* @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("messages");
        return messageSource;
    }*/

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        registry.addResourceHandler("/javascript/**").addResourceLocations("/WEB-INF/resources/javascript/");
        registry.addResourceHandler("/style/**").addResourceLocations("/WEB-INF/resources/style/");
        registry.addResourceHandler("/image/**").addResourceLocations("/WEB-INF/resources/images/imgHTML/");
        registry.addResourceHandler("/picture/**").addResourceLocations("file:" + System.getProperty("user.home") + File.separator + "images\\");


    }

}
