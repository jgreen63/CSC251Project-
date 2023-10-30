public static void displayPolicyInformation(Policy policy) {
    System.out.println("Policy Number: " + policy.getpNumber());
    System.out.println("Provider Name: " + policy.getpName());
    System.out.println("Policyholder's First Name: " + policy.getfName());
    System.out.println("Policyholder's Last Name: " + policy.getlName());
    System.out.println("Policyholder's Age: " + policy.getAge());
    System.out.println("Policyholder's Smoking Status(smoker/non-smoker): " + (policy.isSmoker() ? "smoker" : "non-smoker"));
    System.out.println("Policyholder's Height (in inches): " + policy.getHeight());
    System.out.println("Policyholder's Weight (in pounds): " + policy.getWeight());
    System.out.printf("Policyholder's BMI: %.2f%n", policy.getBMI());
    System.out.printf("Policy Cost: $%.2f%n", policy.getPolicyPrice());
}

This implementation prints all the required information about a Policy object. You can call this method from main() to display the information. For example, if you have an ArrayList policies that contains all the Policy objects, you can loop through the ArrayList and call the displayPolicyInformation() method for each Policy object as follows:
 

for (Policy policy : policies) {
    displayPolicyInformation(policy);
}