package com.tp03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.server.RouterFunction;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
       
        EntityManagerFactory emf = Persistence.createEntityManagerFactory();
        EntityManager em = emf.createEntityManager();
        
        EntityTransaction etr = em.getTransaction();
        etr.begin();
        
        etr.commit();
        em.close();
        emf.close();
	    }
    }

    @Bean
    public RouterFunction<?> routes(WelcomeHandler welcomeHandler, GreetingHandler greetingHandler) {
        return welcomeHandler.routes()
            .and(greetingHandler.routes());
    }


