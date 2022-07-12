package classic_queue_test;

import homework.classic_queue.ClassicQueue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClassicQueueTest {
    ClassicQueue queue;

    @BeforeEach
    void init() {
        queue = new ClassicQueue(5);
    }

    @Test
    void removeTest() {
        queue.pushToEnd(1);
        queue.pushToEnd(2);
        assertEquals(1, queue.remove());
        assertEquals(2, queue.peek());
        assertEquals(1, queue.size());
    }

    @Test
    void isEmptyTest() {
        assertTrue(queue.isEmpty());
        queue.pushToEnd(1);
        assertFalse(queue.isEmpty());
    }

    @Test
    void peekTest() {
        queue.pushToEnd(1);
        queue.pushToEnd(2);
        assertEquals(1, queue.peek());
    }

    @Test
    void pushToEndTest() {
        queue.pushToEnd(1);
        assertEquals(1, queue.peek());
    }

    @Test
    void getEmptySizeClassicQueueTest() {
        assertEquals(0, queue.size());
    }

    @Test
    void getSizeClassicQueueTest() {
        queue.pushToEnd(1);
        assertEquals(1, queue.size());
    }

}
