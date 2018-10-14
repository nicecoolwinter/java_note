package java_Interface;
interface Boat {}
class MotorizedBoat implements Boat {}
class RadarSyatem {}
interface Galley {}

public class ex6 extends MotorizedBoat
{
    Galley A;
}
/*
What changes should you make to the ex6 class so that the resulting class
is a MotorizedBoat and has a Galley?

A)Make ex6t extend MotorizeBoat and implement Galley
B)Make Galley a glass. Have ex6 extend MotorizedBoat and Galley
C)
Make MotorizedBoat an interface that extends Boat.Have ex6 implement
Galley and MotorizedBoat

D)Make ex6 extend MotorizedBoat.Add a field that references Galley to ex6
E)Add a field reference to MotorizedBoat and Galley to ex6



*/