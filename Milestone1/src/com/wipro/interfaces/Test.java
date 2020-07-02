package com.wipro.interfaces;
import com.wipro.interfaces.music.Playable;
import com.wipro.interfaces.music.string.*;
import com.wipro.interfaces.music.wind.*;
public class Test 
{

	public static void main(String[] args) 
	{
		Veena v=new Veena();
		v.play();
		Saxophone s=new Saxophone();
		s.play();
		Playable vp,vs;
		vp=new Veena();
		vp.play();
		vs=new Saxophone();
		vs.play();
	}

}
