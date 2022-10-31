package seadustry.world

import mindustry.Vars.renderer
import mindustry.content.Blocks
import mindustry.game.Team
import mindustry.gen.Building
import mindustry.world.Block
import mindustry.world.Tile
import mindustry.world.blocks.environment.Floor

open class Landfill(name: String) : Block(name) {

    init {
        breakable = true
        floating = true
        update = true
    }

    override fun canPlaceOn(tile: Tile?, team: Team?, rotation: Int): Boolean {
        return tile != null && tile.floor().liquidDrop != null
    }

    inner class LandfillBuild : Building() {
        override fun updateTile() {
            tile.setFloor(Blocks.sand as Floor)
            tile.setAir()
            renderer.blocks.floor.recacheTile(tile)
        }
    }
}