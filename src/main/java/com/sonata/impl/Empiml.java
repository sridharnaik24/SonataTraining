package com.sonata.impl;
import com.sonata.model.Employee1;
import com.sonata.intf.Empintf;

public class Empiml implements Empintf{

	@Override
	public double yearlysal(Employee1 e1) {
		double ySal;
		ySal=e1.getSal()*12;
		return ySal;
		
	}

	@Override
	public double appsal(Employee1 e1) {
		double aSal;
		if(e1.getSal()<10000) {
			aSal=5000;
			
		}else {
			aSal=1000;
		}
		return aSal;
	}

}
