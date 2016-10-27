package sd_dtu.hollerandroid;

/**
 * Created by mohitkumar on 27/10/16.
 */

public class NavRecyclerProvider {

    public NavRecyclerProvider(int src,String option,String upvalue)
    {
        this.setSrc(src);
        this.setOption(option);
        this.setUpvalue(upvalue);
    }

    int src;
    String option,upvalue;

    public int getSrc() {
        return src;
    }

    public String getOption() {
        return option;
    }

    public String getUpvalue() {
        return upvalue;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public void setSrc(int src) {
        this.src = src;
    }

    public void setUpvalue(String upvalue) {
        this.upvalue = upvalue;
    }
}
