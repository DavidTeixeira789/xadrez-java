package xadrez;

import camadatabuleiro.Peca;
import camadatabuleiro.Tabuleiro;

public class XadrezPeca extends Peca {
	
	private Cor cor;

	public XadrezPeca(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro);
		this.cor = cor;
	}

	public Cor getColor() {
		return cor;
	}

}
