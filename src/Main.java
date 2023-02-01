public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 0, "желтый", 2015, "Россия");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3, "черный", 0, "Германия");
        Car bmw = new Car("BMW", "Z8", 3, "", 2021, "Германия");
        Car kia = new Car("Kia", "   ", 2.4, "красный", 2018, "Южная Корея");
        Car hyundai = new Car(null, "Avante", 1.6, "оранжевый", 2016, "Южная Корея");

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
    }
}