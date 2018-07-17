package com.hpe.java2;

public class Test {

	public static void main(String[] args) {

		Door d1 = new FireProofDoor();
		((FireProofDoor) d1).fireProof();
		d1.open();
		d1.close();
		Door d2 = new BulletProofDoor();
		((BulletProofDoor)d2).bulletProof();
		d2.open();
		d2.close();
		
	}

}
