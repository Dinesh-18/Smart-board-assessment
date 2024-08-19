import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SmartAssessmentBoard {
    private static Map<String, String> statesAndCapitals = new HashMap<>();

    public static void main(String[] args) {
        initializeStatesAndCapitals(); 

        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to the States and Capitals Quiz!");
        System.out.println("You will be asked to match states with their capitals.");
        System.out.println("Type 'exit' at any time to quit the quiz.");
        System.out.println();

        for (Map.Entry<String, String> entry : statesAndCapitals.entrySet()) {
            String state = entry.getKey();
            String correctCapital = entry.getValue();

            System.out.print("What is the capital of " + state + "? ");
            String userAnswer = scanner.nextLine().trim();


            if (userAnswer.equalsIgnoreCase("exit")) {
                break;
            }

            if (userAnswer.equalsIgnoreCase(correctCapital)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is " + correctCapital + ".");
            }

            System.out.println();
        }

        System.out.println("Quiz completed! Your final score is: " + score + "/" + statesAndCapitals.size());
        scanner.close();
    }

    private static void initializeStatesAndCapitals() {
        statesAndCapitals.put("Andhra Pradesh", "Amaravati");
        statesAndCapitals.put("Arunachal Pradesh", "Itanagar");
        statesAndCapitals.put("Assam", "Dispur");
        statesAndCapitals.put("Bihar", "Patna");
        statesAndCapitals.put("Chhattisgarh", "Raipur");
        statesAndCapitals.put("Goa", "Panaji");
        statesAndCapitals.put("Gujarat", "Gandhinagar");
        statesAndCapitals.put("Haryana", "Chandigarh");
        statesAndCapitals.put("Himachal Pradesh", "Shimla");
        statesAndCapitals.put("Jharkhand", "Ranchi");
        statesAndCapitals.put("Karnataka", "Bengaluru");
        statesAndCapitals.put("Kerala", "Thiruvananthapuram");
        statesAndCapitals.put("Madhya Pradesh", "Bhopal");
        statesAndCapitals.put("Maharashtra", "Mumbai");
        statesAndCapitals.put("Manipur", "Imphal");
        statesAndCapitals.put("Meghalaya", "Shillong");
        statesAndCapitals.put("Mizoram", "Aizawl");
        statesAndCapitals.put("Nagaland", "Kohima");
        statesAndCapitals.put("Odisha", "Bhubaneswar");
        statesAndCapitals.put("Punjab", "Chandigarh");
        statesAndCapitals.put("Rajasthan", "Jaipur");
        statesAndCapitals.put("Sikkim", "Gangtok");
        statesAndCapitals.put("Tamil Nadu", "Chennai");
        statesAndCapitals.put("Telangana", "Hyderabad");
        statesAndCapitals.put("Tripura", "Agartala");
        statesAndCapitals.put("Uttar Pradesh", "Lucknow");
        statesAndCapitals.put("Uttarakhand", "Dehradun");
        statesAndCapitals.put("West Bengal", "Kolkata");
    }
}
