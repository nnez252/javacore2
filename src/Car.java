public class Car {
    String brand;
    String model;
    float engineVolume;
    String color;
    int yers;
    String contry;

    public Car(String brand, String model, float engineVolume, String color, int yers, String contry) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.yers = yers;
        this.contry = contry;
    }

    void auto() {
        System.out.println(brand+" "+model+" "+yers+" год выпуска,сборка в "+contry+" "+ color+" цвет"+" Обьем двигателя "+ engineVolume+" л");
    }
}
