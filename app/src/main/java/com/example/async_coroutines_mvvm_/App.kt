package com.example.async_coroutines_mvvm_

import android.app.Application
import com.example.async_coroutines_mvvm_.model.colors.InMemoryColorsRepository

class App : Application() {
    val models = listOf<Any>(
        InMemoryColorsRepository()
    )
}