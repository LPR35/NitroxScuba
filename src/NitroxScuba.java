import java.util.Scanner;
//---------------------------------------------------------------------------
public class NitroxScuba {

    private static final Scanner keyboard = new Scanner(System.in);

    //---------------------------------------------------------------------------
    public static void main(String[] args) {
        double FEET_PER_ATMOSPHERE = 33;

//------------------------------------------------------------------------Variables
        double depth;
        double percentage_o2;
        double Ambient_pressure;
        double o2_pressure;
        double o2_group_value;
        char o2_group_letter;
        boolean ExceedsMax;
        boolean ExceedsContingency;

//------------------------------------------------------------------------User Input
        System.out.println("Enter depth and percentage o2   :");
        depth = keyboard.nextDouble();
        percentage_o2 = keyboard.nextDouble();

//-------------------------------------------------------------------------Calculations
        Ambient_pressure = (depth / FEET_PER_ATMOSPHERE) + 1;
        o2_pressure = Ambient_pressure * (percentage_o2 / 100);
        o2_group_value = o2_pressure * 10;
        o2_group_letter = (char) ((int) (o2_group_value) + (int) ('A'));

        ExceedsMax = o2_pressure >= 1.4;
        ExceedsContingency = o2_pressure >= 1.6;



//-----------------------------------------------------------------------Output
        System.out.println("Ambient pressure                :" + Ambient_pressure);
        System.out.println("o2 pressure                     :" + o2_pressure);
        System.out.println("o2 group                        :" + o2_group_letter);
        System.out.println("Exceeds maximal o2 pressure     :" + ExceedsMax);
        System.out.println("Exceeds contingency o2 pressure :" + ExceedsContingency);



    }

}
