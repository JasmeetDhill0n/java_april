package LinkedListExercise;

import java.util.LinkedList;

public class TaskManagement {
   /* LinkedList Exercises
    a) Task Management
    Create a LinkedList<String> to represent a to-do list.
 Add tasks at the beginning and end of the list.
Remove tasks from the front and back.
 Iterate through the list and print all tasks Search for a particular task and move it to the front.
     */
   public static void main(String[] args) {
       // Create LinkedList
       LinkedList<String> tasks = new LinkedList<>();

       // Add tasks at beginning and end
       tasks.addFirst("Do homework");
       tasks.addLast("Clean room");
       tasks.addLast("Buy groceries");

       // Print tasks
       System.out.println("To-Do List:");
       for (String task : tasks) {
           System.out.println(task);
       }

       // Remove first and last task
       tasks.removeFirst(); // removes "Do homework"
       tasks.removeLast();  // removes "Buy groceries"

       System.out.println("\nAfter removing first and last:");
       for (String task : tasks) {
           System.out.println(task);
       }

       // Move a task to front
       String searchTask = "Clean room";
       if (tasks.contains(searchTask)) {
           tasks.remove(searchTask);
           tasks.addFirst(searchTask);
       }

       System.out.println("\nAfter moving task to front:");
       for (String task : tasks) {
           System.out.println(task);
       }
   }


}
