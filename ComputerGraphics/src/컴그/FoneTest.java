package 컴그;

import java.awt.*;
import java.awt.font.*;

public class FoneTest {
	public static void main(String[] args) {
		GraphicsEnvironment gEnv=GraphicsEnvironment.getLocalGraphicsEnvironment();
		String fonts[]=gEnv.getAvailableFontFamilyNames();
		
		for(int i=0;i<fonts.length;i++) System.out.println(""+ fonts[i]);
	}
}
