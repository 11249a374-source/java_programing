public class MarksAbove60 {
    public static void main(String[] args) {
        int[] marks = {45, 67, 89, 52, 76, 60, 95, 58};

        System.out.println("Marks above 60:");

        for (int mark : marks) {
            if (mark > 60) {
                System.out.println(mark);
            }
        }
    }
}