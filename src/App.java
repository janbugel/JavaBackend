// import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        String name = "doe";
        System.out.println(App.AddQuestionMark(App.AddExclamationPoint(name.toUpperCase())));
        System.out.println(Animal.IamADog());       
        
    }

    public static String AddExclamationPoint(String s) {
        return s + "!";
    }

    public static String AddQuestionMark(String q) {
        return q + "?";
    }
}
