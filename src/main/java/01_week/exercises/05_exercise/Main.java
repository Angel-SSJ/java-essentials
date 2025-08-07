public class Main {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int five = 5;
        for (int number : numbers) {
            System.out.println(number+"x"+five+"="+(number*five));
        }
    }
}