package es.edunavajas.ejemplo10.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import es.edunavajas.ejemplo10.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ManageFragment extends Fragment {

    private TextView txtManage;
    private Button btnManage;
    private ImageView ivImage;

    private Context context;

    public ManageFragment() {
        // Required empty public constructor
        context = getActivity();
    }

    //SI necesito el contexto me ceo un constructor que tenga el contexto

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_manage, container, false);
        // Tot el codigo necesario para que el fragment funcione
        txtManage = rootView.findViewById(R.id.txtManage);
        btnManage = rootView.findViewById(R.id.btnManage);
        ivImage = rootView.findViewById(R.id.ivImagen);

        btnManage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"HOLA MUNDO",Toast.LENGTH_SHORT).show();
            }
        });
        return rootView;
    }

}
