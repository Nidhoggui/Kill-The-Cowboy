



public class Bartender {
    private Cowboy client;

    public Bartender(Cowboy client) {
        this.client = client;
    }

    public Cowboy getClient() {
        return client;
    }

    public void setClient(Cowboy client) {
        this.client = client;
    }
    
}
