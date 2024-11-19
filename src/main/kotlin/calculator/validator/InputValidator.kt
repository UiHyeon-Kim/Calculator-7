package calculator.validator

class InputValidator {

    fun validateString(rawString: String) {
        val string = rawString.split(",", ":")
        val numbers = string.map { it.toIntOrNull() }

    }
}
