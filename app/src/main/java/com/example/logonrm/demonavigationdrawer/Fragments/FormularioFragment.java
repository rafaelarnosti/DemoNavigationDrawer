package com.example.logonrm.demonavigationdrawer.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SearchViewCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.logonrm.demonavigationdrawer.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FormularioFragment extends Fragment implements View.OnClickListener {

    private EditText valor1;
    private EditText valor2;
    private Button Soma;
    private Button Subtracao;
    private Button Multiplicacao;
    private Button Divisao;
    private TextView Resultado;


    public FormularioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View itemView = inflater.inflate(R.layout.fragment_formulario, container, false);
        valor1 = (EditText) itemView.findViewById(R.id.valor1);
        valor2 = (EditText) itemView.findViewById(R.id.valor2);
        Soma = (Button) itemView.findViewById(R.id.Soma);
        Subtracao = (Button) itemView.findViewById(R.id.Subtracao);
        Multiplicacao = (Button) itemView.findViewById(R.id.Multiplicacao);
        Divisao = (Button) itemView.findViewById(R.id.Divisao);
        Resultado = (TextView) itemView.findViewById(R.id.Resultado);

        Soma.setOnClickListener(this);
        Subtracao.setOnClickListener(this);
        Divisao.setOnClickListener(this);
        Multiplicacao.setOnClickListener(this);
        // Inflate the layout for this fragment
        return itemView;
    }

    @Override
    public void onClick(View v) {
        int resultado = 0;
        switch (v.getId()){
            case R.id.Soma:
                resultado = Integer.parseInt(valor1.getText().toString()) + Integer.parseInt(valor2.getText().toString());
                break;
            case R.id.Subtracao:
                resultado = Integer.parseInt(valor1.getText().toString()) - Integer.parseInt(valor2.getText().toString());
                break;
            case R.id.Multiplicacao:
                resultado = Integer.parseInt(valor1.getText().toString()) * Integer.parseInt(valor2.getText().toString());
                break;
            case R.id.Divisao:
                resultado = Integer.parseInt(valor1.getText().toString()) / Integer.parseInt(valor2.getText().toString());
                break;
        }
        Resultado.setText(String.valueOf(resultado));
    }
}
