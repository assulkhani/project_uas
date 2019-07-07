package com.assulkhani.project_uas;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class PengaduanFragment extends Fragment {

    EditText edNik;
    EditText edNama;
    EditText edIsi;
    Button btnKirim;

    TextView dNik;
    TextView dNama;
    TextView dIsi;

    String nik;
    String nama;
    String isi;

    public PengaduanFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        edNik.findViewById(R.id.ed_nik);
        edNama.findViewById(R.id.ed_nama);
        edIsi.findViewById(R.id.ed_isi);
        btnKirim.findViewById(R.id.btn_kirim);

        dNik.findViewById(R.id.tv_nik);
        dNama.findViewById(R.id.tv_nama);
        dIsi.findViewById(R.id.tv_isi);
        // Inflate the layout for this fragment


        btnKirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nik = edNik.getText().toString();
                nama = edNama.getText().toString();
                isi = edIsi.getText().toString();

                dNik.setText(nik);
                dNama.setText(nama);
                dIsi.setText(isi);
            }
        });
        return inflater.inflate(R.layout.fragment_pengaduan, container, false);
    }

}
