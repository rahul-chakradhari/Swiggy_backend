import java.util.*;

public class SwiggyTest {

    // ID generators
    private static int userIdCounter = 1;
    private static int paymentIdCounter = 100;
    private static int orderIdCounter = 500;
    private static int restaurantIdCounter = 1000;

    public static void main(String[] args) {
        System.out.println("\n=== Welcome to Swiggy App ===");
        System.out.println("Food seems like home || ghar ke jaisa khana Swiggy se hi mangana || namma Bengaluru");
        Scanner sc = new Scanner(System.in);
        Payment paymentObj = null;
        double amount = 0;
        while (true) {

            System.out.println("Services provided by us -->");
            System.out.println("1. User Services");
            System.out.println("2. Payment Services");
            System.out.println("3. Restaurant Services");
            System.out.println("4. Order Services");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int n = sc.nextInt();

            switch (n) {
                case 1:
                    System.out.println("----- User Services -----");
                    System.out.println("1. Customer");
                    System.out.println("2. Admin");
                    System.out.println("3. Delivery Partner");
                    System.out.print("Enter your choice: ");
                    int userChoice = sc.nextInt();

                    System.out.print("Enter Name: ");
                    String name = sc.next();
                    System.out.print("Enter Phone: ");
                    long phone = sc.nextLong();
                    System.out.print("Enter Address: ");
                    String address = sc.next();

                    int userId = userIdCounter++;

                    switch (userChoice) {
                        case 1:
                            Customer c = new Customer(userId, name, phone, address);
                            c.displayProfile();
                            break;
                        case 2:
                            Admin a = new Admin(userId, name, phone, address);
                            a.displayProfile();
                            break;
                        case 3:
                            DeliveryPartner d = new DeliveryPartner(userId, name, phone, address);
                            d.displayProfile();
                            break;
                        default:
                            System.out.println("Invalid User Service choice!");
                    }
                    break;

                case 2:
                    System.out.println("----- Payment Services -----");
                    System.out.println("1. UPI Payment");
                    System.out.println("2. Card Payment");
                    System.out.println("3. Cash Payment");
                    System.out.print("Enter your choice: ");
                    int payChoice = sc.nextInt();

                    System.out.print("Enter amount: ");
                    amount = sc.nextDouble();

                    String paymentMode;
                    switch (payChoice) {
                        case 1:
                            paymentMode = "UPI";
                            break;
                        case 2:
                            paymentMode = "Card";
                            break;
                        case 3:
                            paymentMode = "Cash";
                            break;
                        default:
                            paymentMode = "Unknown";
                    }

                    int paymentId = paymentIdCounter++;

                    paymentObj = new Payment(paymentId, amount, paymentMode, "Pending");
                    paymentObj.makePayment();
                    paymentObj.checkStatus();
                    System.out.print("Do you want a refund? (yes/no): ");
                    String refundChoice = sc.next();

                    if (refundChoice.equalsIgnoreCase("yes")) {
                        paymentObj.refundPayment();
                    }

                    break;

                case 3:
                    System.out.println("----- Restaurant Services -----");
                    int restId = restaurantIdCounter++;
                    Restaurant r = new Restaurant(restId, "Indian", 4.5);

                    int restChoice;
                    do {
                        System.out.println("\nRestaurant Menu Options:");
                        System.out.println("1. Show Menu");
                        System.out.println("2. Add Dish");
                        System.out.println("3. Update Dish");
                        System.out.println("4. Remove Dish");
                        System.out.println("0. Back to Main Menu");
                        System.out.print("Enter your choice: ");
                        restChoice = sc.nextInt();

                        switch (restChoice) {
                            case 1:
                                r.showMenu();
                                break;
                            case 2:
                                System.out.print("Enter new dish: ");
                                String newDish = sc.next();
                                r.addDish(newDish);
                                break;
                            case 3:
                                System.out.print("Enter dish index to update: ");
                                int updIndex = sc.nextInt();
                                System.out.print("Enter updated dish name: ");
                                String updatedDish = sc.next();
                                r.updateDish(updIndex, updatedDish);
                                break;
                            case 4:
                                System.out.print("Enter dish index to remove: ");
                                int remIndex = sc.nextInt();
                                r.removeDish(remIndex);
                                break;
                            case 0:
                                System.out.println("Returning to Main Menu...");
                                break;
                            default:
                                System.out.println("Invalid choice! Try again.");
                        }
                    } while (restChoice != 0);
                    break;
                case 4:
                    System.out.println("----- Order Services -----");
                    if (paymentObj == null) {
                        System.out.println("Please make a payment first in Payment Services.");
                        break;
                    }

                    Customer cust = new Customer(userIdCounter++, "Dinga", 9876543210L, "Bangalore");
                    Order o = new Order(orderIdCounter++, cust, paymentObj, paymentObj.getAmount(), "Pending");

                    int orderChoice;
                    do {
                        System.out.println("\nOrder Menu Options:");
                        System.out.println("1. Place Order");
                        System.out.println("2. Cancel Order");
                        System.out.println("3. Track Order");
                        System.out.println("4. Update Order Status");
                        System.out.println("0. Back to Main Menu");
                        System.out.print("Enter your choice: ");
                        orderChoice = sc.nextInt();

                        switch (orderChoice) {
                            case 1:
                                o.placeOrder();
                                break;
                            case 2:
                                o.cancelOrder();
                                break;
                            case 3:
                                o.trackOrder();
                                break;
                            case 4:
                                System.out.print("Enter new status (Preparing/Delivered/etc.): ");
                                String newStatus = sc.next();
                                o.updateStatus(newStatus);
                                break;
                            case 0:
                                System.out.println("Returning to Main Menu...");
                                break;
                            default:
                                System.out.println("Invalid choice! Try again.");
                        }
                    } while (orderChoice != 0);
                    break;

                case 0:
                    System.out.println("Thank you for using Swiggy App! Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid main menu choice!");
            }

        }

    }

}
