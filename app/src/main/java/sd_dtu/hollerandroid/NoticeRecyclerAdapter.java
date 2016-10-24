package sd_dtu.hollerandroid;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by mohitkumar on 25/10/16.
 */

public class NoticeRecyclerAdapter extends RecyclerView.Adapter<NoticeRecyclerAdapter.EventViewHolder> {
    ArrayList<RecyclerData> data = new ArrayList<RecyclerData>();
    Context context;

    public NoticeRecyclerAdapter(ArrayList<RecyclerData> data,Context context)
    {
        this.data = data;
        this.context = context;
    }
    @Override
    public EventViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_layout,parent,false);
        EventViewHolder eventViewHolder = new EventViewHolder(view,context,data);
        return eventViewHolder;
    }

    @Override
    public void onBindViewHolder(EventViewHolder holder, int position) {
        RecyclerData datac = data.get(position);
        holder.textView1.setText(datac.getEvent());
        holder.textView2.setText(datac.getUpdate());
    }


    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class EventViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {
        Context context;
        ArrayList<RecyclerData> recyclerData;
        TextView textView1,textView2;

        public EventViewHolder(View itemView, Context context,ArrayList<RecyclerData> recyclerData) {
            super(itemView);
            this.context = context;
            this.recyclerData = recyclerData;
            itemView.setOnClickListener(this);
            textView1 = (TextView) itemView.findViewById(R.id.event_text);
            textView2 = (TextView) itemView.findViewById(R.id.update);
        }

        @Override
        public void onClick(View view) {

        }
    }
}
