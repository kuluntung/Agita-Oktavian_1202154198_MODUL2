package com.example.walatung.tugas2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class DaftarMenu extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> namaList;
    private ArrayList<String> hargaList;
    private ArrayList<String> keteranganList;
    private ArrayList<Integer> imageList;
    //Daftar makanan
    private String[] Makanan = {"Baso", "Gorengan", "Mie Ayam", "Nasi Goreng", "Pempek Palembang"};
    //Daftar Harga
    private String[] Harga = {"Rp.12000", "Rp.5000", "Rp.10000", "Rp.15000", "Rp.7000"};
    private String[] Keterangan = {"Daging Sapi", "Bakwan", "Mie", "Nasi", "Daging Ikan"};
    //Daftar Gambar
    private int[] Gambar = {R.drawable.baso, R.drawable.gorengan, R.drawable.mieayam, R.drawable.nasigoreng, R.drawable.pempek};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);
        namaList = new ArrayList<>();
        hargaList = new ArrayList<>();
        keteranganList = new ArrayList<>();
        imageList = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerview);
        DaftarItem();
        //Menggunakan Layout Manager, Dan Membuat List Secara Vertical
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter = new RecyclerViewAdapter(namaList, hargaList, keteranganList, imageList);
        //Memasang Adapter pada RecyclerView
        recyclerView.setAdapter(adapter);
    }

    //Mengambil data dari Varibale Gambar dan Judul, lalu memasangnya pada list yang terhubung dengan Class Adapter
    private void DaftarItem(){
        for (int w=0; w<Makanan.length; w++){
            namaList.add(Makanan[w]);
            hargaList.add(Harga[w]);
            keteranganList.add(Keterangan[w]);
            imageList.add(Gambar[w]);
        }
    }
}

