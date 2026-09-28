import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        double itemPrice;
        double shippingCost;
        double totalPrice;

        System.out.println("Enter the item price: ");
        itemPrice = in.nextDouble();

        if(itemPrice >= 100){
            shippingCost = 0;
        }
        else {
            shippingCost = itemPrice * 0.02;
        }

        totalPrice = itemPrice + shippingCost;

        System.out.println("Shipping Cost: " + shippingCost);
        System.out.println("Total price: " + totalPrice);
    }
}
