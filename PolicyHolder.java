private String fName;
private String lName;
private int age;
private boolean isSmoker;
private double height;
private double weight;
private ArrayList<Policy> policies;

/**
 * Constructor with arguments.
 *
 * @param fName     The policyholder's first name.
 * @param lName     The policyholder's last name.
 * @param age       The policyholder's age.
 * @param isSmoker  The policyholder's smoking status (true if smoker, false if non-smoker).
 * @param height    The policyholder's height in inches.
 * @param weight    The policyholder's weight in pounds.
 */
public PolicyHolder(String fName, String lName, int age, boolean isSmoker, double height, double weight) {
    this.fName = fName;
    this.lName = lName;
    this.age = age;
    this.isSmoker = isSmoker;
    this.height = height;
    this.weight = weight;
    this.policies = new ArrayList<>();
}

/**
 * Adds a policy to the policyholder's list of policies.
 *
 * @param policy The policy to add.
 */
public void addPolicy(Policy policy) {
    this.policies.add(policy);
}

/**
 * Returns the policyholder's first name.
 *
 * @return The policyholder's first name.
 */
public String getfName() {
    return fName;
}

/**
 * Returns the policyholder's last name.
 *
 * @return The policyholder's last name.
 */
public String getlName() {
    return lName;
}

/**
 * Returns the policyholder's age.
 *
 * @return The policyholder's age.
 */
public int getAge() {
    return age;
}

/**
 * Returns true if the policyholder is a smoker, false otherwise.
 *
 * @return True if the policyholder is a smoker, false otherwise.
 */
public boolean isSmoker() {
    return isSmoker;
}

/**
 * Returns the policyholder's height in inches.
 *
 * @return The policyholder's height in inches.
 */
public double getHeight() {
    return height;
}

/**
 * Returns the policyholder's weight in pounds.
 *
 * @return The policyholder's weight in pounds.
 */
public double getWeight() {
    return weight;
}

/**
 * Returns the policyholder's policies.
 *
 * @return The policyholder's policies.
 */
public ArrayList<Policy> getPolicies() {
    return policies;
}

/**
 * Returns a string representation of the PolicyHolder object.
 *
 * @return A string representation of the PolicyHolder object.
 */
public String toString() {
    String smokerStatus = this.isSmoker() ? "smoker" : "non-smoker";
    return String.format("Policyholder's First Name: %s\n" +
                    "Policyholder's Last Name: %s\n" +
                    "Policyholder's Age: %d\n" +
                    "Policyholder's Smoking Status (Y/N): %s\n" +
                    "Policyholder's Height: %.2f inches\n" +
                    "Policyholder's Weight: %.2f pounds\n" +
                    "Policyholder's BMI: %.2f",
            this.getfName(), this.getlName(), this.getAge(), smokerStatus, this.getHeight(), this.getWeight(), this.calculate
Explanation:
(PolicyHolder.java)

import java.util.ArrayList;

public class PolicyHoldeR