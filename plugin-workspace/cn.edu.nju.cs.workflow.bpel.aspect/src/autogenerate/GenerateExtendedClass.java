package autogenerate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;


public class GenerateExtendedClass {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		String template=getTemplate("BPELTemplateCommandClass.txt");
		for(String toExtend: getToExtendClasses("CommandClasses.txt") ){
			System.out.println("create BPEL"+toExtend+".java");
			String result=template.replace("$", toExtend);
			PrintWriter writer=new PrintWriter("tmp/BPEL"+toExtend+".java");
			writer.append(result);
			writer.flush();
			writer.close();
		}
		System.out.println("done");
		
		
	}
	public static ArrayList<String> getToExtendClasses(String resource) throws IOException{
		ArrayList<String> toExtendClassName=new ArrayList<String>();
		InputStream in = GenerateExtendedClass.class.getResourceAsStream(resource); 
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		String line=null;
		while ( (line = reader.readLine()) != null) {
              toExtendClassName.add(line);
              
        }
		return toExtendClassName;
			
	}
	public static String getTemplate(String templateResource) throws IOException{
		String templateStr="";
		InputStream in = GenerateExtendedClass.class.getResourceAsStream(templateResource); 
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		String line=null;
		while ( (line = reader.readLine()) != null) {
             templateStr+=line+"\n";
        }
		return templateStr;
		
	}
	
	

}
