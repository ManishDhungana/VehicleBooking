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
public class Login extends Fragment implements View.OnClickListener {

    EditText etuname,etpass;
    Button btn_login;

    public Login() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_login, container, false);

        etuname=view.findViewById(R.id.et_lusername);
        etpass=view.findViewById(R.id.et_lpassword);
        btn_login=view.findViewById(R.id.btn_lsignin);

        btn_login.setOnClickListener(this);
        return inflater.inflate(R.layout.fragment_login, container, false);
    }

    @Override
    public void onClick(View view) {

    }
}
