package sd_dtu.hollerandroid;


import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PersonalDetailsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PersonalDetailsFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    EditText studentid,password,conpassword,phoneno;
    TextView textView,textView2;

    public PersonalDetailsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PersonalDetailsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PersonalDetailsFragment newInstance(String param1, String param2) {
        PersonalDetailsFragment fragment = new PersonalDetailsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_personal_details, container, false);
        textView = (TextView) v.findViewById(R.id.personal_text);
        textView2 = (TextView) v.findViewById(R.id.text3);
        studentid = (EditText) v.findViewById(R.id.student_id);
        password = (EditText) v.findViewById(R.id.password);
        conpassword = (EditText) v.findViewById(R.id.confirmed_password);
        phoneno = (EditText) v.findViewById(R.id.phone_no);
        Typeface custom_font = Typeface.createFromAsset(getActivity().getAssets(),  "fonts/DroidSans.ttf");
        studentid.setTypeface(custom_font);
        password.setTypeface(custom_font);
        conpassword.setTypeface(custom_font);
        phoneno.setTypeface(custom_font);
        textView.setTypeface(custom_font);
        textView2.setTypeface(custom_font);


        studentid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                studentid.setBackgroundColor(Color.parseColor("#fff"));
            }
        });

        password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                password.setBackgroundColor(Color.parseColor("#fff"));
            }
        });
        conpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                conpassword.setBackgroundColor(Color.parseColor("#fff"));
            }
        });
        phoneno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                phoneno.setBackgroundColor(Color.parseColor("#fff"));
            }
        });
        return v;
    }

}
