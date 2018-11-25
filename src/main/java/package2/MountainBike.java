package package2;

import package1.Bicycle;

public class MountainBike extends Bicycle {

    // the MountainBike subclass adds one field
    public int seatHeight;

    // the MountainBike subclass has one constructor
    public MountainBike(int startHeight,
                        int startCadence,
                        int startSpeed,
                        int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
        int protectedAccessModifierMember = this.protectedAccessModifierMember; // protected access modifier; can be accessd in subclass even they are in diff packages
        int defaultAccessModifierMember = this.defaultAccessModifierMember; // default access modifier, cannot be accessed in subclass since they are in different packages
    }

    // the MountainBike subclass adds one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }
}
