public class PolicyHolder {
    private String fName;
    private String lName;
    private int age;
    private boolean isSmoker;
    private double height;
    private double weight;

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
    }

    /**
     * Returns a string representation of the PolicyHolder object.
     *
     * @return  A string representation of the PolicyHolder object.
     */
    @Override
    public String toString() {
        return "Policyholder's First Name: " + fName + "\n" +
                "Policyholder's Last Name: " + lName + "\n" +
                "Policyholder's Age: " + age + "\n" +
                "Policyholder's Smoking Status (Y/N): " + (isSmoker ? "smoker" : "non-smoker") + "\n" +
                "Policyholder's Height: " + height + " inches\n" +
                "Policyholder's Weight: " + weight + " pounds\n" +
                "Policyholder's BMI: " + calculateBMI() + "\n";
    }

    /**
     * Calculates and returns the policyholder's BMI.
     *
     * @return  The policyholder's BMI.
     */
    public double calculateBMI() {
        return (weight * 703) / (height * height);
    }

    /**
     * Returns the policyholder's first name.
     *
     * @return  The policyholder's first name.
     */
    public String getfName() {
        return fName;
    }

    /**
     * Sets the policyholder's first name.
     *
     * @param fName The policyholder's first name.
     */
    public void setfName(String fName) {
        this.fName = fName;
    }

    /**
     * Returns the policyholder's last name.
     *
     * @return  The policyholder's last name.
     */
    public String getlName() {
        return lName;
    }

    /**
     * Sets the policyholder's last name.
     *
     * @param lName The policyholder's last name.
     */
    public void setlName(String lName) {
        this.lName = lName;
    }

    /**
     * Returns the policyholder's age.
     *
     * @return  The policyholder's age.
     */
    public int getAge() {
        return age;
    }

    /**

     * Sets the policyholder's age.
     *
     * @param age   The policyholder's age.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Returns true if the policyholder is a smoker, false if the policyholder is a non-smoker.
     *
     * @return  True if the policyholder is a smoker, false if the