package Bonanza.Game;

import Bonanza.Core.AbstractLayer.AbstractTable;


public class Table extends AbstractTable {

    public Table()
    {
        maxPlayerCount = 5;
    }

    @Override
    public String toString() {
        return "Table Class";
    }
}
