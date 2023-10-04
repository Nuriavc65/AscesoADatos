package carlosGuapo;

import java.io.File;
import java.io.IOException;

public class Ex2T1ADT {

	public static void main(String[] args) {
		String dir = "//newdir/";
		File f = new File(dir);
		f.mkdir();
		try {
			new File(f, "file1").createNewFile();
			File re = new File(f, "file2");
			File rename = new File("renamedFile");
			re.createNewFile();
			re.renameTo(rename);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
