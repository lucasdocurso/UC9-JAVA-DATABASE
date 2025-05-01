/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClinicaLista.model;

//classe para guardar as informações de uma consulta
public class Clinic {
    private String doctor;
    private String query;
    private String date;

    public Clinic(String doctor, String query, String date) {
        this.doctor = doctor;
        this.query = query;
        this.date = date;
    }
//getters e setters para pegar e mudar os valores dos objetos
    public String getDoctor() {
        return doctor;
    }

    public String getQuery() {
        return query;
    }

    public String getDate() {
        return date;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
