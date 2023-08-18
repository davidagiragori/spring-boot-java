package com.bank.balance;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;
import java.util.Arrays;

@RestController
public class BalanceController {

    /*
    @GetMapping("/")
    public String sayHello() {
        return "Hello, My frist Spring Boot Microservice!";
    }

    @GetMapping("/greet/{name}")
    public String greetByName(@PathVariable String name) {
        return "Hello, " + name + "!";
    }
    */

    @GetMapping("/balance")
    public String checkBalance() {
        return "Your current balance is $5000.";        
    }

    // Using GET
    @GetMapping("/deposit")
    public String depositViaGet(@RequestParam Double amount) {
        // Mock operation
        return String.format("Successfully deposited $%.2f to your account via GET.", amount);
    }

    // Using POST
    @PostMapping("/deposit")
    public String depositViaPost(@ModelAttribute("amount") Double amount) {
        // Mock operation
        return String.format("Successfully deposited $%.2f to your account via POST.", amount);
    }

    // Using GET
    @GetMapping("/withdraw")
    public String withdrawViaGet(@RequestParam Double amount) {
        // Mock operation
        return String.format("Successfully withdrew $%.2f from your account via GET.", amount);
    }

    // Using POST
    @PostMapping("/withdraw")
    public String withdrawViaPost(@ModelAttribute("amount") Double amount) {
        // Mock operation
        return String.format("Successfully withdrew $%.2f from your account via POST.", amount);
    }

    @GetMapping("/history")
    public List<String> getAccountHistory() {
        // Mock data for demonstration
        return Arrays.asList(
            "Deposited $500",
            "Withdrew $50",
            "Deposited $200",
            "Withdrew $100",
            "Deposited $1000"
        );
    }

}