import java.util.Random;

public class LoadBalancer {

    private static LoadBalancer _instance;

    private String[] _servers;
    private Random _random;

    public static LoadBalancer CreateLoadBalancer(){
        if (_instance == null) {
            _instance = new LoadBalancer();
        }

        return _instance;
    }


    private LoadBalancer() {

    }
}
