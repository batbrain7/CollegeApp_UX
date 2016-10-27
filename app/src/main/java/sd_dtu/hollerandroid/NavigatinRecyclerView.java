package sd_dtu.hollerandroid;

import android.content.Context;
import android.graphics.Typeface;
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

public class NavigatinRecyclerView extends RecyclerView.Adapter<NavigatinRecyclerView.NavbarViewHolder>{

    ArrayList<NavRecyclerProvider> arrayList = new ArrayList<NavRecyclerProvider>();

    public NavigatinRecyclerView(ArrayList<NavRecyclerProvider> arrayList)
    {
        this.arrayList = arrayList;
    }
    @Override
    public NavbarViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.navbar_layout,parent,false);
        NavbarViewHolder navbarViewHolder = new NavbarViewHolder(view);
        return navbarViewHolder;
    }

    @Override
    public void onBindViewHolder(NavbarViewHolder holder, int position) {
        NavRecyclerProvider datac = arrayList.get(position);
        holder.textView1.setText(datac.getOption());
        holder.textView2.setText(datac.getUpvalue());
        holder.imageView.setImageResource(datac.getSrc());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class NavbarViewHolder extends RecyclerView.ViewHolder
    {
        TextView textView1;
        ImageView imageView;
        TextView textView2;
        public NavbarViewHolder(View itemView) {
            super(itemView);
            textView1 = (TextView)itemView.findViewById(R.id.optin_name);
            textView2 = (TextView)itemView.findViewById(R.id.updated_info);
            imageView = (ImageView)itemView.findViewById(R.id.img_icon);
        }
    }
}
