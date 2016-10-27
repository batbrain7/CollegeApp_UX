package sd_dtu.hollerandroid;

/**
 * Created by mohitkumar on 27/10/16.
 */

public class EventData {

    int image_src;
    String Eventname,Venue,Organisation,Date,Time;

    public EventData(int image_src,String Eventname,String Venue,String Organisation,String Date,String Time)
    {
        this.setImage_src(image_src);
        this.setDate(Date);
        this.setEventname(Eventname);
        this.setTime(Time);
        this.setOrganisation(Organisation);
        this.setVenue(Venue);
    }

    public int getImage_src() {
        return image_src;
    }

    public String getDate() {
        return Date;
    }

    public String getEventname() {
        return Eventname;
    }

    public String getOrganisation() {
        return Organisation;
    }

    public String getTime() {
        return Time;
    }

    public String getVenue() {
        return Venue;
    }

    public void setDate(String date) {
        Date = date;
    }

    public void setEventname(String eventname) {
        Eventname = eventname;
    }

    public void setImage_src(int image_src) {
        this.image_src = image_src;
    }

    public void setOrganisation(String organisation) {
        Organisation = organisation;
    }

    public void setTime(String time) {
        Time = time;
    }

    public void setVenue(String venue) {
        Venue = venue;
    }
}
