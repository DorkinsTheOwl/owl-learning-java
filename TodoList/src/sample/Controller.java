package sample;

import sample.datamodel.TodoItem;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Controller {

    private List<TodoItem> todoItems;

    public void initialize() {
        TodoItem item1 = new TodoItem("Mail birthday card", "Bue a birthday card for John",
                LocalDate.of(2018, Month.APRIL, 25));
        TodoItem item2 = new TodoItem("Doctor's Appointment", "See Dr. Smith at 123 Main Street. Bring papers",
                LocalDate.of(2018, Month.MAY, 23));
        TodoItem item3 = new TodoItem("Finish design proposal for client", "I promised Mike i'd email website mockups by Friday 22nd April",
                LocalDate.of(2018, Month.APRIL, 22));
        TodoItem item4 = new TodoItem("Pickup Dave at the train station", "Dave's arriving on January 3rd on the 17:00 train",
                LocalDate.of(2018, Month.JANUARY, 3));
        TodoItem item5 = new TodoItem("Pick up dry cleaning", "The clothes should be ready for Wednesday",
                LocalDate.of(2018, Month.JANUARY, 15));

        todoItems = new ArrayList<TodoItem>();
        todoItems.add(item1);
        todoItems.add(item2);
        todoItems.add(item3);
        todoItems.add(item4);
        todoItems.add(item5);
    }
}
