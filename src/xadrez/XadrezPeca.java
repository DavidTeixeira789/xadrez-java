package xadrez;

import java.awt.Color;

import camadatabuleiro.Peca;
import camadatabuleiro.Tabuleiro;

public class XadrezPeca extends Peca {
	
	private Color color;

	public XadrezPeca(Tabuleiro tabuleiro, Color color) {
		super(tabuleiro);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

}
