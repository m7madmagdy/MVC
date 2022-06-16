package com.example.mvc

import java.util.*

object Model: Observable() {
    private val List: MutableList<Int>

    init {
        List = ArrayList(3)
        List.add(0)
        List.add(0)
        List.add(0)
    }

    fun getValueAtIndex(the_index: Int): Int {
        return List[the_index]
    }

    fun setValueAtIndex(the_index: Int) {
        List[the_index] = List[the_index] + 1
        setChanged()
        notifyObservers()
    }
}