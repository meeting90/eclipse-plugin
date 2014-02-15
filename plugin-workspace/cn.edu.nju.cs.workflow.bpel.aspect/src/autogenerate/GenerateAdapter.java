package autogenerate;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class GenerateAdapter {

	public static void main(String[] args) throws FileNotFoundException{
		Scanner scanner=new Scanner(new File("model.txt"));
		PrintWriter writer=new PrintWriter(new File("generate.java"));
		while(scanner.hasNext()){
			String className=scanner.nextLine();
			writer.println("else if(model instanceof "+className+") {");
			writer.println("\tadapter=new "+className+"Adapter();");
			writer.println("\treturn adapter.createEditPart(context, model);");
			writer.print("}");
		}
		writer.flush();
		writer.close();
	}
}
