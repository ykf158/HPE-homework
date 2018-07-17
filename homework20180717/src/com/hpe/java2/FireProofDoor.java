package com.hpe.java2;

public class FireProofDoor extends Door implements FireSafe{

	@Override
	public void fireProof() {
		System.out.println("这是一个防火门");
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
