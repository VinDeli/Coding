package com.Java;

public class Pet {
    //Static constants for defaults and rates
    public static final int DEFAULT__DOG_SPACES = 20, DEFAULT_CAT_SPACES = 10;
    public static final double DOG_BOARDING_RATE = 25.00, CAT_BOARDING_RATE = 20.00;

    //Attributes and declarations on one line
    private String petType, petName;
    private int petAge, dogSpaces, catSpaces, daysStay;
    private double amountDue;
    private boolean grooming; //Indicates if grooming service is requested (applicable to dogs)

    /**
     * Default constructor initializes all attributes to default values.
     * Delegates to the parameterized constructor.
     */
    public Pet() { this ("", "", 0, 0); }

    /**
     * Parameterized constructo initializes attributes and calculates amountDue.
     */
    public Pet(String petType, String petName, int petAge, int daysStay) {
        setPetType(petType); setPetName(petName); setPetAge(petAge); setDaysStay(daysStay);
        this.dogSpaces = DEFAULT__DOG_SPACES; this.catSpaces = DEFAULT_CAT_SPACES;
        this.grooming = false; // Default: no grooming requested
        calculateAmountDue();

    }

    // Accessor (getter) methods
    public String getPetType() { return petType; }
    public String getPetName() { return petName; }
    public int getPetAge() { return petAge; }
    public int getDogSpaces() { return dogSpaces; }
    public int getCatSpaces() { return catSpaces; }
    public int getDaysStay() {return daysStay; }
    public double getAmountDue() { return amountDue; }
    public boolean isGrooming() { return grooming; }

    // Mutator (setter) methods
    public void setPetType(String petType) {
        this.petType = (petType == null || petType.isEmpty() ||
            (!petType.equalsIgnoreCase("Dog") && !petType.equalsIgnoreCase("Cat"))) ? "Dog" : petType;
        calculateAmountDue();
    }
    public void setPetName(String petName) { this.petName = (petName == null || petName.isEmpty()) ? "No Name" : petName; }
    public void setPetAge(int petAge) { this.petAge = (petAge < 0) ? 0 : petAge; }
    public void setDogSpaces(int dogSpaces) { this.dogSpaces = (dogSpaces < 0) ? 0 : dogSpaces; }
    public void setCatSpaces(int catSpaces) { this.catSpaces = (catSpaces < 0) ? 0 : catSpaces; }
    public void setDaysStay(int daysStay) { this.daysStay = (daysStay < 0) ? 0 : daysStay; calculateAmountDue(); }
    public void setAmountDue(double amountDue) { this.amountDue = (amountDue < 0) ? 0.0 : amountDue; }
    public void setGrooming(boolean grooming) { this.grooming = grooming; calculateAmountDue(); }

    //Private helper method to calcualte boarding fee based on pet type and daysStay
    private void calculateAmountDue() {
        if (petType.equalsIgnoreCase("Dog")) {
            this.amountDue = this.daysStay * DOG_BOARDING_RATE;
            // If dog stays longer than 3 days and grooming is requested, add a flat $70 fee.
            if (this.daysStay > 3 && grooming)
                this.amountDue += 70;
        } else { //petType is "Cat"
            this.amountDue = this.daysStay * CAT_BOARDING_RATE;
        }
    }

    @Override
    public String toString() {
        return "Pet [Type: " + petType + ", Name: " + petName + ", Age: " + petAge +
            ", Days Stay: " + daysStay + ", Grooming: " + grooming +
            ", Amount Due: $" + amountDue + "]";
    }
}