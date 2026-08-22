import java.util.Scanner;
public class Main{

    int base = 50;
    String maincoupon = "£fgas";

    public double calculateShipping(double weight)
    {
        double itemprice = base + (10 * weight);
        return itemprice;
    }

    public double calculateShipping(double weight, int distance)
    {
        double itemprice = calculateShipping(weight) + (2 * distance);
        return itemprice;
    }

    public double calculateShipping(double weight, int distance, boolean isExpress)
    {
        double itemprice = calculateShipping(weight, distance) + (100);
        return itemprice;
    }

    public double calculateCartTotal(double[] itemprices)
    {
        double carttotal=0;
        for (double item : itemprices)
        {carttotal += item;
        }

        return carttotal;
    }

    public double applyCoupon(double normalTotal, String coupon)
    {
        if (coupon == maincoupon)
        {
            double newTotal = (normalTotal - (0.12 * normalTotal));
            return newTotal;
        }
        else
        {
            System.out.println("Coupon not foind");
            return normalTotal;
        }
    }

    public void generateInvoice(double[] itemprices, int distance , String coupon, boolean isexpress, double weight)
    {   double shipping = !(distance > 0)  ? calculateShipping(weight) : isexpress ? calculateShipping(weight, distance, isexpress) : calculateShipping(weight, distance );
        double carttotal = calculateCartTotal(itemprices);
        double totalinvoice = applyCoupon(carttotal , coupon) + shipping;
        System.out.println("Total Invoice: " + totalinvoice);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Main main = new Main();
        double[] itemprices = new double[3];
        for (int i = 0; i < 3; i++)
        {
            System.out.println("Enter item price: ");
            double itemprice = sc.nextDouble();
            itemprices[i] = itemprice;
        }
        boolean isexpress = false;
        System.out.println("Enter distance: ");
        int distance = sc.nextInt();
        System.out.println("Enter weight: ");
        double weight = sc.nextDouble();
        System.out.println("Enter coupon code: ");
        String coupon = sc.next();
        System.out.println("Is express shipping? (y/n): ");
        char expressChoice = sc.next().charAt(0);
        if (expressChoice == 'y' || expressChoice == 'Y')
        {
            isexpress = true;}

        System.out.println("Generating invoice...");
        main.generateInvoice(itemprices, distance, coupon, isexpress, weight);
    }
}