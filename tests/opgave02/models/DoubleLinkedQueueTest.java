package opgave02.models;

import opgave01.models.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoubleLinkedQueueTest {

    private DoubleLinkedQueue<Integer> list = new DoubleLinkedQueue<>();

    @BeforeEach
    void setUp() {
        list.clear();
        list.add(1);
        list.add(2);
        list.add(3);

    }
    @Test
    void add() {
        // Arrange

        // Act
        int headActual = list.element();
        int sizeActual = list.size();

        // Assert
        assertEquals(1,headActual);
        assertEquals(3,sizeActual);

    }

    @Test
    void remove() {
        // Arrange


        // Act
        int removedActual1 = list.remove();
        int removedActual2 = list.remove();
        int removedActual3 = list.remove();
        int sizeActual = list.size();

        // Assert
        assertEquals(1,removedActual1);
        assertEquals(2,removedActual2);
        assertEquals(3,removedActual3);
        assertEquals(0,sizeActual);
    }

    @Test
    void element() {
        // Arrange

        // Act
        int elementActual = list.element();

        // Assert
        assertEquals(1,elementActual);

    }

    @Test
    void isEmpty() {
        // Arrange

        // Act
        boolean isEmptyActual1 = list.isEmpty();
        list.remove();
        list.remove();
        list.remove();
        boolean isEmptyActual2= list.isEmpty();

        // Assert
        assertFalse(isEmptyActual1);
        assertTrue(isEmptyActual2);
    }

    @Test
    void clear() {
        // Arrange
        list.clear();

        // Act
        int sizeActual = list.size();
        boolean isEmptyActual = list.isEmpty();
        DoubleLinkedNode<Integer> headActual = list.getHead();
        DoubleLinkedNode<Integer> tailActual = list.getTail();

        // Assert
        assertEquals(0,sizeActual);
        assertTrue(isEmptyActual);
        assertNull(headActual);
        assertNull(tailActual);

    }

    @Test
    void size() {
        // Arrange

        // Act
        int actualSize1 = list.size();
        list.add(4);
        int actualSize2 = list.size();

        // Assert
        assertEquals(3,actualSize1);
        assertEquals(4,actualSize2);
    }
}
