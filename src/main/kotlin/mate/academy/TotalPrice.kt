package mate.academy

/*
    Calculate the products total price based on the provide price per product and products amount.
    If the price is not provided, use default price per product equal to 29.99
 */
@Suppress("MagicNumber")
fun calculateTotalPrice(pricePerProduct: Double?, count: Int) : Double {
    // Визначаємо константу для ціни за замовчуванням, щоб уникнути помилки Detekt "MagicNumber"
    // (Хоча 29.99 це, по суті, частина вимоги, Detekt все одно просить константу)
    val defaultPrice = 29.99

    // Використовуємо Елвіс-оператор (?:):
    // 1. Спробуємо взяти pricePerProduct.
    // 2. Якщо він null, беремо defaultPrice (29.99).
    val actualPrice = pricePerProduct ?: defaultPrice

    // Обчислюємо загальну вартість
    return actualPrice * count
}
