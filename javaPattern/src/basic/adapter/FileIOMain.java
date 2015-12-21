package basic.adapter;

public class FileIOMain {
	public static void main(String[] ars) throws Exception {
		FileIO f = new FileProperties();
		f.readFromFile("/storage/emulated/0/AppProjects/crystal-caugh/javaPattern/src/basic/Adapter/file.txt");
		f.setValue("year", "2004");
		f.setValue("month", "4");
		f.setValue("day", "21");
		f.writeToFile("/storage/emulated/0/AppProjects/crystal-caugh/javaPattern/src/basic/Adapter/newfile.txt");
	}
}
