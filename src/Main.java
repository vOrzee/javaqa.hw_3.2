public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightInMeters = 170;
        double weightInKilograms = 70;
        int index = service.calculate(heightInMeters, weightInKilograms); // должно получиться 28
        System.out.println(index);
    }
}