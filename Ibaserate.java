package backaccountapp;

public interface Ibaserate {
    //Write a method that return the base rate
    default double getBaseRate(){
        return 2.5;
    }
}
