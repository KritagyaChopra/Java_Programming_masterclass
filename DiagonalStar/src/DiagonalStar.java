public class DiagonalStar {
    public static void printSquareStar(int number){
        if(number<5) {
            System.out.println("Invalid Value");
            return;
        }
        String s = "*";
        String b = " ";
        for (int i = 0; i < number; i++) {
            for (int i1 = 0; i1 < number; i1++) {
                if(i==0 || i ==number-1 || i1==0 || i1 ==number-1 || i == i1 || i1 == (number - i -1))
                    System.out.print(s);
                else
                    System.out.print(b);
            }
            System.out.print("\n");
        }
    }
}
