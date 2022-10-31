package seadustry.content

import mindustry.content.Items
import mindustry.type.Category
import mindustry.type.ItemStack
import mindustry.world.Block
import seadustry.world.Landfill

class SeaBlocks {
    companion object {
        lateinit var landfill: Block

        fun load() {
            landfill = Landfill("landfill").apply {
                requirements(Category.effect, ItemStack.with(Items.sand, 24))
                alwaysUnlocked = true
            }

        }
    }
}