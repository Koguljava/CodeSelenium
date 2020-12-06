package sikuli.sikuli;

import java.awt.Desktop;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.ImageIcon;

import org.sikuli.basics.Settings;
import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Match;
import org.sikuli.script.OCR;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.ScreenImage;
import org.sikuli.script.TextRecognizer;

/**
 * Hello world!
 *
 */
public class Application 
{
	private static BufferedImage getBufferedImageFromImage(Image image) {

		Image temp = new ImageIcon(image).getImage();
		BufferedImage bufferedImage = new BufferedImage(temp.getWidth(null),
				temp.getHeight(null), BufferedImage.TYPE_INT_RGB);
		Graphics g = bufferedImage.createGraphics();
		g.drawImage(temp, 0, 0, null);
		g.dispose();
		return bufferedImage;
	}

	public static void main( String[] args ) throws IOException, FindFailed, InterruptedException
	{
		Settings.OcrTextRead=true;
		Settings.OcrLanguage = "eng";
		Settings.OcrTextSearch = true;

		File file = new File("C:\\Windows\\System32\\calc.exe");
		Desktop.getDesktop().open(file);
		/*
		 * Pattern f= new Pattern(); Screen sc= new Screen();
		 */


		ImagePath.setBundlePath("F:\\Jar\\Pics\\snippet");
		Screen sc= new Screen();
		sc.click("five.png");
		sc.find("standard.png");
		Thread.sleep(3000);
		
		String txt=sc.text();
		System.out.println(txt.toString());
		System.out.println("Tes");

	}
}
