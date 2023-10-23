package HWork_13;

public class Main {
    public static void main(String[] args) {
        Car maybach = new Car("Mercedes-Maybach S 680", 6.0, Car.EngineType.GASOLINE, 621, 2.48, 4, Car.CarType.SEDAN, 250);
        maybach.addFeatures("Роскошный салон из натуральной кожи,", "Раздвижные задние сиденья");

        Car bentley = new Car("Bentley Continental GT", 6.0, Car.EngineType.GASOLINE, 635, 2.27, 4, Car.CarType.COUPE, 333);
        bentley.addFeatures("Подогреваемые и массажные сиденья,", "Naim аудиосистема");

        Car rollsRoyce = new Car("Rolls-Royce Phantom", 6.8, Car.EngineType.GASOLINE, 563, 2.56, 5, Car.CarType.SEDAN, 250);
        rollsRoyce.addFeatures("\nДеревянная отделка салона,", "Подсветка звездного неба");

        Car teslaModelS = new Car("Tesla Model S", 0, Car.EngineType.ELECTRIC, 762, 2.2, 5, Car.CarType.SEDAN, 200);
        teslaModelS.addFeatures("Гигантский сенсорный дисплей,", "Автопилот");

        System.out.println("\nДанные о машине Mercedes-Maybach:");
        System.out.println(maybach);

        System.out.println("\nДанные о машине Bentley:");
        System.out.println(bentley);

        System.out.println("\nДанные о машине Rolls-Royce:");
        System.out.println(rollsRoyce);

        System.out.println("\nДанные о машине Tesla:");
        System.out.println(teslaModelS);

        // Рассчитываем расход топлива для поездки
        double distance = 325.5; // расстояние в км
        double fuelPrice = 1.9; // цена топлива в $ за литр
        System.out.println("\nРасход топлива для машины Mercedes-Maybach:");
        maybach.calculateFuelConsumption(distance);
        maybach.calculateFuelConsumption(distance, fuelPrice);

        System.out.println("\nРасход топлива для машины Bentley:");
        bentley.calculateFuelConsumption(distance, fuelPrice);

        System.out.println("\nРасход топлива для машины Rolls-Royce:");
        rollsRoyce.calculateFuelConsumption(distance, fuelPrice);

        System.out.println("\nРасход заряда для машины Tesla:");
        teslaModelS.elRequiredForTrip(distance);
    }
}

