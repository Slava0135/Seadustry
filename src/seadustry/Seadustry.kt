package seadustry

import mindustry.mod.Mod
import seadustry.content.SeaBlocks

class Seadustry : Mod() {

    override fun loadContent() {
        SeaBlocks().load()
    }
}