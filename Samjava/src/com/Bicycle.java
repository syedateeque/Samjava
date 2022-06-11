package com;

public class Bicycle 
 {
	int gear;
	int speed;

	void applyBreak(int decrement) {
		speed -= decrement;
	}

	void accelerate(int increment) {
		speed += increment;
	}

	@Override
	public String toString() {
		return "Bicycle [gear=" + gear + ", speed=" + speed + "]";
	}
}

class MountainBike extends Bicycle {
	int seatHeight;

	void adjustHeight(int value) {
		seatHeight = value;
	}

	@Override
	public String toString() {
		return "MountainBike [seatHeight=" + seatHeight + ", gear=" + gear + ", speed=" + speed + "]";
	}

}

class SLInheritanceDemo {
	public static void main(String[] args) {
		Bicycle obj = new Bicycle();
		obj.gear = 5;
		obj.speed = 20;
		obj.accelerate(5);
		obj.applyBreak(5);
		obj.applyBreak(5);
		System.out.println(obj);

		MountainBike mb = new MountainBike();
		mb.gear = 6;
		mb.speed = 30;
		mb.seatHeight = 5;
		System.out.println(mb);
		mb.accelerate(10);
		mb.adjustHeight(1);
		mb.applyBreak(2);
		System.out.println(mb);
	}

}
