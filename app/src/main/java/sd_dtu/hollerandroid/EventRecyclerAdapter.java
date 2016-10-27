package sd_dtu.hollerandroid;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by mohitkumar on 27/10/16.
 */

public class EventRecyclerAdapter extends RecyclerView.Adapter<EventRecyclerAdapter.EventRecyclerViewHolder>{

    ArrayList<EventData> arrayList = new ArrayList<EventData>();
    Context context;

    public EventRecyclerAdapter(ArrayList<EventData> arrayList,Context context){
        this.arrayList = arrayList;
        this.context = context;
    }


    @Override
    public EventRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_layout,parent,false);
        EventRecyclerViewHolder eventRecyclerViewHolder = new EventRecyclerViewHolder(view,context,arrayList);
        return eventRecyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(EventRecyclerViewHolder holder, int position) {
        EventData eventData = arrayList.get(position);
        Typeface tf = Typeface.createFromAsset(context.getAssets(),"fonts/OpenSans-Light.ttf");
        holder.textView1.setTypeface(tf);
        holder.textView2.setTypeface(tf);
        holder.textView3.setTypeface(tf);
        holder.textView4.setTypeface(tf);
        holder.textView5.setTypeface(tf);
        holder.textView6.setTypeface(tf);
        holder.textView1.setText(eventData.getEventname());
        holder.textView2.setText(eventData.getOrganisation());
        holder.textView3.setText(eventData.getDate());
        holder.textView4.setText(eventData.getTime());
        holder.textView5.setText(eventData.getVenue());
        holder.textView6.setText(eventData.getCollegename());
        holder.imageView.setImageResource(eventData.getImage_src());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class EventRecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView textView1,textView2,textView3,textView4,textView5,textView6;
        ImageView imageView;
        Context context;
        FloatingActionButton floatingActionButton;
        ArrayList<EventData> data = new ArrayList<EventData>();
        public EventRecyclerViewHolder(View itemView,Context context,ArrayList<EventData> data) {
            super(itemView);
            this.data = data;
            this.context  = context;
            itemView.setOnClickListener(this);
            imageView = (ImageView) itemView.findViewById(R.id.event_image);
            textView1 = (TextView) itemView.findViewById(R.id.event_name);
            textView2 = (TextView) itemView.findViewById(R.id.organisation);
            textView3 = (TextView) itemView.findViewById(R.id.date);
            textView4 = (TextView) itemView.findViewById(R.id.time1);
            textView5 = (TextView) itemView.findViewById(R.id.venue);
            textView6 = (TextView) itemView.findViewById(R.id.title_colg);
            floatingActionButton = (FloatingActionButton) itemView.findViewById(R.id.star_button);
            floatingActionButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    
                }
            });
        }

        @Override
        public void onClick(View view) {
            int position  = getAdapterPosition();
            EventData eventData = this.data.get(position);

            if(textView1.getText().toString().equals("Nuclear Conference"))
            {
                Intent intent = new Intent(this.context,FullDetails.class);
                intent.putExtra("item","nuclear conference");
                context.startActivity(intent);
            }
            if(textView1.getText().toString().equals("Startup Fair"))
            {
                Intent intent = new Intent(this.context,FullDetails.class);
                intent.putExtra("item","startup");
                context.startActivity(intent);
            }if(textView1.getText().toString().equals("Ecell Fair"))
            {
                Intent intent = new Intent(this.context,FullDetails.class);
                intent.putExtra("item","Ecellfair");
                context.startActivity(intent);
            }if(textView1.getText().toString().equals("Tech. Week"))
            {
                Intent intent = new Intent(this.context,FullDetails.class);
                intent.putExtra("item","techweek");
                context.startActivity(intent);
            }
        }
    }
}
