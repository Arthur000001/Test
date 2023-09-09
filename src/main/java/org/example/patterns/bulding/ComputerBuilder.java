package org.example.patterns.bulding;
/**
 * Строитель
 * */
public interface ComputerBuilder {
    /**
     * Создать процессор
     * */
    void buildProcessor(String processor);
    /**
     * Создать РАМ
     * */
    void buildRAM(int ram);
    /**
     * Хер его знает что это такое
     * */
    void buildStorage(int storage);
    /**
     * Получение готовой продукции
     * */
    Computer getResult();
}