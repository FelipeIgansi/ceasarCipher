fun main(args: Array<String>) {
    val n = 10

    val s = "www.abc.xy"

    val k = 87

    val result = caesarCipher(s, k)

    println(result)
}


fun caesarCipher(text: String, shift: Int): String {
    val normalizedShift = shift % 26  // Garante que o deslocamento seja positivo
    val shiftedAlphabet = ('a'..'z').zip(('a' + normalizedShift..'z').toList() + ('a'..'z').toList())
        .toMap() + ('A'..'Z').zip(('A' + normalizedShift..'Z').toList() + ('A'..'Z').toList()).toMap()

    return text.map { char ->
        shiftedAlphabet[char] ?: char
    }.joinToString("")
}