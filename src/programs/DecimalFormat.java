package programs;

public class DecimalFormat {

    private static double beregnAreal(double radius){
        double areal = Math.PI * Math.pow(radius, 2);
        return areal;
    }

    public static void main(String[] args) {
        double radius = 13.23;
        double areal = beregnAreal(radius);

        java.text.DecimalFormat df2 = new java.text.DecimalFormat(".##");
        // DecimalFormat df2 = new DecimalFormat(".##");
        System.out.println("Arealet til en sirkel med radius "+radius+" er "+df2.format(areal));
    }
}