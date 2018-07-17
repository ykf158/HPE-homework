package com.hpe.java2;

public class BulletProofDoor extends Door implements BulletSafe{

	@Override
	public void bulletProof() {
		System.out.println("这是一个防盗门");
	}
	@Override
	public void open() {
		System.out.println("防火门开着");
	}

	@Override
	public void close() {
		System.out.println("防火门关着");
	}

	

}
