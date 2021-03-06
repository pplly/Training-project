package com.xuefei.service;

import com.xuefei.bean.Patient;

import java.util.List;

public interface PatientService {

    public Patient findPatientById(String id);

    public List<Patient> findAllPatients();

    public List<Patient> findPatientByName(String name);

    public List<Patient> findPatientByMobile(String mobile);

    public int savePatient(Patient patient);

    public int deletePatient(String id);

    public int updatePatient(Patient patient);

    public int deleteBatch(List<String> ids);

    List<Patient> findPatientByNumber(String fuzzy);
}
