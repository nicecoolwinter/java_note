package java_CkassDesign;
class Bike {}
class RoadBike extends Bike {}
class RacingBike extends Bike {}

public class ex8
{

    static void testDrive(Object o)
    {
        Bike b = (Bike)o;

        if (b instanceof RoadBike) {
            System.out.print("RoadBike");
        }

        if (b instanceof RacingBike) {
            System.out.print("RacingBike");
        }
    }

    public static void main(String args[])
    {
        testDrive(new Bike());
        testDrive(new RoadBike());
        testDrive("RacingBike");

    }

}
/*
what is the result?

A)Runtime exception
B)RoadBike
C)RoadBike followed by a runtime exception
D)RoadBike racingBike followed by a runtime exception
E)RoadBike RacingBike RacingBike followed by a runtime exception







*/