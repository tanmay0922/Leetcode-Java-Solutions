import java.util.*;

class BrowserHistory {

    private Deque<String> history;
    private Deque<String> forward;

    public BrowserHistory(String homepage) {
        history = new LinkedList<>();
        history.push(homepage);
        forward = new LinkedList<>();
    }
    
    public void visit(String url) {
        history.push(url);
        forward.clear();
    }
    
    public String back(int steps) {
        while (steps > 0 && history.size() > 1) {
            forward.push(history.pop());
            steps--;
        }
        return history.peek();
    }
    
    public String forward(int steps) {
        while (steps > 0 && !forward.isEmpty()) {
            history.push(forward.pop());
            steps--;
        }
        return history.peek();
    }
}
/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */