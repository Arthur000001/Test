package org.example.multithread.exemple.Reactor;

import reactor.core.publisher.Flux;

public class ReactorJustExemple {
    public static void start() {
        String[] mass = new String[] {"Apple", "Grape", "Banana", "Strawberry"};
        Flux<String> fruitFlux = Flux.fromArray(mass);
        fruitFlux.subscribe(f -> System.out.println("Here's some fruit: " + f));
    }
}
