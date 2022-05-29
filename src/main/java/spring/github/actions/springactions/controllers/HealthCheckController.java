package spring.github.actions.springactions.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.github.actions.springactions.objects.HealthStatus;

@RestController
public class HealthCheckController {

    @GetMapping("/healthcheck")
    public int healthCheck() {
        return HealthStatus.HEALTHY.getStatus();
    } 

}


