package org.example.behaviouralPattern.commandPattern;

public class OrderPastaCommand implements Command{

    private Chef chef;

    public OrderPastaCommand(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void execute() {
        chef.cookPasta();
    }

    @Override
    public void undo() {
        chef.cancelPasta();
    }
}
