package ntnu.idatt2001.models;

import ntnu.idatt2001.models.Task;

import java.util.Comparator;

/**
 * Comparator class to sort task
 * it is need so task without deadline will be placed at the bottom of the list
 */
public class TaskComparator implements Comparator<Task> {
    public int compare(Task left, Task right) {
        // compares if left and right is null
        if (left.getDeadline() == null) return right.getDeadline() == null ? 0 : 1;
        if (right.getDeadline() == null) return -1;
        // you are now guaranteed that neither left nor right are null.

        // if neither left nor right are null
        return left.getDeadline().compareTo(right.getDeadline());
    }
}
