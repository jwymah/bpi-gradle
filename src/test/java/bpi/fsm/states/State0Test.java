package bpi.fsm.states;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class State0Test {
    State0 state = State0.getInstance();
    
    @Test
    public void output() {
        assertEquals(0, state.output());
    }
    
    @Test
    public void onInput0() {
        assertEquals(State0.getInstance(), state.next(0));
    }
    
    @Test
    public void onInput1() {
        assertEquals(State1.getInstance(), state.next(1));
    }
}
