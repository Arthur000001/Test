package org.example.patterns.singleton;

public class Singleton {
    // Приватный конструктор, чтобы предотвратить создание экземпляров извне
    private Singleton() {}

    // Внутренний статический класс для ленивой инициализации экземпляра
    private static class SingletonHolder {
        private static final Singleton instance = new Singleton();
    }

    // Метод для получения экземпляра Singleton, создает его при первом вызове
    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }

    // Другие методы экземпляра
    public void doSomething() {
        System.out.println("I something do!");
    }
}
