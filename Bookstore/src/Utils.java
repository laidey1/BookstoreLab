import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;


public class Utils {
	
	public static void loadStringstoArray(ArrayList<String>arrList) throws IOException {
		
		Path path = Paths.get("Titles.txt");
		arrList.clear();
		
		try (Stream<String> lines = Files.lines(path)) {
			Object[] arr = lines.toArray();
			
			for(Object t : arr)
			{
			arrList.add(t.toString());	
			}
			}
	}
	private void loadTitles() {
		
	}
}