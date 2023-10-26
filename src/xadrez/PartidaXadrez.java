package xadrez;

import camadatabuleiro.Posicao;
import camadatabuleiro.Tabuleiro;
import xadrez.pecas.Torre;

public class PartidaXadrez {
	
	private Tabuleiro tabuleiro;
	
	public PartidaXadrez() {
		tabuleiro = new Tabuleiro(8,8);
		configuraçãoInicial();
	}
	public XadrezPeca[][] getPecas(){
		XadrezPeca[][]mat = new XadrezPeca[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for(int i=0; i<tabuleiro.getLinhas();i++) {
			for(int j=0; j<tabuleiro.getColunas();j++) {
				mat[i][j] = (XadrezPeca) tabuleiro.peca(i,j);
			}
		}
		return mat;
	}
	private void configuraçãoInicial() {
		tabuleiro.peçaDelugar(new Torre(tabuleiro, Cor.BRANCO), new Posicao(2,1));
	}

}
