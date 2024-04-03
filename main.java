public class Main {
  public static void main(String[] args) {
  
    int temperature = 4;

    if (temperature <=5) {
      System.out.println("Wear super warm clothes!");
    } 
    else if (temperature >6 && temperature <= 15) {
      System.out.println("Wear warm clothes!");
    }
    else if (temperature >16 && temperature <= 30) {
      System.out.println("Wear normal clothers!");
    } 
    else if (temperature >31) {
      System.out.println("You need cooling!");
    } 
    else {
        System.out.println("Enter correct temperature.");
    } 
    }
}
