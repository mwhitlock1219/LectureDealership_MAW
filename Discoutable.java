interface Discoutable {
    // in interfaces, methods are by default public and abstract so those keywords
    // arent needed.
    float getMaximumDiscountPct();

    float getPersonalDiscount();

    float getCorporateDiscount();
}