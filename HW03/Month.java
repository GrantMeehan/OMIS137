public enum Month {
    JAN(1),
    FEB(2),
    MAR(3),
    APR(4),
    MAY(5),
    JUN(6),
    JUL(7),
    AUG(8),
    SEP(9),
    OCT(10),
    NOV(11),
    DEC(12);

    private final int monthNum;

    Month(final int monthNum) {
        this.monthNum = monthNum;
    }

    public static boolean isLessThan(Month m1, Month m2) {
        return m1.getMonthNum() < m1.getMonthNum();
    }

    public static boolean isGreaterThan(Month m1, Month m2) {
        return m1.getMonthNum() > m1.getMonthNum();
    }

    //unused
    public static boolean isLessThanOrEqualTo(Month m1, Month m2) {
        return m1.getMonthNum() <= m1.getMonthNum();
    }

    //unused
    public static boolean isGreaterThanOrEqualTo(Month m1, Month m2) {
        return m1.getMonthNum() >= m1.getMonthNum();
    }

    public int getMonthNum() {
        return monthNum;
    }

    @Override
    public String toString() {
        return String.valueOf(monthNum);
    }
}
