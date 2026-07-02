public class main {
     public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            switch (i) {
                case 0:
                    System.out.println("🚀 Program Started");
                    break;

                case 3:
                    System.out.println("Reached 3");
                    break;

                case 5:
                    System.out.println("Halfway There");
                    break;

                case 7:
                    System.out.println("Almost Done");
                    break;

                case 9:
                    System.out.println("🎉 Program Finished");
                    break;

                default:
                    System.out.println("Current Value : " + i);
            }
        }
    }


}
