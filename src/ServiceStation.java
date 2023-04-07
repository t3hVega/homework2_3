public class ServiceStation {
    public void check(Bicycle bicycle) {
            System.out.println("Обслуживаем " + bicycle.getModelName());
            bicycle.updateTyre();
    }
    public void check(Car car) {
        System.out.println("Обслуживаем " + car.getModelName());
        car.updateTyre();
        car.checkEngine();
    }
    public void check(Truck truck) {
        System.out.println("Обслуживаем " + truck.getModelName());
        truck.updateTyre();
        truck.checkEngine();
        truck.checkTrailer();
    }
}