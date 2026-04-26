package org.example.behaviouralPattern.commandPattern;

public class OrderSoupCommand implements Command{

    private Chef chef;

    public OrderSoupCommand(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
