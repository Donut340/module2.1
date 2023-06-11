public class Planet {
    private String designation;
    private double massKg;
    private double orbitEarthYears;
    private PlanetType type;

    public Planet(String designation, PlanetType type) {
        this.designation = designation;
        this.type = type;
    }

    public Planet(String designation, double massKg, double orbitEarthYears, PlanetType type) {
        this.designation = designation;
        this.massKg = massKg;
        this.orbitEarthYears = orbitEarthYears;
        this.type = type;
    }

    /**
     * Overrides the equals method to compare two Planet objects based on their designation.
     *
     * @param obj the object to compare
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Planet other = (Planet) obj;
        return designation.equals(other.designation);
    }

    /**
     * Overrides the hashCode method to generate a unique hash code based on the designation.
     *
     * @return the hash code value
     */
    @Override
    public int hashCode() {
        return designation.hashCode();
    }

    /**
     * Overrides the toString method to return a string representation of the Planet object.
     * The string includes the designation and type of the planet.
     *
     * @return the string representation of the Planet object
     */
    @Override
    public String toString() {
        return "Planet{" +
                "designation='" + designation + '\'' +
                ", type=" + type +
                '}';
    }

    /**
     * The PlanetType enum represents the different types of planets.
     */
    public enum PlanetType {
        TERRESTRIAL,
        GAS_GIANT,
        ICE_GIANT
    }
}
