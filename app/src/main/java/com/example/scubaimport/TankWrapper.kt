package com.example.scubaimport

class TankWrapper {
    private val nativeTank: Int //Long

    private external fun newTank(): Int //Long

    init {
        nativeTank = newTank()
    }
}