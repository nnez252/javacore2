public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("lada", "Grant", 1.7f, "желтый", 2015, "Россия");
        car1.auto();
        Car car2 = new Car("Audi", "A8 50L TDI quattro", 3.0f, "черный", 2020, "Германия");
        car2.auto();
        Car car3 = new Car("BMW", "Z8", 3.0f, "черный", 2021, "Германия");
        car3.auto();
        Car car4 = new Car("Kia", "Sportage 4", 2.4f, "красный", 2018, "Южная Корея");
        car4.auto();
        Car car5 = new Car("Hyundai", "Avante", 1.6f, "оранджевый", 2016, "Южная Корея");
        car5.auto();
    }
}