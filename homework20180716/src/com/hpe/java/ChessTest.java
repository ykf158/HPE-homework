package com.hpe.java;

import org.junit.Test;

public class ChessTest {

	@Test	
	public void test() {
		ChineseChess cc = new ChineseChess();
		play(cc);
		InternationalChess ic = new InternationalChess();
		play(ic);
		
	}
	
	public void play(Chess c) {
		c.rule();
	}
}
