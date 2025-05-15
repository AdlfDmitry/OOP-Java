package dmitry;
import java.util.ArrayList;
import java.util.List;

public class Sprint {
    private final int capacity;
    private final List<Ticket> tickets;

    public Sprint(int capacity) {
        this.capacity = capacity;
        this.tickets = new ArrayList<>();
    }

    public boolean addUserStory(UserStory userStory) {
        if (userStory == null || userStory.isCompleted() || getTotalEstimate() + userStory.getEstimate() > capacity || tickets.size() >= capacity) {
            return false;
        }
        tickets.add(userStory);
        return true;
    }

    public boolean addBug(Bug bug) {
        if (bug == null || bug.isCompleted() || getTotalEstimate() + bug.getEstimate() > capacity || tickets.size() >= capacity) {
            return false;
        }
        tickets.add(bug);
        return true;
    }

    public List<Ticket> getTickets() {
        return new ArrayList<>(tickets);
    }

    public int getTotalEstimate() {
        int totalEstimate = 0;
        for (Ticket ticket : tickets) {
            totalEstimate += ticket.getEstimate();
        }
        return totalEstimate;
    }
}