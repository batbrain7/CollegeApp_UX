package sd_dtu.hollerandroid;


import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link WelcomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class WelcomeFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    Context context;
    String[] univs = {"University","Delhi Technological University(DTU)", "Netaji Subhash Institute of Technology(NSIT)","Indian Institute od Technology,Delhi(IITD)"
    ,"Maharaja Agarsen Institute of Technology(MAIT)","Bhagwan Parshuram Instutute of Technology(BPIT)","Vivekanand Institute of Professsional Studies(VIPS)",
    "jims"};
    String[] Branch = {"Branch","Computer Engineering","Electrical Engineering","ECE","EEE","etc..."};
    String[] Year  = {"Year","2012","2013","2015","2016"};
    Spinner spinner,spinnerb,spinnery;
    ArrayAdapter<String> arrayAdapter;
    ArrayAdapter<String> arrayAdapterb;
    ArrayAdapter<String> arrayAdaptery;

    public WelcomeFragment() {
        // Required empty public constructor
    }

    public static WelcomeFragment newInstance(String param1, String param2) {
        WelcomeFragment fragment = new WelcomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v =  inflater.inflate(R.layout.fragment_welcome, container, false);
        //
        spinner = (Spinner)v.findViewById(R.id.university);
        arrayAdapter = new ArrayAdapter<String>(getActivity().getApplicationContext(),R.layout.spinner_item,univs){
            @Override
            public boolean isEnabled(int position) {
                if(position == 0)
                {
                    return false;
                }
                else
                {
                    return true;
                }
            }

            @Override
            public View getDropDownView(int position, View convertView, ViewGroup parent) {
                View v = super.getDropDownView(position, convertView, parent);
                TextView tv = (TextView) v;
                if(position == 0){
                    // Set the hint text color gray
                    tv.setTextColor(Color.parseColor("#999aa5"));
                }
                else {
                    tv.setTextColor(Color.BLACK);
                }
                return v;
            }
        };
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);
        //
        spinnerb = (Spinner)v.findViewById(R.id.branch);
        arrayAdapterb = new ArrayAdapter<String>(getActivity().getApplicationContext(),R.layout.spinner_item,Branch){
            @Override
            public boolean isEnabled(int position) {
                if(position == 0)
                {
                    return false;
                }
                else
                {
                    return true;
                }
            }

            @Override
            public View getDropDownView(int position, View convertView, ViewGroup parent) {
                View v = super.getDropDownView(position, convertView, parent);
                TextView tv = (TextView) v;
                if(position == 0){
                    // Set the hint text color gray
                    tv.setTextColor(Color.parseColor("#999aa5"));
                }
                else {
                    tv.setTextColor(Color.BLACK);
                }
                return v;
            }
        };
        arrayAdapterb.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerb.setAdapter(arrayAdapterb);
        //
        spinnery = (Spinner)v.findViewById(R.id.year);
        arrayAdaptery = new ArrayAdapter<String>(getActivity(),R.layout.spinner_item,Year){
            @Override
            public boolean isEnabled(int position) {
                if(position == 0)
                {
                    return false;
                }
                else
                {
                    return true;
                }
            }

            @Override
            public View getDropDownView(int position, View convertView, ViewGroup parent) {
                View v = super.getDropDownView(position, convertView, parent);
                TextView tv = (TextView) v;
                if(position == 0){
                    // Set the hint text color gray
                    tv.setTextColor(Color.parseColor("#999aa5"));
                }
                else {
                    tv.setTextColor(Color.BLACK);
                }
                return v;
            }
        };
        arrayAdaptery.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnery.setAdapter(arrayAdaptery);

        return v;
    }
}
