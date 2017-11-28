/**
 * Created by Koit on 28.11.2017.
 */
public class Teliapraktiline {
    public static void main(String[] args) {

        angle(24, 00);
    }

    public static double angle(int h, int m) {
        double hAngle = 0.5D * (h * 60 + m);
        double mAngle = 6 * m;
        double angle = Math.abs(hAngle - mAngle);
        if (h < 0 || m < 0 || h > 24 || m > 60) {

            System.out.println("Wrong input!");

        } else {

            angle = Math.min(angle, 360 - angle);
            System.out.println(angle);
            return angle;
        }
        return angle;
    }
}





