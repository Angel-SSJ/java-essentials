public class Multiplos {
    public static void main(String[] args) {
        int i = 0;
        int numberOne=3;
        int numberTwo=30;

        do {
            if (i % numberOne == 0) {
                System.out.println(i);
            }
            i++;
        } while (i <=numberTwo);

        /* Otra forma de hacerlo
        do{
            System.out.println(i);
            i=i+numberOne;
        } while(i<=numberTwo);*/
    }
}
