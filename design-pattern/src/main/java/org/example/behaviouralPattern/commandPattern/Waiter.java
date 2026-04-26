package org.example.behaviouralPattern.commandPattern;

import java.util.*;

public class Waiter {
    private List<Command> orderHistory = new ArrayList<>();

    public void takeOrder(Command command) {
        orderHistory.add(command);
        command.execute();
    }

    public void undoLastOrder() {
        if (!orderHistory.isEmpty()) {
            Command last = orderHistory.remove(orderHistory.size() - 1);
            last.undo();
        }
    }
}
