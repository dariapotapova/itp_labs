public enum Money {
    ONE(1),
    TWO(2),
    FIVE(5),
    TEN(10),
    FIFTY(50),
    ONE_HUNDRED(100),
    FIVE_HUNDRED(500);
    private final int denomination;
    Money(int denomination) {
        this.denomination = denomination;
    }
}