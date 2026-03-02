
class Logical {
    public static void main(String[] args) {

        int number = 4;
        int sum = 0;

        System.out.println("Finding sum from 1 to " + number);

        for(int i = 1; i < number; i++) {
            sum = sum + i;
            System.out.println("i = " + i);
            System.out.println("sum = " + sum);
        }

        System.out.println("Final Sum: " + sum);
    }
}