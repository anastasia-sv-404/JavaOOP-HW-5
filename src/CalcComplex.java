public class CalcComplex extends Calc<Complex> implements Expressed<Complex> {

    @Override
    public Complex sum(Complex x, Complex y) {
        double real = x.getRe() + y.getRe();
        double imag = x.getIm() + y.getIm();
        return new Complex(real, imag);
    }
    @Override
    public Complex difference(Complex x, Complex y) {
        double real = x.getRe() - y.getRe();
        double imag = x.getIm() - y.getIm();
        return new Complex(real, imag);
    }

    @Override
    public Complex multiplication(Complex x, Complex y) {
        double real = x.getRe() * y.getRe() - x.getIm() * y.getIm();
        double imag = x.getIm() * y.getRe() + y.getIm() * x.getRe();
        return new Complex(real, imag);
    }

    @Override
    public Complex division(Complex x, Complex y) {
        double real = (x.getRe() * y.getRe() - x.getIm() * y.getIm()) /
                (y.getRe() * y.getRe() + y.getIm() * y.getIm());
        double imag = (x.getRe() * y.getIm() + y.getRe() * x.getIm()) /
                (y.getRe() * y.getRe() + y.getIm() * y.getIm());
        return new Complex(real, imag);
    }

    @Override
    public String getStringExpression(Complex x, String oper, Complex y) {
        String res = "(" + x.toString() + ")" + " " + oper + " " + "(" + y.toString() + ")" + " = " +
                getRes().toString() +"\n";
        return res;
    }
}