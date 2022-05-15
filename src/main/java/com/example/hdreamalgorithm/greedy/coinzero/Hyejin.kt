package com.example.hdreamalgorithm.greedy.coinzero

import java.util.Scanner


//코인
class Hyejin {

    fun main() {
        val sc = Scanner(System.`in`)
        val N = sc.nextInt()
        val K = sc.nextInt()
        val coin = ArrayList<Int>()
        for (i in 0 until N) {
            coin.add(sc.nextInt())
        }
        println(countCoin(K, coin))
    }


    fun countCoin(K: Int, coin: ArrayList<Int>): Int {
        var remainMoney = K
        var totalCoinCount = 0

        for (i in coin.size - 1 downTo 0) {
            if (remainMoney == 0) break
            if (coin[i] > K) continue

            var coinCount = remainMoney / coin[i]

            totalCoinCount += coinCount
            remainMoney -= coinCount * coin[i]

        }
        return totalCoinCount
    }
}

