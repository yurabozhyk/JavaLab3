package ua.lviv.iot.zoo.models;

public class Turtle extends AquariumAnimal {

    private Shell shell;
    private int immersionDepth;

    public Turtle(){

    }

    public Turtle(Shell shell, int immersionDepth) {
        this.shell = shell;
        this.immersionDepth = immersionDepth;
    }

    public Shell getShell() {
        return shell;
    }

    public void setShell(Shell shell) {
        this.shell = shell;
    }

    public int getImmersionDepth() {
        return immersionDepth;
    }

    public void setImmersionDepth(int immersionDepth) {
        this.immersionDepth = immersionDepth;
    }

    @Override
    public String toString() {
        return "Turtle{" +
                "shell=" + shell +
                ", immersionDepth=" + immersionDepth +
                '}';
    }
}
