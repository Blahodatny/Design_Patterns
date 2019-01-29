package patterns.creational.builder;

import patterns.creational.builder.builders.CarBuilder;
import patterns.creational.builder.builders.CarManualBuilder;
import patterns.creational.builder.director.Director;

public class BuilderCheck {
    public static void check() {
        var director = new Director();

        // Директор получает объект конкретного строителя от клиента
        // (приложения). Приложение само знает какой строитель использовать,
        // чтобы получить нужный продукт.
        var builder = new CarBuilder();
        director.constructSportsCar(builder);

        // Готовый продукт возвращает строитель, так как Директор чаще всего не
        // знает и не зависит от конкретных классов строителей и продуктов.
        var car = builder.getResult();
        System.out.println("Car built:\n" + car.getType());


        var manualBuilder = new CarManualBuilder();

        // Директор может знать больше одного рецепта строительства.
        director.constructSportsCar(manualBuilder);
        var carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}