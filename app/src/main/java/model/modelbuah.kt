package model

import com.gema.latihan_7.R

data class modelbuah(
    val image : Int , val deskripsi : String
)

object MockList {

    fun getmodel() :List<modelbuah>{

        val itemmodel1 = modelbuah(
            R.drawable.apple,
            "apel"
        )

        val itemmodel2 = modelbuah(
            R.drawable.grapes,
            "anggur"
        )

        val itemmodel3 = modelbuah(
            R.drawable.orange,
            "jeruk"
        )

        val itemmodel4 = modelbuah(
            R.drawable.pear,
            "pir"
        )

        val itemmodel5 = modelbuah(
            R.drawable.strawberry,
            "strawberry"
        )

        val itemlist : ArrayList<modelbuah> = ArrayList()
        itemlist.add(itemmodel1)
        itemlist.add(itemmodel2)
        itemlist.add(itemmodel3)
        itemlist.add(itemmodel4)
        itemlist.add(itemmodel5)

        return itemlist
    }
}