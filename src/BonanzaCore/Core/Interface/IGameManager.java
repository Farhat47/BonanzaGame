package BonanzaCore.Core.Interface;

import BonanzaCore.Core.AbstractLayer.Player;

import java.util.List;

public interface IGameManager extends IGameStarter
{
	void newRound();
	void finishGame();
	boolean startNewGame();
	List<Player> getWinner();
	//List<Card> draw(int count);
}
