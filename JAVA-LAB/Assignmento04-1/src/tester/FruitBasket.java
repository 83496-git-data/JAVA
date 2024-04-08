package tester;

import com.app.fruits.*;

import java.util.Scanner;

public class FruitBasket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fruit[] basket = new Fruit[10];
        int counter = 0;

        while (true) {
            System.out.println("Options:");
            System.out.println("0. Exit");
            System.out.println("1. Add Mango");
            System.out.println("2. Add Orange");
            System.out.println("3. Add Apple");
            System.out.println("4. Display names of all fruits in the basket");
            System.out.println("5. Display name, color, weight, taste of all fresh fruits in the basket");
            System.out.println("6. Display tastes of all stale fruits in the basket");
            System.out.println("7. Mark a fruit as stale");
            System.out.println("8. Mark all sour fruits stale (optional)");

            int option = scanner.nextInt();
            scanner.nextLine();]

            switch (option) {
                case 0:
                    System.out.println("Thank you for using...");
                    return;
                case 1:
                    if (counter < basket.length) {
                        System.out.print("Enter weight of Mango: ");
                        double mangoWeight = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.print("Enter color of Mango: ");
                        String mangoColor = scanner.nextLine();
                        basket[counter++] = new Mango(mangoColor, mangoWeight);
                        System.out.println("Mango added to basket.");
                    } else {
                        System.out.println("Basket is full.");
                    }
                    break;
                case 2:
                    if (counter < basket.length) {
                        System.out.print("Enter weight of Orange: ");
                        double orangeWeight = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.print("Enter color of Orange: ");
                        String orangeColor = scanner.nextLine();
                        basket[counter++] = new Orange(orangeColor, orangeWeight);
                        System.out.println("Orange added to basket.");
                    } else {
                        System.out.println("Basket is full.");
                    }
                    break;
                case 3:
                    if (counter < basket.length) {
                        System.out.print("Enter weight of Apple: ");
                        double appleWeight = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.print("Enter color of Apple: ");
                        String appleColor = scanner.nextLine();
                        basket[counter++] = new Apple(appleColor, appleWeight);
                        System.out.println("Apple added to basket.");
                    } else {
                        System.out.println("Basket is full.");
                    }
                    break;
                    
                case 4:
                    System.out.println("Fruits in the basket:");
                    for (int i=0;i<counter;i++) 
                    {
                        if (basket != null) 
                        {
                            System.out.println(basket[i].getName());
                        }
                    }
                    break;
                case 5:
                    System.out.println("Details of fresh fruits in the basket:");
                  
                    break;

            }
        }
    }
}









































//case 6:
//System.out.println("Tastes of stale fruits in the basket:");
//for (Fruit fruit : basket) {
//  if (fruit != null && !fruit.isFresh) 
//  {
//      System.out.println(fruit.taste());
//  }
//}
//break;
//case 7:
//System.out.print("Enter index of fruit to mark as stale: ");
//int index = scanner.nextInt();
//scanner.nextLine(); // Consume newline
//if (index >= 0 && index < counter) 
//{
//  if (basket[index] != null) 
//  {
//      basket[index].isFresh = false;
//      System.out.println("Fruit marked as stale.");
//  } else {
//      System.out.println("Invalid index.");
//  }
//} else {
//  System.out.println("Invalid index.");
//}
//break;
//case 8:
//System.out.println("Marking all sour fruits as stale:");
//for (Fruit fruit : basket) {
//  if (fruit != null && fruit.taste().equals("Sour")) {
//      fruit.isFresh = false;
//  }
//}
//System.out.println("All sour fruits marked as stale.");
//break;
//default:
//System.out.println("Invalid option.");
