public class CalcComplex extends Calc<Complex> implements Expressed {

    public CalcComplex(Complex x, Complex y) {
        super(x, y);
    }
    @Override
    public Complex sum() {
        double real = this.x.getRe() + this.y.getRe();
        double imag = this.x.getIm() + this.y.getIm();
        return new Complex(real, imag);
    }

    @Override
    Complex difference() {
        double real = this.x.getRe() - this.y.getRe();
        double imag = this.x.getIm() - this.y.getIm();
        return new Complex(real, imag);
    }

    @Override
    Complex multiplication() {
        double real = this.x.getRe() * this.y.getRe() - this.x.getIm() * this.y.getIm();
        double imag = this.x.getIm() * this.y.getRe() + this.y.getIm() * this.x.getRe();
        return new Complex(real, imag);
    }

    @Override
    Complex division() {
        double real = (this.x.getRe() * this.y.getRe() - this.x.getIm() * this.y.getIm()) /
                (this.y.getRe() * this.y.getRe() + this.y.getIm() * this.y.getIm());
        double imag = (this.x.getRe() * this.y.getIm() + this.y.getRe() * this.x.getIm()) /
                (this.y.getRe() * this.y.getRe() + this.y.getIm() * this.y.getIm());
        return new Complex(real, imag);
    }

    @Override
    public String getStringExpression(String oper) {
        String res = "(" + this.x.toString() + ")" + " " + oper + " " + "(" + this.y.toString() + ")" + " = " + this.res.toString() +"\n";
        return res;
    }
}