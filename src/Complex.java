public class Complex {
    private double re;
    private double im;

    /**
     * Создает экземпляр комплексного числа.
     *
     * @param real действительная часть
     * @param imag мнимая часть
     */
    public Complex(double real, double imag) {
        re = real;
        im = imag;
    }

    /**
     * Возвращает действительную часть числа.
     *
     * @return действительную часть числа
     */
    public double getRe() {
        return re;
    }

    /**
     * Возвращает мнимую часть.
     *
     * @return мнимую часть числа
     */
    public double getIm() {
        return im;
    }

    /**
     * Сравнивает комплексные числа.
     *
     * @param x число для сравнения
     * @return true, если числа равны, иначе - false
     */
    public boolean equals(Object x) {
        if (x == null) return false;
        if (this.getClass() != x.getClass()) return false;
        Complex that = (Complex) x;
        return this.re == that.re && this.im == that.im;
    }

    @Override
    public String toString() {
        if (im == 0) return re + "";
        if (re == 0) return im + "i";
        if (im < 0) return re + " - " + (-im) + "i";
        return re + " + " + im + "i";
    }

}
