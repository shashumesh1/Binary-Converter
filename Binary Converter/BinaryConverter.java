/*
Shashank Umesh
Period 3
 */
public class BinaryConverter
{
    /**
     * A static method that converts the specified int into its binary equivalent
     *  The number input is assumed as integer
     * @param num int type number to convert to binary
     * @return String type of binary equivalent
     */
    public static String convertInt(int num)
    {
        String binary = "";
        String bin = "";
        int result = num;
        int remain = 0;
        while (result != 0)
        {
            result = num / 2;
            remain = num % 2;
            binary = binary + remain;
            num = result;
        }
        for (int i = binary.length() - 1; i >= 0; i--)
        {

            bin = bin + binary.charAt(i);

        }
        return bin;
    }


    /** A static method that converts the specified double into its binary equivalent
     * Note - Assumed that the specified double number is less than 1
     * @param num double type number to convert to binary
     * @return String type of binary equivalent
     */
    public static String convertDouble(Double num)
    {
        String binary = "";
        double result = 1.0;
        int remain = 0;
        while(result != 0) // executes the loop as long as result is not = 0
        {

            if (num >= 1)
                result = num - 1;
            else
                {
                result = num * 2;
                remain = (int) (num * 2);
                binary = binary + remain;
                num = result;
            }
        }
        binary = "0." + binary;
        return binary;
    }

    /**
     * A static method that will convert the specified double into its binary equivalent
     * This method calls convertDouble method if the number is less than 1
     * If the number is greater than 1 the specified number is broken into integer part and decimal part
     * Then convertInt method is called to convert the integer part to its binary equivalent
     * and the decimal part is logically programmed to get its binary equivalent
     * if the number is >=1 and a whole number, only convertInt method is called
     * @param num num double type number to convert to binary
     * @return String type of binary equivalent
     */
    public static String convert(double num)
    {
        String binary = "";
        double result = 1.0;
        int remain = 0;

        // if specified number is less than 1 convertDouble method is called
        if (num < 1)
            binary = binary + convertDouble(num);
        else       // if number >=1, the number is broken into integer and decimal part
        {
            int x = (int)Math.round(num);
            double y = num - x;
            if (y != 0)
            {
                binary = binary + convertInt(x);
                binary = binary + ".";
                while(result != 0)
                {
                    if (y >= 1)
                        result = y - 1;
                    else
                    {
                        result = y * 2;
                        remain = (int) (y * 2);
                        binary = binary + remain;
                        y = result;
                    }
                }
            }
            else  // if the number is a whole number with no decimal part, convertInt method is called
                binary = binary + convertInt(x);
        }
        return binary;
    }
}
