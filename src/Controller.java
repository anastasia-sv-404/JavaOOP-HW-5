public class Controller {
    View view = new View();
    FileWriter fileWriter = new FileWriter();

    public void start() {
        boolean check = true;

        while (check) {
            view.printMenu();
            int menuItem = view.checkMenuItem();
            if (menuItem == 1) {
                double x = getDoubleNumber();
                String oper = view.checkOperation();
                double y = getDoubleNumber();
                CalcDouble calcDouble = new CalcDouble(x, y);
                calcDouble.operation(oper);
                System.out.println(calcDouble.getStringExpression(oper));
                fileWriter.writeFile(calcDouble.getStringExpression(oper));
            } else {
                Complex complFirst = getComplexNumber();
                String oper = view.checkOperation();
                Complex complSecond = getComplexNumber();
                CalcComplex calcComplex = new CalcComplex(complFirst, complSecond);
                calcComplex.operation(oper);
                System.out.println(calcComplex.getStringExpression(oper));
                fileWriter.writeFile(calcComplex.getStringExpression(oper));
            }

            if (view.anotherAction() != 1) {
                System.out.println("Спасибо, до свидания!");
                check = false;
            }
        }
    }
    public double getDoubleNumber(){
        view.insertDoubleNumber();
        double a = view.checkDoubleNumber();
        return a;
    }
    public Complex getComplexNumber(){
        view.insertReComplexPart();
        double re = view.checkDoubleNumber();
        view.insertImComplexPart();
        double im = view.checkDoubleNumber();
        return new Complex(re, im);
    }

}
