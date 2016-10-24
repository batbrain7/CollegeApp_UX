package sd_dtu.hollerandroid;

/**
 * Created by mohitkumar on 25/10/16.
 */

public class RecyclerData {

    public RecyclerData(String event,String update)
    {
        this.setEvent(event);
        this.setUpdate(update);
    }

    private String event,update;

    public String getEvent() {
        return event;
    }

    public String getUpdate() {
        return update;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public void setUpdate(String update) {
        this.update = update;
    }
}
