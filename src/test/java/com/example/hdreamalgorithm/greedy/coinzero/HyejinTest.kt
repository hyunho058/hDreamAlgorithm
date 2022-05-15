package com.example.hdreamalgorithm.greedy.coinzero

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class HyejinTest {

    @Test
    fun countCoin() {
        val hyejin = Hyejin()
        var coin = (arrayListOf<Int>(1,5,10,50,100,500,1000,5000,10000,50000))
        var money = 4200
        val result = hyejin.countCoin(money, coin)
        assertThat(result).isEqualTo(6)
    }
    @Test
    fun countCoin2() {
        val hyejin = Hyejin()
        var coin = (arrayListOf<Int>(1,5,10,50,100,500,1000,5000,10000,50000))
        var money = 4790
        val result = hyejin.countCoin(money, coin)
        assertThat(result).isEqualTo(12)
    }
}