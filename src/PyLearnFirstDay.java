public class PyLearnFirstDay {

    public static void main(String[] args) {
        // generate a random number between 1 and 100
        int number = (int) (Math.random() * 100) + 1;
        System.out.println("The number is " + number);
        // if the number is divisible by 5, print "HiFive"
        if (number % 5 == 0) {
            System.out.println("HiFive");
        }
        // if the number is divisible by 2, print "HiEven"
        // if the number is divisible by 5 and 2, print "HiFive" and "HiEven"
        if (number % 2 == 0) {
            System.out.println("HiEven");
        }
    }
}
