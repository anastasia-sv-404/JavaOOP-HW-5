public class ActionsComplex extends Actions<Complex> {
    public CalcComplex calcComplex = new CalcComplex();
    @Override
    public void setFirstNumber() {
        super.view.insertReComplexPart();
        double re = super.view.checkDoubleNumber();
        super.view.insertImComplexPart();
        double im = super.view.checkDoubleNumber();
        super.firstNumber = new Complex(re, im);
        calcComplex.setX(super.firstNumber);
    }

    @Override
    public void setSecondNumber() {
        super.view.insertReComplexPart();
        double re = super.view.checkDoubleNumber();
        super.view.insertImComplexPart();
        double im = super.view.checkDoubleNumber();
        super.secondNumber = new Complex(re, im);
        calcComplex.setY(super.secondNumber);
    }

    @Override
    public void setResult() {
        this.calcComplex.operation(calcComplex.getX(), super.operation, calcComplex.getY());
    }

    @Override
    public void showAndPrintResult() {
        System.out.println(this.calcComplex.getStringExpression(calcComplex.getX(), super.operation, calcComplex.getY()));
        super.fileWriter.writeFile(calcComplex.getStringExpression(calcComplex.getX(), super.operation, calcComplex.getY()));
    }
}
