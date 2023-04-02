public abstract class Actions<N> {
    View view = new View();
    public N firstNumber;
    public String operation;
    public N secondNumber;

    public FileWriter fileWriter = new FileWriter();

    abstract void setFirstNumber();

    public void setOperation() {
        this.operation = view.checkOperation();
    }

    abstract void setSecondNumber();

    abstract void setResult();

    abstract void showAndPrintResult();
}
