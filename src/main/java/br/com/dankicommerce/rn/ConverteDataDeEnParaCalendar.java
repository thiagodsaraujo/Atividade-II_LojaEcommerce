package br.com.dankicommerce.rn;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ConverteDataDeEnParaCalendar {

	public Calendar executa(String data) {
		String[] dataParts = data.split("-"); //["2021", "02","11"]
		
		Integer ano = Integer.parseInt(dataParts[0]); // 2021
		Integer mes = Integer.parseInt(dataParts[1]); // 2
		Integer dia = Integer.parseInt(dataParts[2]); // 11
		
		Calendar calendar = new GregorianCalendar(ano,(mes-1), dia);
		
		return calendar;
	}
	
	

}
