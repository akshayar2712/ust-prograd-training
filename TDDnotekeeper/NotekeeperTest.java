import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class NotekeeperTest {
    private Notekeeper notekeeper;
    Map<Integer, List<String>> expectedAnswer;
    @BeforeEach
    public void setup(){
        notekeeper = new Notekeeper();
    }
    public void addItemsIntoExpectedTodoList(){
        expectedAnswer = new HashMap<Integer, List<String>>();
        expectedAnswer.put(101, Arrays.asList("Task1", "COMPLETED"));
        expectedAnswer.put(102, Arrays.asList("Task2", "NOT COMPLETED"));
        expectedAnswer.put(103, Arrays.asList("Task3", "COMPLETED"));
    }

    public void addItemsIntoActualTodoList(){
        notekeeper.addItemsIntoTodoList(101,"Task1","COMPLETED");
        notekeeper.addItemsIntoTodoList(102,"Task2","NOT COMPLETED");
        notekeeper.addItemsIntoTodoList(103,"Task3","COMPLETED");
    }

    @Test
    public void addingItemsIntoTodoList(){
        addItemsIntoExpectedTodoList();
        addItemsIntoActualTodoList();
        assertEquals(expectedAnswer,notekeeper.getToTodoList());
    }

    @Test
    public void removeItemsFromTodoList(){
        addingItemsIntoTodoList();
        expectedAnswer.remove(103);
        addItemsIntoActualTodoList();
        notekeeper.removeItemsFromTodoList(103);
        assertEquals(expectedAnswer,notekeeper.getToTodoList());
    }

    @Test
    public void unRemoveItemsFromTodoList(){
        addItemsIntoExpectedTodoList();
        addItemsIntoActualTodoList();
        notekeeper.removeItemsFromTodoList(103);
        assertEquals(expectedAnswer,notekeeper.unRemoveItemsFromTodoList());
    }
    @Test
    public void toggleBetweenCompletedAndNotCompleted(){
        addItemsIntoExpectedTodoList();
        expectedAnswer.remove(102);
        expectedAnswer.remove(103);
        notekeeper.addItemsIntoTodoList(101,"Task1","NOT COMPLETED");
        assertEquals(expectedAnswer,notekeeper.toggleStatus(101));
    }

    @Test
    public void checkIfTodoListIsEmptyOrNotWhilePerformingDeletion(){
        assertThrows(IllegalArgumentException.class,() -> {
            notekeeper.removeItemsFromTodoList(103);});
    }
}