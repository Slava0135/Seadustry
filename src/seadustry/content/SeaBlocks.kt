package seadustry.content

import mindustry.content.Items
import mindustry.ctype.ContentList
import mindustry.type.Category
import mindustry.type.ItemStack
import mindustry.world.Block
import seadustry.world.Landfill

class SeaBlocks : ContentList {

    override fun load() {

        landfill = object : Landfill("landfill") {
            init {
                requirements(Category.effect, ItemStack.with(Items.sand, 24))
                alwaysUnlocked = true
            }
        }

    }

    companion object {
        lateinit var landfill: Block
    }
}