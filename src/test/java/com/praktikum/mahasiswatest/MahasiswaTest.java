/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.praktikum.mahasiswatest;

/**
 *
 * @author LEGION
 */
import com.praktikum.mahasiswatest.Mahasiswa;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MahasiswaTest {

    private Mahasiswa mahasiswaLulus;
    private Mahasiswa mahasiswaTidakLulus;

    @BeforeEach
    void setUp() {
        mahasiswaLulus = new Mahasiswa("Hadi", 75);
        mahasiswaTidakLulus = new Mahasiswa("Suki", 45);
    }

    @Test
    void testNilaiLulus() {
        assertTrue(mahasiswaLulus.isLulus(),
            "Mahasiswa dengan nilai 75 seharusnya lulus");
    }

    @Test
    void testNilaiTidakLulus() {
        assertFalse(mahasiswaTidakLulus.isLulus(),
            "Mahasiswa dengan nilai 45 seharusnya tidak lulus");
    }

    @Test
    void testBatasNilaiLulus() {
        Mahasiswa batas = new Mahasiswa("Jamal", 60);
        assertTrue(batas.isLulus(),
            "Mahasiswa dengan nilai tepat 60 seharusnya lulus");
    }

    @Test
    void testBatasNilaiTidakLulus() {
        Mahasiswa batasBawah = new Mahasiswa("Farhan", 59);
        assertFalse(batasBawah.isLulus(),
            "Mahasiswa dengan nilai 59 seharusnya tidak lulus");
    }
}