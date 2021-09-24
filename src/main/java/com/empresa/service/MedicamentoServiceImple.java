package com.empresa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Medicamento;
import com.empresa.repository.MedicamentoRepository;

@Service
public class MedicamentoServiceImple implements MedicamentoService {

	@Autowired
	private MedicamentoRepository repository;
	
	@Override
	public Medicamento agregarMedicamento(Medicamento medicamento) {
		// TODO Auto-generated method stub
		return repository.save(medicamento);
	}

}
