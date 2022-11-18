public class Main {
    public static void main(String[] args) {
        char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("Excellent : Passed");
                break;
            case 'B':
                System.out.println("Very Good : Passed");
                break;
            case 'C':
                System.out.println("Improvement needed : Passed");
                break;
            case 'D':
                System.out.println("Close Fail : Passed");
                break;
            case 'F':
                System.out.println("Fail : Passed");
                break;
            default:
                System.out.println("You entered an invalid grade");
                // iki senaryonun da sonucu aynı çıkıyorsa
            //case 'A':
            //case 'B':
            //System.out.println("Improvement needed : Passed"); olabilir.
        }
    }
}