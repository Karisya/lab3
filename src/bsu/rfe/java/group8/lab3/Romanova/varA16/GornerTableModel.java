package bsu.rfe.java.group8.lab3.Romanova.varA16;

import javax.swing.table.AbstractTableModel;
import javax.swing.*;
import java.awt.*;



public class GornerTableModel extends AbstractTableModel{
	private Double[] coefficients; 
	private Double from;
	private Double to;
	private Double step;
    //ImageIcon icon = new ImageIcon("/Users/aleakseiambrazhei/Desktop/flag.png");
    //Icon questionIcon = UIManager.getIcon(flag.png");


	public GornerTableModel(Double from, Double to, Double step, Double[] coefficients) {
	this.from = from;
	this.to = to;
	this.step = step; 
	this.coefficients = coefficients;
	}
	public Double getFrom() {
	return from; 
	}
	public Double getTo() {
	return to;
	}
	public Double getStep() {
	return step;
	}
	public int getColumnCount() {
	// В данной модели два столбца 
	return 3;
	}
	
	 public int getRowCount() {
	        return (int)Math.ceil((to-from)/step) + 1;
	    }
	 
	public Object getValueAt(int row, int col) {
	// Вычислить значение X как НАЧАЛО_ОТРЕЗКА + ШАГ*НОМЕР_СТРОКИ
	double x = from +  step * row;
	if (col == 0) {
	// Если запрашивается значение 1-го столбца, то это X
	return x; } 
	else if (col == 1)
		{// Если запрашивается значение 2-го столбца, то это значение многочлена
	double result = 0.0;
	// Вычисленbе значения в точке по схеме Горнера.
	result = this.coefficients[0];
	for (int i = 0; i < coefficients.length; i++) 
		{
       result = calculateHorner(x);}
	return result;
		} 
	else {
		double result = 0.0;
		   result = this.coefficients[0];
		   for (int i = 0; i < coefficients.length; i++) 
		    {
		          result = calculateHorner(x);}
		    result = Math.pow(10, 5) * result;
		    long value = Math.round(result);
		    if (value % 2 == 0)
		    	return false;
		    else return true;
//		     return value % 2;
	}
		//return questionIcon;
	}
	
	public String getColumnName (int col) {
		switch (col) {
	case 0:
	// Название 1-го столбца 
		return "Значение X";
	case 1:
		return "Значение многочлена";		
	default:
		return "Нечетная дробная часть";
	// Название 2-го столбца 
	} 
		}
	 private double calculateHorner(double x){
	        Double b = coefficients[coefficients.length-1];
	        for (int i = coefficients.length - 2; i >= 0; i--){
	            b = b * x + coefficients[i];
	        }
	        return b;
	    }
	
	public Class<?> getColumnClass(int col) {
		if(col==2) return Boolean.class;
		else return Double.class;
	// И в 1-ом и во 2-ом столбце находятся значения типа 
	
	} 
	}

