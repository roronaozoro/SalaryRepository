package com.employee.service;

import java.io.ByteArrayInputStream;

import javax.servlet.ServletOutputStream;

import com.itextpdf.text.DocumentException;

public interface SalarySheetService {

	void createSalarySheet(ServletOutputStream outputStream) throws DocumentException;

	
}
