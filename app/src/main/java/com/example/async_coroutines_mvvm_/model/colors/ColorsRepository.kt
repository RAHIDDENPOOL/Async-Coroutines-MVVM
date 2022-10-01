package com.example.async_coroutines_mvvm_.model.colors

import com.example.async_coroutines_mvvm_.model.Repository

typealias ColorListener = (NamedColor) -> Unit

interface ColorsRepository : Repository {

    var currentColor: NamedColor

    fun getAvailableColors(): List<NamedColor>

    fun getById(id: Long): NamedColor

    fun addListener(listener: ColorListener)

    fun removeListener(listener: ColorListener)
}