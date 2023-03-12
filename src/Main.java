public class Main {
    public static void main(String[] args) {
        BimService service = new BimService();
        int bodyMassIndex = service.colculate(76, 1.77);
        System.out.println("Индекс массы тела " + bodyMassIndex);
    }
}