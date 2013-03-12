package graphitiexample;

public class ExampleUtil {
    public static int count=0;
	public static String askString(String title, String userQuestion,
			String string) {
		// TODO Auto-generated method stub
		if(string.equals("")||string==null){
			count++;
			return "ECLass"+count;
		}
		else
			return string+count;
	}

}
