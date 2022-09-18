package ch.rewiso.spring.function.lambda;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.function.context.FunctionalSpringApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;
import java.util.function.Supplier;

@SpringBootApplication
public class SpringCloudFunctionAwsLambdaApplication {

    public static void main(String[] args) {
        FunctionalSpringApplication.run(SpringCloudFunctionAwsLambdaApplication.class, args);
    }

    @Bean
    public Function<String, String> reverse() {

        return value -> new StringBuilder(value).reverse().toString();

    }

    @Bean
    public Function<String, String> greet() {
        return s -> "Hello " + s + ", and welcome to Spring Cloud Function!!!";
    }

    @Bean
    public Supplier<String> hello() {
        return () -> "Hello World!";
    }

}
