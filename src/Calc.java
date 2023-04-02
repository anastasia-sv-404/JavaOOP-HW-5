public abstract class Calc<N> {
    private N x;
    private N y;
    private N res;

    public N getX() {
        return x;
    }

    public N getY() {
        return y;
    }

    public N getRes() {
        return res;
    }

    public void setX(N x) {
        this.x = x;
    }

    public void setY(N y) {
        this.y = y;
    }

    abstract N sum(N x, N y);

    abstract N difference(N x, N y);

    abstract N multiplication(N x, N y);

    abstract N division(N x, N y);

    public void operation(N x, String oper, N y) {
        if ("+".equals(oper)) {
            this.res = this.sum(x, y);
        } else if ("-".equals(oper)) {
            this.res = this.difference(x, y);
        } else if ("*".equals(oper)) {
            this.res = this.multiplication(x, y);
        } else {
            this.res = this.division(x, y);
        }
    }
}
