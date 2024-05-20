package com.example.scubaimport

class TankWrapper {
    private val nativeTank: Long

    private external fun newTank(): Long

    init {
        nativeTank = newTank()
    }
}