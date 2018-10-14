package java_CkassDesign;
enum MilesFromBoston {
    NEW_YORK(224.60),
    SAN_FRANCOSCO(3097.7),
    DENVER(1969.0);

    private final double distance;
    private MilesFromBoston(double distance)
    {
        this.distance = distance;
    }
    public double getDistance()
    {
        return this.distance;
    }

}

public class ex12_testMiles
{

    public static void main(String[] args)
    {
        for (MilesFromBoston mfb : MilesFromBoston.values()) {
            System.out.println("Boston to" + mfb + " is " + mfb.getDistance() + " miles");


        }



    }

}
/*
What is the result?

A)
Boston to DENVER is 1969.0 miles
Boston to NEW_YORK is 224.6 miles
Boston to SAN_FRANCISCO is 3097.7 miles

B)
Boston toNEW_YORK is 224.6 miles
Boston toSAN_FRANCOSCO is 3097.7 miles
Boston toDENVER is 1969.0 miles

C)
compilation fails

D)
An Exception is thrown at runtime




*/