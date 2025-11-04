package stringOperations;

public class Main {
    public static void main(String[] args) {
        CustomString customString = new CustomString("Ojas ");
        System.out.println(customString.append("Joshi"));
        
        StringBuilder s = new StringBuilder("Ojas");
         s = s.append("Joshi");
        
    }
}
