package com.idn.farras.marioproduct.Main.Model;

import java.util.List;
//import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

//@Generated("com.robohorse.robopojogenerator")
public class ResponseMario{

	@SerializedName("amiibo")
	private List<AmiiboItem> amiibo;

	public void setAmiibo(List<AmiiboItem> amiibo){
		this.amiibo = amiibo;
	}

	public List<AmiiboItem> getAmiibo(){
		return amiibo;
	}

	@Override
 	public String toString(){
		return 
			"ResponseMario{" + 
			"amiibo = '" + amiibo + '\'' + 
			"}";
		}
}