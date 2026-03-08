public class PackageSorter {

    public static String sort(int width, int height, int length, int mass) {

        int score = 0;

        long volume = (long) width * height * length;

        if (width >= 150 || height >= 150 || length >= 150 || volume >= 1_000_000) {
            score++; 
        }

        if (mass >= 20) {
            score++; 
        }

        if (score == 2) {
            return "REJECTED";
        } else if (score == 1) {
            return "SPECIAL";
        } else {
            return "STANDARD";
        }
    }

    public static void main(String[] args) {

        System.out.println(sort(100, 100, 100, 10)); 
        System.out.println(sort(50, 50, 50, 10));    
        System.out.println(sort(200, 50, 50, 25));   
        System.out.println(sort(149, 149, 149, 19)); 

    }
}
