package miscellaneous_patterns_learning.strategy_pattern

// A function that takes a double and returns double
typealias DiscountStrategy = (Double) -> Double

// Implementation of strategies
// No discount
val noDiscount: DiscountStrategy = { it }

// 20% off for summer sale
val summerDiscount: DiscountStrategy = { it * 0.80}

// Flat 50% off for "VIP" members (only if total > $100)
val vipDiscount: DiscountStrategy = { total ->
    if (total > 100) total - 0.50 else total
}

class PriceCalculator(var discountStrategy: DiscountStrategy) {
    fun claculateFinalPrice(products: List<Double>): Double {
        val total = products.sum()
        return discountStrategy(total)
    }
}