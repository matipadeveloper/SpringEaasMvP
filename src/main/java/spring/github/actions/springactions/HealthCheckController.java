package spring.github.actions.springactions;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @GetMapping("/healthcheck")
    public int healthCheck() {
        return HealthStatus.HEALTHY.getStatus();
    } 
    
}


