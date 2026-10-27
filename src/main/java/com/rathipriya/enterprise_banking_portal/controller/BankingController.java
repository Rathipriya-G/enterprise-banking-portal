package com.rathipriya.enterprise_banking_portal.controller;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BankingController {

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of("status", "UP", "application", "Enterprise Banking Portal");
    }

    @GetMapping("/account")
    public Map<String, Object> account() {
        return Map.of(
            "accountNumber", "DEMO-10001",
            "accountHolder", "Demo Customer",
            "accountType", "Savings",
            "balance", 25000.00,
            "currency", "INR"
        );
    }

    @GetMapping("/demo-error")
    public Map<String, String> demoError() {
        throw new ResourceNotFoundException("Demo account resource was not found");
    }

    public static class ResourceNotFoundException extends RuntimeException {
        public ResourceNotFoundException(String message) {
            super(message);
        }
    }
}
