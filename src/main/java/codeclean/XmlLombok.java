package codeclean;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

import javax.sound.sampled.Line;

public class XmlLombok {

	public static void main(String[] args) {
		
		String directory = "C:\\java-projects\\codeclean\\src\\main\\java\\com\\moneycatcha\\app\\model";
		String outputDir = "C:\\java-projects\\codeclean\\src\\main\\java\\com\\moneycatcha\\app\\model\\lombok";
		
		File[] files = new File(directory).listFiles();
		
		List<String> filenames = new ArrayList<String>();
		
		for (File file : files) {
			if (file.isFile()) {
				if (!file.getName().endsWith("TypeList.java") && !(file.getName().endsWith("List.java"))
						&& !(file.getName().endsWith(".uml")) && !(file.getName().endsWith(".umlcd"))) {
					filenames.add(file.getName());
					System.out.println("file name: " + file.getName());
				}
			}
		}
		
		try {
			
			for (String name : filenames) {
//			String name = "AddressType.java";
				Path path = Paths.get(directory, name);
				List<String> readList = Files.readAllLines(path);
				List<String> writeList = new ArrayList<String>();
				boolean flag = true;
				for (int i=0; i < readList.size(); i++) {
					if(readList.get(i).contains("import")) {
						if (flag) {
							writeList.add("import lombok.Data;\r");
							writeList.add("import javax.persistence.Column;\r");
							writeList.add("import javax.persistence.Entity;\r");
							writeList.add("import javax.persistence.Transient;\r");
							writeList.add("import javax.persistence.Id;\r");
							writeList.add("import javax.persistence.Table;\r");
							writeList.add("import javax.validation.constraints.NotNull;\r");
							flag = false;
						}
					}
					if (readList.get(i).contains("public class") || readList.get(i).contains("public static")) { 
						writeList.add("\n@Data") ;
						writeList.add("\n@Entity") ;
					}
					if (readList.get(i).contains("public void set")) {
						i = i + 3;
					}
					if (!readList.get(i).contains("List<")) {
						if (readList.get(i).contains("get")) {
							i = i + 3;
						}
					}
					if (readList.get(i).trim() != null) {
						writeList.add(readList.get(i));
					}
				}
					
				List<String> results = new ArrayList<String>();
				for(int i=0; i< writeList.size(); i++) {
					if (writeList.get(i).trim().isEmpty()) {
						writeList.set(i, "a");
						continue;
					}
					results.add(writeList.get(i));
				}

				System.out.println("********* results ************");
				results.forEach(System.out::println);
	
				Path writePath = Paths.get(outputDir, name);
				Files.write(writePath, results, StandardOpenOption.CREATE);
				writeList.clear();
				results.clear();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("completed");
	}
}
