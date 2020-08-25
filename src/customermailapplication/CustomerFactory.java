package customermailapplication;

public class CustomerFactory {
    public static Customer createCustomer (String Type) {
        if (Type.equals("Regular")) {
            return new RegularCustomer();
        }
        else if (Type.equals("Mountain")) {
            return new MountainCustomer();
        }
        else if (Type.equals("Delinquent")) {
            return new DelinquentCustomer();
        }
        return null;
    }
}