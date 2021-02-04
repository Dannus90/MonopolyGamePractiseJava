package com.monopolygame.gamedependencies;

import com.monopolygame.gamedependencies.tiles.Tile;
import com.monopolygame.gamedependencies.tiles.TileType;

import java.util.LinkedList;

public class TempMain {
    public static void main(String[] args) {
        LinkedList<Tile> tiles = new LinkedList<>();

        Tile tile1 = new Tile(TileType.FREETILE);
        Tile tile2 = new Tile(TileType.STARTTILE);
        Tile tile3 = new Tile(TileType.PROPERTYTILE);

        tiles.add(tile1);
        tiles.add(tile2);
        tiles.add(tile3);

        printTileNames(tiles);
    }

    private static void printTileNames(LinkedList<Tile> tiles) {
        tiles.forEach(tile -> System.out.println(tile.getTileType()));
    }
}
