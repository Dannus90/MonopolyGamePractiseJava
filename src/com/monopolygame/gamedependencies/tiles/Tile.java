package com.monopolygame.gamedependencies.tiles;

public class Tile {
    private final TileType tileType;

    public Tile(TileType tileType) {
        this.tileType = tileType;
    }

    public TileType getTileType() {
        return tileType;
    }
}
