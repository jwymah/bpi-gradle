package bpi.fsm.states;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class State1Test {
    State1 state = State1.getInstance();
    
    @Test
    public void output() {
        assertEquals(1, state.output());
    }
    
    @Test
    public void onInput0() {
        assertEquals(State2.getInstance(), state.next(0));
    }
    
    @Test
    public void onInput1() {
        assertEquals(State0.getInstance(), state.next(1));
    }
}
