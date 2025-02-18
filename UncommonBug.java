public class UncommonBug {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println(i++);
            if (i == 5) {
                continue; // Skip the rest of the loop body for i=5
            }
            System.out.println("This line will not be executed when i = 5");
        }
    }
}