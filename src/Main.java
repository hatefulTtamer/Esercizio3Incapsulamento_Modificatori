/* Scrivere un programma che contenga una classe che definisce un Auto che abbia come proprietà
cilindrata, targa, marca e modello.
Per questa classe saranno necessari i metodi accessori (getters e setters) ed un costruttore.
Nel main dichiarare un oggetto di tipo Auto.
In questo caso la nota importante è rendere le proprietà della classe auto accessibili solo attraverso i metodi. */

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("AB123CD", "Renault", "Clio", 1400);
        Car car2 = new Car("EF456GH", "FIAT", "Punto", 1600);
        Car car3 = new Car("IL789MN", "Ford", "Fiesta", 1600);
        Car car4 = new Car("OP012QR", "Alfa Romeo", "Giulia", 1900);
        Car car5 = new Car("ST345UV", "Dacia", "Duster", 1700);
        Car car6 = new Car("ZA678CDEF", "BMW", "X6", 2900);
        car6.setPlate("ZA678CD");
        Car car7 = new Car("GH901IL", "Audi", "A4", 2400);
        Car car8 = new Car("MN234OP", "FIAT", "Panda", 1300);
        Car car9 = new Car("QR567STU", "Nissan", "QASHQAI", 2000);
        car9.setPlate("QR567ST");
        Car car10 = new Car("VZ890AB", "Mercedes", "B200", 2300);
        System.out.println(car1.getBrand() + car1.getModel() + " | " + car1.getPlate() + " | " + car1.getEngineSize());
        System.out.println(car2.getBrand() + car2.getModel() + " | " + car2.getPlate() + " | " + car2.getEngineSize());
        System.out.println(car3.getBrand() + car3.getModel() + " | " + car3.getPlate() + " | " + car3.getEngineSize());
        System.out.println(car4.getBrand() + car4.getModel() + " | " + car4.getPlate() + " | " + car4.getEngineSize());
        System.out.println(car5.getBrand() + car5.getModel() + " | " + car5.getPlate() + " | " + car5.getEngineSize());
        System.out.println(car6.getBrand() + car6.getModel() + " | " + car6.getPlate() + " | " + car6.getEngineSize());
        System.out.println(car7.getBrand() + car7.getModel() + " | " + car7.getPlate() + " | " + car7.getEngineSize());
        System.out.println(car8.getBrand() + car8.getModel() + " | " + car8.getPlate() + " | " + car8.getEngineSize());
        System.out.println(car9.getBrand() + car9.getModel() + " | " + car9.getPlate() + " | " + car9.getEngineSize());
        System.out.println(car10.getBrand() + car10.getModel() + " | " + car10.getPlate() + " | " + car10.getEngineSize());
    }
}