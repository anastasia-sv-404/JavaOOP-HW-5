public class Controller {
    View view = new View();

    public void start() {
        boolean check = true;

        while (check) {
            view.printMenu();
            int menuItem = view.checkMenuItem();
            if (menuItem == 1) {
                ActionsDouble actionsDouble = new ActionsDouble();
                actionsDouble.setFirstNumber();
                actionsDouble.setOperation();
                actionsDouble.setSecondNumber();
                actionsDouble.setResult();
                actionsDouble.showAndPrintResult();
            } else {
                ActionsComplex actionsComplex = new ActionsComplex();
                actionsComplex.setFirstNumber();
                actionsComplex.setOperation();
                actionsComplex.setSecondNumber();
                actionsComplex.setResult();
                actionsComplex.showAndPrintResult();
            }
            if (view.anotherAction() != 1) {
                System.out.println("Спасибо, до свидания!");
                check = false;
            }
        }
    }
}
