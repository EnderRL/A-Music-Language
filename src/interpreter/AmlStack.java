package interpreter;

import data.Data;
import data.Void;
import music.AmlTrack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class AmlStack {
    private class StackData {
        AmlTree function;
        ArrayList<Data> localVariables;
    }

    private Stack<StackData> stack;

    public AmlStack() {
        stack = new Stack<>();
    }

    public void push(AmlTree function, AmlTrack track) {
        StackData data = new StackData();
        data.function = function;
        data.localVariables = new ArrayList<Data>(Collections.nCopies(function.getNumVariables(), Void.getInstance()));
        stack.push(data);
    }

    public void pop() {
        stack.pop();
    }

    public ArrayList<Data> getLocalVariables() {
        return stack.peek().localVariables;
    }

    public AmlTree topFunction() {
        return stack.peek().function;
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
