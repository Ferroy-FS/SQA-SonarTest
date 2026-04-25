/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.praktikum.mahasiswatest;

/**
 *
 * @author LEGION
 */
public class Mahasiswa {

    private String nama;
    private double nilai;

    public Mahasiswa(String nama, double nilai) {
        this.nama = nama;
        this.nilai = nilai;
    }

    public String getNama() {
        return nama;
    }

    public double getNilai() {
        return nilai;
    }

    public boolean isLulus() {
        return nilai >= 60;
    }
}