package coffe;

import java.util.*;

public class GroceryStore {
    static Scanner sc = new Scanner(System.in);
    //Cliente
    static int id;
    static String name;
    static String email;
    static String password;

    //Product

    static int productId;
    static String productName;
    static double productPrice;
    static double quantity;

    //Sale
    static int saleId;
    static Date date;
    static String customer;
    static String product;
    static double price;
    static double quantityToSale;
    static double total;
    static String [][] customers = new String[3][4];
    static String[][] products = new String[3][4];
    public static void main(String[] args){

        agregateToCustomers();
        listCustomers();

        agregateToProduct();
        listProduct();

    }

    //Crear 3 clientes, 3 productos
    public static String[] createCustumer() {
        String[] customer = new String[4];

        System.out.println("Ingrese el id");
        id = sc.nextInt();
        customer[0] = id + "";
        sc.nextLine();

        System.out.println("Ingrese el nombre");
        name = sc.nextLine();

        customer[1] = name;

        System.out.println("Ingrese el email");
        email = sc.nextLine();
        customer[2] = email;

        System.out.println("Ingrese el password");
        password = sc.nextLine();
        customer[3] = password;



        return customer;
    }

    static void agregateToCustomers() {

        int i = 0;
        while(i < customers.length) {

            customers[i] = createCustumer();
            i++;

        }
    }

    public static void listCustomers() {
        for (int i = 0; i < customers.length; i++) {
            for (int j = 0; j < customers[i].length; j++) {
                System.out.print(customers[i][j]);
            }
        }

    }

     static String[] createProduct() {
       String[] product = new String[4];

        System.out.println("Ingrese el id del producto");
        productId = sc.nextInt();
        product[0] = productId + "";
        sc.nextLine();

        System.out.println("Ingrese el nombre del producto");
        productName = sc.nextLine();
        product[1] = productName;

        System.out.println("Ingrese precio producto");
        productPrice = sc.nextDouble();
        product[2] = productPrice + "";

        System.out.println("Ingrese la cantidad");
        quantity = sc.nextDouble();
        product[3] = quantity + "";

        return product;
    }

    static void agregateToProduct() {
        int j = 0;
        while( j < products.length) {

            products[j] = createProduct();

            j++;
        }

    }

    public static void listProduct() {
        for (int i = 0; i < products.length; i++) {
            for(int j = 0; j < products[i].length; j++){
                System.out.println(products[i][j]);
            }
        }
    }

    public static void createAdmin(String[] args) {
        String[] admin = new String[3];

        System.out.println("Ingrese el id");
        id = sc.nextInt();

        admin[0] = id + "";
        sc.nextLine();

        name = sc.nextLine();

        System.out.println("Ingrese el password");
        admin[1] = name;

        System.out.println("Ingrese el email");
        email = sc.nextLine();
        admin[2] = email;

        System.out.println("Ingrese la contraseña");
        password = sc.nextLine();
        admin[3] = password;

    }

    //hacer ventas
}
