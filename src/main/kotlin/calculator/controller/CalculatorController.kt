package calculator.controller

import calculator.view.InputView

class CalculatorController(
    private val inputView: InputView = InputView(),
//    private val outputView: OutputView = OutputView(),
) {
//    private lateinit var inputValidator: InputValidator

    fun start() {
        val rawString = inputView.inputString()

        if (rawString == "") {
            println("결과 : 0")
            return
        }
        val nums = rawString.split(",", ":").map { it.toIntOrNull() ?: 0 }
        println(nums.sum())
    }
}
