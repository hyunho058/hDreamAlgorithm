package hyejin

import java.util.*

//주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 개수를 구하려고 합니다.
//숫자들이 들어있는 배열 nums가 매개변수로 주어질 때, nums에 있는 숫자들 중 서로 다른 3개를 골라
//더했을 때 소수가 되는 경우의 개수를 return 하도록 solution 함수를 완성해주세요.
class PrimeNumber {
    fun solution(nums: IntArray): Int {

        var primeNum = 0;
        var primeNumArr = ArrayList<Int>()
        for (i in 0 until nums.size - 2) {

            for (j in i + 1 until nums.size - 1) {

                for (k in j + 1 until nums.size) {
                    primeNum = nums[i] + nums[j] + nums[k]
                    println(primeNum)

                    if (isPrimeNum(primeNum)) {
                        primeNumArr.add(primeNum)
                    }

                }

            }
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        println(primeNumArr)


        return primeNumArr.size
    }

    fun isPrimeNum(num: Int): Boolean {
        for (i in 2 until num) {
            if (num % i == 0) return false
        }
        return true
    }
}