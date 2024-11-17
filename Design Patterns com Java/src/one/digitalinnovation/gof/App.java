package one.digitalinnovation.gof;

import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.*;
import one.digitalinnovation.gof.facade.*;

public class App {
    public static void main(String[] args) throws Exception {
       // Testes relacionados ao design patterns de Singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
       System.out.println(lazy);
       lazy = SingletonLazy.getInstancia();
       System.out.println(lazy);

       SingletonEager eager = SingletonEager.getInstancia();
       System.out.println(eager);
       eager = SingletonEager.getInstancia();
       System.out.println(eager);

       SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
       System.out.println(holder);
       holder = SingletonLazyHolder.getInstancia();
       System.out.println(holder);

       // Strategy
       Comportamento normal = new ComportamentoNormal();
       Comportamento defensivo = new ComportamentoDefensivo();
       Comportamento agressivo = new ComportamentoAgressivo();

       Robo robo = new Robo();
       robo.setComportamento(normal);
       robo.mover();
       robo.mover();
       robo.setComportamento(agressivo);
       robo.mover();
       robo.mover();
       robo.setComportamento(defensivo);
       robo.mover();
       robo.mover();

        // facade

        Facade facade = new Facade();
        facade.migrarCliente("Yasmin", "14801788");

    }
}
