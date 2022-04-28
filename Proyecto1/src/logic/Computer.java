package logic;
import java.awt.Color;
import java.util.ArrayList;

public class Computer extends Player{
	public ArrayList<Color> clueTokens = new ArrayList<Color>(); 
	public Computer() {

	}
	public void verifyCodeR(ArrayList<Color> userSubmitR) {
		for(int i = 0; i < userSubmitR.size(); i++) {
			if(this.colorTokens.get(i) == userSubmitR.get(i) ) {
				this.clueTokens.add(Color.red);
			}
	}
	}
	public void verifyCodeW(ArrayList<Color> userSubmitW) {
		for(int j = 0; j < userSubmitW.size(); j++) {
			if(this.clueTokens.size() >= 4) {
				break;
			}
			else if(userSubmitW.contains(colorTokens.get(j))) {
				this.clueTokens.add(Color.white);
			}
		}
	}

	

	/*
	public void verifyCode(ArrayList<Color> userSubmit) {
		for(int i = 0; i < userSubmit.size(); i++) {
			if(this.colorTokens.get(i) == userSubmit.get(i) ) {
				this.clueTokens.add(Color.red);
			}
		for(int j = 0; j < userSubmit.size(); j++) {
			if(this.clueTokens.size() >= 4 ) {
					break;
				}else if(this.colorTokens.get(0) == userSubmit.get(j) && j != 0){
					
					this.clueTokens.add(Color.WHITE);
					}
			if(this.clueTokens.size() >= 4 ) {
				
					break;
				}else if(this.colorTokens.get(0) == userSubmit.get(j) && j != 0){
					
					this.clueTokens.add(Color.WHITE);
					}
				
			if(this.clueTokens.size() >= 4 ) {
				
					break;
				}else if(this.colorTokens.get(0) == userSubmit.get(j) && j != 0){
					
					this.clueTokens.add(Color.WHITE);
					}
				
			if(this.clueTokens.size() >= 4 ) {
				
					break;
				}else if(this.colorTokens.get(0) == userSubmit.get(j) && j != 0){
					
					this.clueTokens.add(Color.WHITE);
					}
				
				
			}
		}
	}*/

	public ArrayList<Color> getClueToken(){
		 return this.clueTokens;
		}
		
	}

