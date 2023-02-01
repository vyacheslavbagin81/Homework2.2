package com.skypro.javacourse.lessons;
public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean tires;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public boolean isTires() {
        return tires;
    }

    public void setTires(boolean tires) {
        this.tires = tires;
    }

    public Car(String brand, String model, double engineVolume, String color, int year, String country,
               String transmission, String bodyType, String registrationNumber, int numberOfSeats) {
        if (brand == null || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (country == null || country.isBlank()) {
            this.country = "default";
        } else {
            this.country = country;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null || color.isBlank()) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (transmission == null || transmission.isBlank()) {
            this.transmission = "Механическая";
        } else {
            this.transmission = transmission;
        }if (bodyType == null || bodyType.isBlank()) {
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }if (registrationNumber == null || registrationNumber.isBlank()) {
            this.registrationNumber = "Х000ХХ";
        } else {
            this.registrationNumber = registrationNumber;
        }if (numberOfSeats <= 0 || numberOfSeats > 8) {
            this.numberOfSeats = 5;
        } else {
            this.numberOfSeats = numberOfSeats;
        }
    }

    public boolean changingTires(int mount) {
        if ((9 < mount && mount < 13) || (0 < mount && mount < 4)) {
            tires = true;
        }
        return tires;
    }

    @Override
    public String toString() {
        String tiresSeason;
        if (tires) {
            tiresSeason = "Зимняя";
        } else {tiresSeason = "Летняя";}
        return "Автомобиль: " +
                "марка - " + brand + ";" +
                " модель - " + model + ";" +
                " объем двигателя - " + engineVolume + ";" +
                " цвет кузова - " + color + ";" +
                " год выпуска - " + year + ";" +
                " страна сборки - " + country + ";\n" +
                "            коробка передач - " + transmission + ";" +
                " тип кузова - " + bodyType + ";" +
                " регистрационный номер - " + registrationNumber + ";" +
                " колличество мест - " + numberOfSeats + ";" +
                " резина - " + tiresSeason + "\n"+
                "-------------------------------------------------------------------------------------------------------------------------\n";
        }
}
