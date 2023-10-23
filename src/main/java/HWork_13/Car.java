package HWork_13;

public class Car {
    private String model;
    private double engineVolume;
    private EngineType engineType;
    private int horsepower;
    private double weight;
    private  int seats;
    private CarType carType;
    private int maxSpeed;
    private String additionalInfo;

    // Перечисление типов двигателя
    public enum EngineType {
        GASOLINE, DIESEL, ELECTRIC, HYBRID
    }
    // Перечисление типов автомобиля
    public enum CarType{
        SEDAN, COUPE, CONVERTIBLE, HATCHBACK, SUV, CROSSOVER, MINIVAN, PICKUP
    }

    public Car(){}

    public Car(String model, double engineVolume, EngineType engineType, int horsepower, double weight, int seats, CarType carType, int maxSpeed){
        this.model = model;
        this.engineVolume = engineVolume;
        this.engineType = engineType;
        this.horsepower = horsepower;
        this.weight = weight;
        this.seats = seats;
        this.carType = carType;
        this.maxSpeed = maxSpeed;
        this.additionalInfo = "Default Info";
    }

    // Геттеры и сеттеры для полей
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }
    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public EngineType getEngineType() {
        return engineType;
    }
    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public int getHorsepower() {
        return horsepower;
    }
    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getSeats() {
        return seats;
    }
    public void setSeats(int seats) {
        this.seats = seats;
    }

    public CarType getCarType() {
        return carType;
    }
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void addFeatures(String... features) {
        StringBuilder featureList = new StringBuilder();
        for (String feature : features) {
            featureList.append(feature).append(" ");
        }
        additionalInfo = featureList.toString();
    }

    // Метод для вычисления расхода топлива/заряда на 100 км
    // Взяла простую логику - для электромобиля: расход электроэнергии = мощность (в лошадиных силах)*10 и
    // расход для других типов двигателей = объем двигателя/10
    public double calculateFuelConsumption() {
        if (engineType == EngineType.ELECTRIC) {

            return horsepower * 10;
        } else {
            return engineVolume / 10;
        }
    }

    public double elRequiredForTrip(double distance) {
        if (engineType == EngineType.ELECTRIC){
            System.out.println("Расход заряда на " + distance + " км составит: "
                    + ((calculateFuelConsumption()) * distance) + " кВт.");
        } return (calculateFuelConsumption())  * distance;
    }

    public double calculateFuelConsumption(double distance) {
        double consumption = calculateFuelConsumption() * distance;
        System.out.println("Расход топлива на " + distance + " км составит: " + consumption + " литров");
        return consumption;
    }

    public double calculateFuelConsumption(double distance, double fuelPrice) {
        double consumption = calculateFuelConsumption() * distance;
        double cost = consumption * fuelPrice;
        System.out.println("Стоимость топлива за поездку составит: $" + cost);
        return cost;
    }

    // Перегруженный метод toString для вывода информации о машине
    @Override
    public String toString (){
        return "'" + model + '\'' +
                ", объем двигат. = " + engineVolume +
                ", тип двигателя = " + engineType +
                ", мощность = " + horsepower +
                " л.с., вес= " + weight +
                " т, колич. сидений = " + seats +
                " шт., тип кузова = " + carType +
                ", maxSpeed = " + maxSpeed +
                " км/час, доп.инфо = " + additionalInfo;
    }
}
