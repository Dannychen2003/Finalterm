package StarWar_1110410059;

import java.util.Arrays;

public class TieFighter extends AirCraft
{

	 String Model;
	 double Length;
	 double AirSpeed;
	 String SpaceSpeed;
	 String StdandardEngine;
	 String HyperSpaceEngin;
	 int Passenger;
	 String[] Shield;
	 String[]ShieldPower;
	String Weapon[]= {};
	double[]Weapon_power={};
	public TieFighter(String string, double d, int i, String string2, String string3, String string4, int j, String string5, String string6, int k, int l) {
		super();
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
	public String getHyperSpaceEngin() {
		return HyperSpaceEngin;
	}
	public void setHyperSpaceEngin(String hyperSpaceEngin) {
		HyperSpaceEngin = hyperSpaceEngin;
	}
	public int getPassenger() {
		return Passenger;
	}
	public void setPassenger(int passenger) {
		Passenger = passenger;
	}
	public String[] getShield() {
		return Shield;
	}
	public void setShield(String[]shield) {
		Shield = shield;
	}
	public String[] getShieldPower() {
		return ShieldPower;
	}
	public void setShieldPower(String[]shieldPower) {
		ShieldPower = shieldPower;
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
	@Override
	public String toString() {
		return "TieFighter [Model=" + Model + ", Length=" + Length + ", AirSpeed=" + AirSpeed + ", SpaceSpeed="
				+ SpaceSpeed + ", StdandardEngine=" + StdandardEngine + ", HyperSpaceEngin=" + HyperSpaceEngin
				+ ", Passenger=" + Passenger + ", Shield=" + Shield + ", ShieldPower=" + ShieldPower + ", Weapon="
				+ Arrays.toString(Weapon) + ", Weapon_power=" + Arrays.toString(Weapon_power) + ", getModel()="
				+ getModel() + ", getLength()=" + getLength() + ", getAirSpeed()=" + getAirSpeed()
				+ ", getSpaceSpeed()=" + getSpaceSpeed() + ", getStdandardEngine()=" + getStdandardEngine()
				+ ", getHyperSpaceEngin()=" + getHyperSpaceEngin() + ", getPassenger()=" + getPassenger()
				+ ", getShield()=" + getShield() + ", getShieldPower()=" + getShieldPower() + ", getWeapon()="
				+ Arrays.toString(getWeapon()) + ", getWeapon_power()=" + Arrays.toString(getWeapon_power()) + "]";
	}
	public void setWeapon_power(double[] weapon_power) {
		Weapon_power = weapon_power;
	}
	public TieFighter(String model, double length, double airSpeed, String spaceSpeed, String stdandardEngine,
			String hyperSpaceEngine, String[] weapon, int passenger, double[] weapon_power, String[] shield,
			String[] shieldPower) {
		super(model, length, airSpeed, spaceSpeed, stdandardEngine, hyperSpaceEngine, weapon, passenger, weapon_power, shield,
				shieldPower);
		// TODO 自動產生的建構子 Stub
	}
}
