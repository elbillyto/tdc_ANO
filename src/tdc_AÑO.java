import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.lang.*;

public class tdc_AÑO {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		System.out.println("\n--**-- INICIO --**--");				
		System.out.println("esto es el TDC AÑO");
		System.out.println("codificación original de fichero de fuentes Cp1252");
		System.out.println("compilado con JavaSE-1.6");

		System.out.println("Default Charset=" + Charset.defaultCharset());
    	System.out.println("Default Charset in Use=" + getDefaultCharSet());
    	System.out.println("System FileEncoding= "+System.getProperty("file.encoding"));
    	
		String xml = new String("¤-Ä-Ñ");
		byte[] utf8 = null;
		byte[] Bytes_utf8_comoLatin1 = null;
		byte[] Bytes_latin1CP_comoLatin1 = null;			
		byte[] latin1CP = null;

		
		String Bytes_latin1CP_comoLatin1STR = null;				
		String latin1CPSTR = null;		
		String utf8comolatin1STR = null;
		String utf8STR = null;	
		String Bytes_utf8_comoLatin1STR = null;	
	
		try {
	
			System.out.println("Cadena original= "+xml );

			//como latin1
			latin1CP = xml.getBytes("Cp1252");
			//System.out.println("Bytes en Cp1252= "+latin1CP);
			latin1CPSTR= new String(latin1CP);
			System.out.println(" en Cp1252= "+latin1CPSTR);
			
			//como utf8			
			utf8 = xml.getBytes("UTF-8");
			//System.out.println("bytes  en utf8= "+utf8);			
			utf8STR= new String(utf8);
			System.out.println(" en utf8 = "+utf8STR);
			
			//Bytes latin1 de una cadena latin1 codificada como latin1
			Bytes_latin1CP_comoLatin1 = new String(latin1CP, "ISO-8859-1").getBytes("ISO-8859-1");
			//System.out.println("bytes Latin1 de Cadena codificada en utf8= "+Bytes_latin1CP_comoLatin1);		
			Bytes_latin1CP_comoLatin1STR= new String(Bytes_latin1CP_comoLatin1);
			System.out.println("Cadena Latin1 de los Bytes tomados como latin1 = "+Bytes_latin1CP_comoLatin1STR);
			
			//Bytes UTF8 de una cadena latin1 codificada como Latin1
			Bytes_utf8_comoLatin1 = new String(latin1CP, "ISO-8859-1").getBytes("UTF-8");
			//System.out.println("bytes utf8 de Cadena codificada en ISO-8859-1= "+Bytes_utf8_comoLatin1);
			utf8comolatin1STR= new String(utf8);
			System.out.println("Cadena utf8 de los Bytes tomados como Latin1 = "+utf8comolatin1STR);

			
			//Bytes utf8 de una cadena latin1
			Bytes_utf8_comoLatin1 = new String(latin1CP, "UTF-8").getBytes("ISO-8859-1");
			//System.out.println("bytes Latin1 de Cadena codificada en utf8= "+Bytes_latin1CP_comoLatin1);		
			Bytes_utf8_comoLatin1STR= new String(Bytes_utf8_comoLatin1);
			System.out.println("Bytes utf8 de una cadena latin1 = "+Bytes_utf8_comoLatin1STR);
			
			//Bytes UTF8 de una cadena utf8
			Bytes_utf8_comoLatin1 = new String(latin1CP, "UTF-8").getBytes("UTF-8");
			//System.out.println("bytes utf8 de Cadena codificada en ISO-8859-1= "+Bytes_utf8_comoLatin1);
			utf8comolatin1STR= new String(utf8);
			System.out.println("Bytes UTF8 de una cadena utf8 = "+utf8comolatin1STR);
			
		} catch (UnsupportedEncodingException e1) {
			// TODO Bloque catch generado automáticamente
			e1.printStackTrace();
		}
		
/*cambiamos charset*/
		System.out.println("-- CAMBIAMOS FILE ENCODING");
		if( ! System.getProperty("file.encoding").equalsIgnoreCase("UTF-8") )
				System.setProperty("file.encoding", "UTF-8");
		else 
				//System.setProperty("file.encoding", "ISO-8859-1");
				System.setProperty("file.encoding", "windows-1252");
		
		System.out.println("Default Charset=" + Charset.defaultCharset());
    	System.out.println("Default Charset in Use=" + getDefaultCharSet());
    	System.out.println("System FileEncoding= "+System.getProperty("file.encoding"));
		try {

			System.out.println("Cadena original= "+xml );

			//como latin1
			latin1CP = xml.getBytes("Cp1252");
			//System.out.println("Bytes en Cp1252= "+latin1CP);
			latin1CPSTR= new String(latin1CP);
			System.out.println(" en Cp1252= "+latin1CPSTR);
			
			//como utf8			
			utf8 = xml.getBytes("UTF-8");
			//System.out.println("bytes  en utf8= "+utf8);			
			utf8STR= new String(utf8);
			System.out.println(" en utf8 = "+utf8STR);
			
			//Bytes latin1 de una cadena latin1 codificada como latin1
			Bytes_latin1CP_comoLatin1 = new String(latin1CP, "ISO-8859-1").getBytes("ISO-8859-1");
			//System.out.println("bytes Latin1 de Cadena codificada en utf8= "+Bytes_latin1CP_comoLatin1);		
			Bytes_latin1CP_comoLatin1STR= new String(Bytes_latin1CP_comoLatin1);
			System.out.println("Cadena Latin1 de los Bytes tomados como latin1 = "+Bytes_latin1CP_comoLatin1STR);
			
			//Bytes UTF8 de una cadena latin1 codificada como Latin1
			Bytes_utf8_comoLatin1 = new String(latin1CP, "ISO-8859-1").getBytes("UTF-8");
			//System.out.println("bytes utf8 de Cadena codificada en ISO-8859-1= "+Bytes_utf8_comoLatin1);
			utf8comolatin1STR= new String(utf8);
			System.out.println("Cadena utf8 de los Bytes tomados como Latin1 = "+utf8comolatin1STR);

			
			//Bytes utf8 de una cadena latin1
			Bytes_utf8_comoLatin1 = new String(latin1CP, "UTF-8").getBytes("ISO-8859-1");
			//System.out.println("bytes Latin1 de Cadena codificada en utf8= "+Bytes_latin1CP_comoLatin1);		
			Bytes_utf8_comoLatin1STR= new String(Bytes_utf8_comoLatin1);
			System.out.println("Bytes utf8 de una cadena latin1 = "+Bytes_utf8_comoLatin1STR);
			
			//Bytes UTF8 de una cadena utf8
			Bytes_utf8_comoLatin1 = new String(latin1CP, "UTF-8").getBytes("UTF-8");
			//System.out.println("bytes utf8 de Cadena codificada en ISO-8859-1= "+Bytes_utf8_comoLatin1);
			utf8comolatin1STR= new String(utf8);
			System.out.println("Bytes UTF8 de una cadena utf8 = "+utf8comolatin1STR);		
			
		} catch (UnsupportedEncodingException e1) {
			// TODO Bloque catch generado automáticamente
			e1.printStackTrace();
		}
		
		
	}
    private static String getDefaultCharSet() {
    	OutputStreamWriter writer = new OutputStreamWriter(new ByteArrayOutputStream());
    	String enc = writer.getEncoding();
    	return enc;
    }
}
