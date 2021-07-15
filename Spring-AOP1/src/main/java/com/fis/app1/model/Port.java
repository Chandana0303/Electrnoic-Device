package com.fis.app1.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Port {
	
	@Value("${port.noofports}")
	public int no_of_ports;

	Port() {
		super();
		// TODO Auto-generated constructor stub
	}

	Port(int no_of_ports) {
		super();
		this.no_of_ports = no_of_ports;
	}

	public int getNo_of_ports() {
		return no_of_ports;
	}

	public void setNo_of_seats(int no_of_ports) {
		this.no_of_ports = no_of_ports;
	}

	@Override
	public String toString() {
		return "Port [no_of_ports=" + no_of_ports + "]";
	}
	

}
