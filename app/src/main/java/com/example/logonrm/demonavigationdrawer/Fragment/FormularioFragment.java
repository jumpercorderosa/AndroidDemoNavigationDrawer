package com.example.logonrm.demonavigationdrawer.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.logonrm.demonavigationdrawer.R;

import static android.R.attr.onClick;

/**
 * A simple {@link Fragment} subclass.
 */

public class FormularioFragment extends Fragment implements View.OnClickListener {

    private EditText etVlr1;
    private EditText etVlr2;

    private Button btPlus;
    private Button btMinus;
    private Button btMultiply;
    private Button btDivide;

    private EditText etResultado;

    public FormularioFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //Altero isso para o código abaixo
        //return inflater.inflate(R.layout.fragment_formulario, container, false);

        // Inflate the layout for this fragment
        View itemView = inflater.inflate(R.layout.fragment_formulario, container, false);
        etVlr1 = (EditText) itemView.findViewById(R.id.etVlr1);
        etVlr2 = (EditText) itemView.findViewById(R.id.etVlr2);
        btPlus = (Button) itemView.findViewById(R.id.btSum);
        btMinus = (Button) itemView.findViewById(R.id.btMinus);
        btMultiply = (Button) itemView.findViewById(R.id.btMultiply);
        btDivide = (Button) itemView.findViewById(R.id.btDivide);
        etResultado = (EditText) itemView.findViewById(R.id.etResult);

        btPlus.setOnClickListener(this);
        btMinus.setOnClickListener(this);
        btMultiply.setOnClickListener(this);
        btDivide.setOnClickListener(this);

        return itemView;

    }

    @Override
    public void onClick(View v) {
        int v1 = Integer.parseInt(etVlr1.getText().toString());
        int v2 = Integer.parseInt(etVlr2.getText().toString());

        int resultado = 0;

        switch(v.getId()) {
            case R.id.btSum:
                resultado = v1 + v2;
                //etResultado.setText(String.valueOf(v1 + v2));
                break;
            case R.id.btMinus:
                resultado = v1 - v2;
                //etResultado.setText(String.valueOf(v1 + v2));
                break;
            case R.id.btMultiply:
                resultado = v1 * v2;
                //etResultado.setText(String.valueOf(v1 * v2));
                break;
            case R.id.btDivide:
                resultado = v1 / v2;
                //etResultado.setText(String.valueOf(v1 / v2));
                break;
            default:
                break;
        }

        etResultado.setText(String.valueOf(resultado));
    }
}
