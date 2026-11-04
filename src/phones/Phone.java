package phones;

/**
 * Abstract Phone class that provides the model of the phone and its dimensions.
 *
 * @author socrates
 */
public abstract class Phone {
    private String model;
    private Dimension dimension;

    public Phone(String model, Dimension dimension) {
        this.model = model;
        this.dimension = dimension;
    }

    /**
     * Method which calls a number that is entered
     *
     * @param number phone number
     * @return A string that say the {number} is being called
     */
    public abstract String call(long number);

    /**
     * Returns a string with the format
     * "{model} {dimension}"
     *
     * @see Object#toString()
     */
    @Override
    public String toString() {
        return model + " " + dimension;
    }
}
