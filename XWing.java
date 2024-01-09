package StarWar_1110410059;

import java.util.Arrays;

public class XWing extends AirCraft
{
	String Model;
	 double Length;
	 double AirSpeed;
	 String SpaceSpeed;
	 String StdandardEngine;
	 String HyperSpaceEngine;
	 int Passenger=2;
	String [] Weapon={ 
			
			}; 
	@Override
	public String toString() {
		return "XWing [Model=" + Model + ", Length=" + Length + ", AirSpeed=" + AirSpeed + ", SpaceSpeed=" + SpaceSpeed
				+ ", StdandardEngine=" + StdandardEngine + ", HyperSpaceEngine=" + HyperSpaceEngine + ", Passenger="
				+ Passenger + ", Weapon=" + Arrays.toString(Weapon) + ", Weapon_power=" + Arrays.toString(Weapon_power)
				+ ", Shield=" + Arrays.toString(Shield) + ", ShieldPower=" + Arrays.toString(ShieldPower)
				+ ", getModel()=" + getModel() + ", getLength()=" + getLength() + ", getAirSpeed()=" + getAirSpeed()
				+ ", getSpaceSpeed()=" + getSpaceSpeed() + ", getStdandardEngine()=" + getStdandardEngine()
				+ ", getHyperSpaceEngine()=" + getHyperSpaceEngine() + ", getPassenger()=" + getPassenger()
				+ ", getWeapon()=" + Arrays.toString(getWeapon()) + ", getWeapon_power()="
				+ Arrays.toString(getWeapon_power()) + ", getShield()=" + Arrays.toString(getShield())
				+ ", getShieldPower()=" + Arrays.toString(getShieldPower()) + "]";
	}
	double[] Weapon_power={1000,1000,1000,1000,5,5};
	String Shield[]= {"Chempat防禦者型偏轉幕發射器","Chempat偏轉防護盾投射器","鈦合金加勁外殼"};
	String[] ShieldPower= {"2000","3000","1000"};
	public XWing() {
		super();
		// TODO 自動產生的建構子 Stub
	}
	public XWing(String model, double length, double airSpeed, String spaceSpeed, String stdandardEngine,
			String hyperSpaceEngine, String[] weapon, int passenger, double[] weapon_power, String[] shield,
			String[] shieldPower) {
		super(model, length, airSpeed, spaceSpeed, stdandardEngine, hyperSpaceEngine, weapon, passenger, weapon_power, shield,
				shieldPower);
		// TODO 自動產生的建構子 Stub
	}
	public XWing(String string, double d, int i, String string2, String string3, String string4, String string5,
			String string6, String string7, String string8, String string9, String string10) {
		// TODO 自動產生的建構子 Stub
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
	public int getPassenger() {
		return Passenger;
	}
	public void setPassenger(int passenger) {
		Passenger = passenger;
	}
	public String[] getWeapon() {
		return Weapon;
	}
	public void setWeapon(String[] weapon) {
		Weapon = weapon;
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
}
