import java.text.DecimalFormat;
import java.text.NumberFormat;

public class CalcDouble extends Calc<Double> implements Expressed<Double> {
    NumberFormat nf = new DecimalFormat("#.###");
    @Override
    public Double sum(Double x, Double y) {
        return x + y;
    }

    @Override
    public Double difference(Double x, Double y) {
        return x - y;
    }

    @Override
    public Double multiplication(Double x, Double y) {
        return x * y;
    }

    @Override
    public Double division(Double x, Double y) {
        return x / y;
    }

    @Override
    public String getStringExpression(Double x, String oper, Double y) {
        String res = x + " " + oper + " " + y + " = " + nf.format(getRes()) +"\n";
        return res;
    }

}