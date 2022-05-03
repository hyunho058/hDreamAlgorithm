package hyejin

/**
 * 모의고사
 * https://programmers.co.kr/learn/courses/30/lessons/42840?language=kotlin
 */
class Algorithm20220503 {

    /**
     * 최대 10000문제
     */
    fun solution(answers: IntArray): IntArray {
        var arrayList = arrayListOf<Int>();
        val studentOne = listOf(1, 2, 3, 4, 5)
        val studentTwo = listOf(2, 1, 2, 3, 2, 4, 2, 5)
        val studentThree = listOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)

        arrayList.add(correctCount(studentOne,answers))
        arrayList.add(correctCount(studentTwo,answers))
        arrayList.add(correctCount(studentThree,answers))

        arrayList.sort()

        println(arrayList.toString())
        return arrayList.toIntArray()
    }

    fun correctCount(student: List<Int>, answers: IntArray): Int {
        var count = 0
        var index = 0
        for (i in answers) {

            if (i == student[index]) {
                count++
            }
            index++

            if (index >= student.size) {
                index = 0
            }
        }
        return count
    }
}