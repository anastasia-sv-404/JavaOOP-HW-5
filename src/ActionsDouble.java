public class ActionsDouble extends Actions<Double> {
    public CalcDouble calcDouble = new CalcDouble();

    @Override
    public void setFirstNumber() {
        super.view.insertDoubleNumber();
        super.firstNumber = super.view.checkDoubleNumber();
        calcDouble.setX(super.firstNumber);
    }

    @Override
    public void setSecondNumber() {
        super.view.insertDoubleNumber();
        super.secondNumber = super.view.checkDoubleNumber();
        calcDouble.setY(super.secondNumber);
    }

    @Override
    public void setResult() {
        this.calcDouble.operation(calcDouble.getX(), super.operation, calcDouble.getY());
    }

    @Override
    public void showAndPrintResult() {
        System.out.println(this.calcDouble.getStringExpression(calcDouble.getX(), super.operation, calcDouble.getY()));
        super.fileWriter.writeFile(calcDouble.getStringExpression(calcDouble.getX(), super.operation, calcDouble.getY()));
    }
}
