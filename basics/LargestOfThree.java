class LargestOfThree {

    public static void main(String[] args) {

        int a = 10;
        int b = 25;
        int c = 15;

        if(a > b && a > c) {

            System.out.println("A is Largest");

        } else if(b > a && b > c) {

            System.out.println("B is Largest");

        } else {

            System.out.println("C is Largest");
        }
    }
}
