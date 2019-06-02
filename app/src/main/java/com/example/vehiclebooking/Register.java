package com.example.vehiclebooking;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class Register extends Fragment implements View.OnClickListener {

    EditText et_lname,et_fname,et_uname,et_pass;
    Button btn_reg;
    public Register() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_register, container, false);

        et_fname= view.findViewById(R.id.et_ufname);
        et_lname=view.findViewById(R.id.et_ulname);
        et_uname=view.findViewById(R.id.et_username);
        et_pass=view.findViewById(R.id.et_password);
        btn_reg=view.findViewById(R.id.btn_signup);

        btn_reg.setOnClickListener(this);

        return view;

    }

    @Override
    public void onClick(View view) {

    }
}
