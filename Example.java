public class Example {
    public static void main(String[] args) {
        int bottles = 100;
        String word = "bottles";

        while (bottles >= 0) {
            String songStr = String.format("%d %s of beer,", bottles, word);
            if (bottles == 0) {
                songStr = "No more bottles of beer";
            }

            System.out.println(songStr + " on the wall,");
            System.out.println(songStr);
            if (bottles > 0) {
                System.out.println(String.format("Take on down pass, it around"));
            }
            bottles -= 1;
            word = "bottles";
            if (bottles == 1) {
                word = "bottle";
            }
            System.out.println(songStr);
            System.out.println("");
            System.out.println("");
        }
    }
}