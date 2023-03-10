import com.skypro.javacourse.lessons.Car;
public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 0, "желтый", 2015, "Россия", "Механическая", "Седан", "К186КК", 5);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3, "черный", 0, "Германия", "Автомат", "Седан", "Е565НГ", 5);
        Car bmw = new Car("BMW", "Z8", 3, "", 2021, "Германия", "Автомат", "Купе", "А100АА", 2);
        Car kia = new Car("Kia", "   ", 2.4, "красный", 2018, "Южная Корея", "Автомат", "Кроссовер", "К987ВЕ", 5);
        Car hyundai = new Car(null, "Avante", 1.6, "оранжевый", 2016, "Южная Корея", "Автомат", "Седан", "", 5);

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);

        lada.changingTires(5);
        audi.changingTires(11);
        bmw.changingTires(10);
        kia.changingTires(6);
        hyundai.changingTires(1);

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);

        lada.key("да", "нет");
        System.out.println(lada);
    }
}