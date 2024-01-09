package StarWar_1110410059;

import java.util.Arrays;

public class AirCraft
{

 String Model;
 double Length;
 double AirSpeed;
 String SpaceSpeed;
 String StdandardEngine;
 String HyperSpaceEngine;
 String Weapon[];
 AirCraft(){
	 
 }

 public AirCraft(String model, double length, double airSpeed, String spaceSpeed, String stdandardEngine,
		String hyperSpaceEngine, String[] weapon, int passenger, double[] weapon_power, String[] shield,
		String[] shieldPower) {
	super();
	Model = model;
	Length = length;
	AirSpeed = airSpeed;
	SpaceSpeed = spaceSpeed;
	StdandardEngine = stdandardEngine;
	HyperSpaceEngine = hyperSpaceEngine;
	Weapon = weapon;
	Passenger = passenger;
	Weapon_power = weapon_power;
	Shield = shield;
	ShieldPower = shieldPower;
}

@Override
public String toString() {
	return "AirCraft [Model=" + Model + ", Length=" + Length + ", AirSpeed=" + AirSpeed + ", SpaceSpeed=" + SpaceSpeed
			+ ", StdandardEngine=" + StdandardEngine + ", HyperSpaceEngine=" + HyperSpaceEngine + ", Weapon="
			+ Arrays.toString(Weapon) + ", Passenger=" + Passenger + ", Weapon_power=" + Arrays.toString(Weapon_power)
			+ ", Shield=" + Arrays.toString(Shield) + ", ShieldPower=" + Arrays.toString(ShieldPower) + ", getModel()="
			+ getModel() + ", getLength()=" + getLength() + ", getAirSpeed()=" + getAirSpeed() + ", getSpaceSpeed()="
			+ getSpaceSpeed() + ", getStdandardEngine()=" + getStdandardEngine() + ", getHyperSpaceEngine()="
			+ getHyperSpaceEngine() + ", getWeapon()=" + Arrays.toString(getWeapon()) + ", getPassenger()="
			+ getPassenger() + ", getWeapon_power()=" + Arrays.toString(getWeapon_power()) + ", getShield()="
			+ Arrays.toString(getShield()) + ", getShieldPower()=" + Arrays.toString(getShieldPower()) + "]";
}

public String getModel() {
	return Model;
}
public void setModel(String model) {
	Model = model;
}
public double getLength() {
	return Length;
}
public void setLength(double length) {
	Length = length;
}
public double getAirSpeed() {
	return AirSpeed;
}
public void setAirSpeed(double airSpeed) {
	AirSpeed = airSpeed;
}
public String getSpaceSpeed() {
	return SpaceSpeed;
}
public void setSpaceSpeed(String spaceSpeed) {
	SpaceSpeed = spaceSpeed;
}
public String getStdandardEngine() {
	return StdandardEngine;
}
public void setStdandardEngine(String stdandardEngine) {
	StdandardEngine = stdandardEngine;
}
public String getHyperSpaceEngine() {
	return HyperSpaceEngine;
}
public void setHyperSpaceEngine(String hyperSpaceEngine) {
	HyperSpaceEngine = hyperSpaceEngine;
}
public String[] getWeapon() {
	return Weapon;
}
public void setWeapon(String[] weapon) {
	Weapon = weapon;
}
public int getPassenger() {
	return Passenger;
}
public void setPassenger(int passenger) {
	Passenger = passenger;
}
public double[] getWeapon_power() {
	return Weapon_power;
}
public void setWeapon_power(double[] weapon_power) {
	Weapon_power = weapon_power;
}
public String[] getShield() {
	return Shield;
}
public void setShield(String[] shield) {
	Shield = shield;
}
public String[] getShieldPower() {
	return ShieldPower;
}
public void setShieldPower(String[] shieldPower) {
	ShieldPower = shieldPower;
}
int Passenger;
 double Weapon_power[];
 String Shield[];
 String[] ShieldPower;
 
}
