package phones;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Class that extend the phone class and adds more functionality
 * like browsing the web and taking a picture.
 *
 * @author socrates
 */
public class Smartphone extends Phone{
    private int storage;

    public Smartphone(String model, Dimension dimension, int storage) {
        if (storage <= 0){
            throw new
                    IllegalArgumentException("Storage cannot be less than 0");
        }

        super(model, dimension);
        this.storage = storage;
    }

    @Override
    public String call(long number) {
        return "Calling " + number + " by selecting the number";
    }

    public String browse(){

        return "Browsing the web";
    }

    /**
     * String that states either a vertical or horizontal picture being taken.
     * @return a String for the type of picture
     */
    public String takePicture(){
        if (ThreadLocalRandom.current().nextBoolean()){
            return "Taking horizontal a picture";

        }
        return "Taking a vertical picture";
    }

    @Override
    public String toString() {
        return super.toString() + " " + storage + " GB" ;
    }
}
