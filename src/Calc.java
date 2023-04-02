public abstract class Calc<N> {
    protected N x;
    protected N y;
    protected N res;

    public Calc(N x, N y) {
        this.x = x;
        this.y = y;
    }

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

    abstract N sum();

    abstract N difference();

    abstract N multiplication();

    abstract N division();

    public void operation(String oper) {
        if (oper.equals("+")) {
            this.res = this.sum();
        } else if (oper.equals("-")) {
            this.res = this.difference();
        } else if (oper.equals("*")) {
            this.res = this.multiplication();
        } else {
            this.res = this.division();
        }
    }

}
