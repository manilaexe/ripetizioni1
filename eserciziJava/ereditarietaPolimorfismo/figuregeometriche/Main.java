public class Main {
    public static void main(String[] args) {
        Figura[] figure = new Figura[2];

        figure[0] = new Quadrato(4);
        figure[1] = new Rettangolo(3, 5);

        for (Figura f : figure) {
            System.out.println("Area: " + f.area());
        }
    }
}
