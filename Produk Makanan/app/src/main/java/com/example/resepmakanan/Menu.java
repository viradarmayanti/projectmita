package com.example.resepmakanan;

public class Menu {

    private String nama;
    private String harga;
    private String gambar;
    private String keterangan;

    public Menu(String datanama, String dataharga, String datagambar, String dataketerangan) {
        nama = datanama;
        harga = dataharga;
        gambar = datagambar;
        keterangan = dataketerangan;
    }

    public String getNama() {
        return nama;
    }

    public String getHarga() {
        return harga;
    }

    public String getGambar() {
        return gambar;
    }

    public String getKeterangan() {
        return keterangan;
    }
}
