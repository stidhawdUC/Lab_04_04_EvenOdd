public class Main {
    public static void main(String[] args) {
        // one more time, let's do this
        int numberChosen = 0;
        int postModuloRemnant = 0;

        System.out.println("Please enter a number to see if it is even or odd.");
        numberChosen = 2;

        postModuloRemnant = numberChosen % 2;
        if (postModuloRemnant == 0) {
            System.out.println("The number you chose, " + numberChosen + ", is EVEN.");
        }
        else {
            System.out.println("The number you chose, " + numberChosen + ", is ODD.");
        }
    }
}