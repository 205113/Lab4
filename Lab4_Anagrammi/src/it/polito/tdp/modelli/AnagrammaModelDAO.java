package it.polito.tdp.modelli;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class AnagrammaModelDAO {

public List<Parola> esistenti(List<String> anagrammi){
	List<Parola> parole= new ArrayList<Parola>();
	Connessione c= new Connessione("jdbc:mysql://localhost/dizionario?user=root");
	Connection conn= c.connetti();
	String sql="";
	boolean esiste;
	try {
		for(int i=0;i<anagrammi.size();i++){
			sql="SELECT nome FROM parola WHERE nome = ?";// query incompleta
			PreparedStatement s= conn.prepareStatement(sql);
			s.setString(1, anagrammi.get(i));
			ResultSet rs= s.executeQuery();
			if(rs.next())
				esiste=true;
			else
				esiste=false;
			Parola p= new Parola(anagrammi.get(i),esiste);
			parole.add(p);
			rs.close();
	}
	conn.close();	
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return parole;
}
}
