public class task3 {
    public static void main(String[] arg) {
        int slideA = 10;
        int slideB = 6;
        int slideC = 4;

        int hSlideA = 5;
        int hSlideB = 3;
        int hSlideC = 4;

        int area = (hSlideA * slideA) / 2;
        System.out.println("The area A of triangle is " + area);

        int areaTwo = (slideB * hSlideB) / 2;
        System.out.println("The area B of triangle is " + areaTwo);

        int areaThree = (slideC * hSlideC) / 2;
        System.out.println("The area C of triangle is " + areaThree);
    }
}
