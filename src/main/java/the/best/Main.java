package the.best;
import the.best.Grant;

public class Main {
    public static void main(String[] args) {
        Grant grant = new Grant("KNU Grant 1500$");
        grant.consider();
        grant.recall();

        System.out.println(grant.getName() + " is " + (grant.isConfirmed() ? "confirmed" : "not confirmed"));
    }

}
