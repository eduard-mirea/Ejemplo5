    import javax.swing.plaf.synth.SynthOptionPaneUI;
    import java.util.Scanner;
public class Ejemplo5 {
    public static void main(String[] args) {
        double radius;
        double length;
        double area;

        Scanner inputValue = new Scanner(System.in);

        System.out.println("introduce radius: ");
        radius = inputValue.nextFloat();

        inputValue.close();

        length = 2 * Math.PI * radius ;
        area    =   Math.PI *   radius  *   radius;
        System.out.println("length: "   +   length);
        System.out.println("area:   "   +   area);

    }
}
