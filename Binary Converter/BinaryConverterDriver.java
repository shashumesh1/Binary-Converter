public class BinaryConverterDriver
{
    public static void main(String[] args)
    {
        System.out.println("100 decimal is " + BinaryConverter.convertInt(100) + " binary.");
        System.out.println("0.125 decimal is " + BinaryConverter.convertDouble(0.125) + " binary.");
        System.out.println("404.03125 decimal is " + BinaryConverter.convert(404.03125) + " binary.");
    }
}
