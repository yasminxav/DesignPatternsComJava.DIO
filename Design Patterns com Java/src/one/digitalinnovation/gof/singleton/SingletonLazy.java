package one.digitalinnovation.gof.singleton;

public class SingletonLazy {
    // Singleton "preguiçoso"
    private static SingletonLazy instancia = new SingletonLazy();

    private SingletonLazy() {
        super();
    }
    public static SingletonLazy getInstancia() {
        if(instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}

