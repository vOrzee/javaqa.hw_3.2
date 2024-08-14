public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightInMeters = 1.87;
        double weightInKilograms = 98;
        int index = service.calculate(heightInMeters, weightInKilograms); // должно получиться 28
        System.out.println(index);
    }
}