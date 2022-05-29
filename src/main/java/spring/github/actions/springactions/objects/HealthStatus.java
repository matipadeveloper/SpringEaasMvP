package spring.github.actions.springactions.objects;
public enum HealthStatus {

    HEALTHY(200),
    UNHEALTHY(500);

    private int status;
    
    private HealthStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return this.status;
    }

}
