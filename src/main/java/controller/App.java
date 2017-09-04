package controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;

@SpringBootApplication
public class App implements EmbeddedServletContainerCustomizer{

//    public static void main(String[] args) {
//        SpringApplication.run(App.class, args);
//
//    }

    public static void main(String[] args){
        SpringApplication.run(App.class,args);
    }
    @Override
    public void customize(ConfigurableEmbeddedServletContainer configurableEmbeddedServletContainer) {
        //设置Tomcat监听8011端口
        configurableEmbeddedServletContainer.setPort(8011);
    }
}
