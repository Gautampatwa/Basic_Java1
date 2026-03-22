package Stack;

import java.util.*;

class UndoRedo {

    private Stack<String> undoStack = new Stack<>();
    private Stack<String> redoStack = new Stack<>();
    private String current = "";

    // Perform new action
    public void perform(String action) {
        undoStack.push(current);
        current = action;
        redoStack.clear();
    }

    // Undo operation
    public void undo() {
        if (!undoStack.isEmpty()) {
            redoStack.push(current);
            current = undoStack.pop();
        } else {
            System.out.println("Nothing to undo");
        }
    }

    // Redo operation
    public void redo() {
        if (!redoStack.isEmpty()) {
            undoStack.push(current);
            current = redoStack.pop();
        } else {
            System.out.println("Nothing to redo");
        }
    }

    public void printState() {
        System.out.println("Current State: " + current);
    }

    public static void main(String[] args) {

        UndoRedo ur = new UndoRedo();

        ur.perform("Type A");
        ur.perform("Type B");
        ur.perform("Type C");

        ur.printState();

        ur.undo();
        ur.printState();

        ur.redo();
        ur.printState();

        ur.undo();
        ur.printState();


        ur.undo();
        ur.printState();

        ur.redo();
        ur.redo();
        ur.printState();

    }
}
