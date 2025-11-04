package stringOperations;

public class CustomString {
    public String customString;

    @Override
    public String toString() {
        return this.customString;
    }

    CustomString(String customString){
        this.customString = customString;
    }

    public CustomString append(String appendString){
        this.customString += appendString;
        return this;
    }
}
