public class CalcDouble extends Calc<Double> implements Expressed {
    public CalcDouble(Double x, Double y) {
        super(x, y);
    }
    @Override
    public Double sum() {
        return this.x + this.y;
    }

    @Override
    public Double difference() {
        return this.x - this.y;
    }

    @Override
    public Double multiplication() {
        return this.x * this.y;
    }

    @Override
    public Double division() {
        return this.x / this.y;
    }

    @Override
    public String getStringExpression(String oper) {
        String res = this.x + " " + oper + " " + this.y + " = " + this.res +"\n";
        return res;
    }
}