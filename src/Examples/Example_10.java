package Examples;

public class Example_10 {
    public static int m() {
        try {
            System.out.println("0");
            return 15;
        } finally {
            System.out.println("1");
            return 20; //Вернулось это значение, скорее всего потоьу-что этот блок выполнялся последним
        }
    }

    public static void main(String[] args) {
        System.out.println(m());
    }

}
