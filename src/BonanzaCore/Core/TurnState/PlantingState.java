package BonanzaCore.Core.TurnState;

import BonanzaCore.Core.AbstractLayer.BonanzaPlayerState;
import BonanzaCore.Core.Enums.TurnPhases;
import BonanzaCore.Core.HumanPlayer;
import BonanzaCore.Core.AbstractLayer.Table;
import BonanzaCore.Core.Entities.Card;
import BonanzaCore.Core.Entities.Field;

import java.util.List;

public  class PlantingState extends BonanzaPlayerState {

    public PlantingState(HumanPlayer player) {
        super(player);
        player.setPlaying(false);
        turnPhase= TurnPhases.PLANTING;
    }


    @Override
    public Boolean onLock() {
        return null;
    }

    @Override
    public Boolean onTrading() {
        return null;
    }


    @Override
    public Boolean onDrawing(Table table, int count) {
        return null;
    }

    @Override
    public Boolean onPlanting(int fieldIndex) {

        Field field = super.getHumanPlayer().fields.get(fieldIndex);

        if (field != null) {
            Card fieldCard = field.getCards().get(0);
            Card handCard = getHumanPlayer().getHand().get(0);
            if (handCard == null) return null;

            if (fieldCard == null || fieldCard.getCardType() == handCard.getCardType()) {
                boolean inserted = field.addCardToField(handCard);
                if (inserted) {
                    List<Card> handCards = (List<Card>) getHumanPlayer().getHand().remove(0);
                    getHumanPlayer().setHand(handCards);
                    return true;
                }
            }
        }

        return null;
    }

}
