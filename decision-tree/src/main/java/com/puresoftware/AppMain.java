package com.puresoftware;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AppMain  {

	final static Logger log = LoggerFactory.getLogger(AppMain.class);

	public static void main(String[] args) {
		SpringApplication.run(AppMain.class, args);

	}

	@Bean
	public KieContainer kieContainer() {
		log.debug("Kie Container=" + KieServices.Factory.get().getKieClasspathContainer());
		return KieServices.Factory.get().getKieClasspathContainer();
	}
}
