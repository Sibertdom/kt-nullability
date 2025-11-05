package mate.academy

/*
    Implement the function. The input String may contain number or be null.
    If the number is present, multiply it by 3, then add 10 and return the reminder of dividing by 11.
    If the number is not present return null
 */

fun getReminder(numberStr: String?): Int? {
    // 1. Безпечно перетворюємо String? на Int?
    // toIntOrNull поверне null, якщо numberStr є null АБО якщо це не число.
    val number: Int? = numberStr?.toIntOrNull()

    // 2. Виконуємо обчислення лише якщо number не null.
    // Якщо number null, весь вираз поверне null.
    return number?.let {
        // 'it' тут - це не-null Int (число)
        (it * 3 + 10) % 11
    }

    // Альтернативний, більш компактний, але менш явний варіант:
    // return numberStr?.toIntOrNull()?.let { (it * 3 + 10) % 11 }
}
