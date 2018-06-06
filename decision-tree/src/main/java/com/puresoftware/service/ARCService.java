package com.puresoftware.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.puresoftware.model.ARC;

@Service
public class ARCService {
	private final KieContainer kieContainer;

	@Autowired
	public ARCService(KieContainer kieContainer) {
		this.kieContainer = kieContainer;
	}

	public ARC getARC(ARC product) {
		KieSession kieSession = kieContainer.newKieSession("rulesSession");
		kieSession.insert(product);
		kieSession.fireAllRules();
		kieSession.dispose();
		return product;
	}
}
