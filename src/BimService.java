public class BimService {
    public int colculate(int mass, double height) {
        double square = height * height;
        int resolt = (int) (mass / square);
        return resolt;
    }
}

