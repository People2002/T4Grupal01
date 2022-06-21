package com.example.t4grupal01;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragmento1 extends Fragment {
    EditText txtNumero1, txtNumero2;
    TextView txtResultado;
    Button btnSumar;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragmento1() {
        // Required empty public constructor
    }

    public static Fragmento1 newInstance(String param1, String param2) {
        Fragmento1 fragment = new Fragmento1();
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
        View v = inflater.inflate(R.layout.fragment_fragmento1, container, false);

        txtResultado = v.findViewById(R.id.lblResult);

        txtNumero1 = v.findViewById(R.id.txtNum1);
        txtNumero2 = v.findViewById(R.id.txtNum2);
        btnSumar = v.findViewById(R.id.btnSumar);
        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Numero1 = Double.parseDouble(txtNumero1.getText().toString());
                double Numero2 = Double.parseDouble(txtNumero2.getText().toString());
                double monto = (Numero1 + Numero2);
                Toast.makeText(getContext(), "El resultado de la suma es: "+monto, Toast.LENGTH_SHORT).show();
                txtResultado.setText("El resultado de la suma es: "+monto);
            }
        });
        return v;
    }
}