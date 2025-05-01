/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClinicaLista.controller;

import ClinicaLista.dao.ClinicDAO;
import ClinicaLista.model.Clinic;

public class ClinicController {//recebe os dados do usuario, cria o clinic e manda para o DAO que insere no banco
    private final ClinicDAO clinicDAO;
    

    public ClinicController(ClinicDAO clinicDAO) {//Recebe o DAO como parâmetro.
        this.clinicDAO = clinicDAO;
    }

    public String insertClinic(String doctor, String query, String date) {//metodo para inserir uma nova consulta
        try {
            Clinic clinic = new Clinic(doctor, query, date);
            clinicDAO.insertClinic(clinic);//usa o DAO para mandar pro banco
            return "Dados inseridos com sucesso.";
        } catch (Exception e) {
            return "Erro: " + e.getMessage();
        }
    }
}
