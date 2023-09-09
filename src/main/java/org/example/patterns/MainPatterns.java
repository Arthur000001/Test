package org.example.patterns;

import org.example.patterns.adapter.LegacyRectangle;
import org.example.patterns.adapter.RectangleAdapter;
import org.example.patterns.adapter.Rectangle;
import org.example.patterns.bulding.Computer;
import org.example.patterns.bulding.ComputerBuilder;
import org.example.patterns.bulding.ConcreteComputerBuilder;
import org.example.patterns.bulding.Director;
import org.example.patterns.decorator.model.Coffee;
import org.example.patterns.decorator.model.MilkDecorator;
import org.example.patterns.decorator.model.SimpleCoffee;
import org.example.patterns.decorator.model.WhipDecorator;
import org.example.patterns.factory.abstractfactory.factory.Button;
import org.example.patterns.factory.abstractfactory.factory.InputField;
import org.example.patterns.factory.abstractfactory.factory.UIFactory;
import org.example.patterns.factory.abstractfactory.model.DarkUIFactory;
import org.example.patterns.factory.abstractfactory.model.LightUIFactory;
import org.example.patterns.factory.factorymethod.factory.CarFactory;
import org.example.patterns.factory.factorymethod.factory.MotorcycleFactory;
import org.example.patterns.factory.factorymethod.factory.TransportFactory;
import org.example.patterns.singleton.Singleton;

public class MainPatterns {
    public static void main(String[] args) {
        //healthCheckPatternSingleton();
        //healthCheckPatternBuilder();
        //healthCheckPatternFactoryMethod();
        //healthCheckPatternAbstractFactory();
        //healthCheckPatternAdapter();
        //healthCheckPatternDecorator();
    }

    public static void healthCheckPatternSingleton() {
        System.out.println("1 запрос имени: " + Singleton.getInstance() + "|" + Singleton.getInstance().hashCode());
        System.out.println("2 запрос имени: " + Singleton.getInstance() + "|" + Singleton.getInstance().hashCode());
        System.out.println("3 запрос имени: " + Singleton.getInstance() + "|" + Singleton.getInstance().hashCode());
        Singleton.getInstance().doSomething();
    }
    public static void healthCheckPatternBuilder() {
        ComputerBuilder builder = new ConcreteComputerBuilder();
        Director director = new Director(builder);

        director.constructGamingComputer();
        Computer gamingComputer = builder.getResult();
        System.out.println("Gaming Computer: " + gamingComputer);

        director.constructOfficeComputer();
        Computer officeComputer = builder.getResult();
        System.out.println("Office Computer: " + officeComputer);
    }
    public static void healthCheckPatternFactoryMethod() {
        TransportFactory carFactory = new CarFactory();
        carFactory.planDelivery();

        TransportFactory motorcycleFactory = new MotorcycleFactory();
        motorcycleFactory.planDelivery();
    }
    public static void healthCheckPatternAbstractFactory() {
        // Создаем светлый интерфейс
        UIFactory lightUIFactory = new LightUIFactory();
        Button lightButton = lightUIFactory.createButton();
        InputField lightInputField = lightUIFactory.createInputField();

        lightButton.render();
        lightInputField.render();

        // Создаем темный интерфейс
        UIFactory darkUIFactory = new DarkUIFactory();
        Button darkButton = darkUIFactory.createButton();
        InputField darkInputField = darkUIFactory.createInputField();

        darkButton.render();
        darkInputField.render();
    }
    public static void healthCheckPatternAdapter() {
        LegacyRectangle legacyRectangle = new LegacyRectangle();
        Rectangle rectangle = new RectangleAdapter(legacyRectangle);

        rectangle.draw(10, 20, 50, 30);
    }
    public static void healthCheckPatternDecorator() {
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println("Simple coffee: " + simpleCoffee.getDescription() + ", Cost: $" + simpleCoffee.cost());

        Coffee milkCoffee = new MilkDecorator(simpleCoffee);
        System.out.println("Milk coffee: " + milkCoffee.getDescription() + ", Cost: $" + milkCoffee.cost());

        Coffee whipMilkCoffee = new WhipDecorator(milkCoffee);
        System.out.println("Whip milk coffee: " + whipMilkCoffee.getDescription() + ", Cost: $" + whipMilkCoffee.cost());
    }
}
