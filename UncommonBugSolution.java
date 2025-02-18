public class UncommonBugSolution {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            if (i == 5) {
                //Corrected: Increment i before continue, maintaining expected behavior
                i++;
                continue; 
            }
            System.out.println("This line will be executed when i is not 5");
            i++;
        }
    }
} 