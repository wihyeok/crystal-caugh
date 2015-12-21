package basic.adapter;

import java.util.*;
import java.io.*;

/**
* 상속을 사용한 Adapter 패턴
* Properties 객체를 물리 file에서 읽어 새로운 Properties 파일을 생성
*/
public class FileProperties extends Properties implements FileIO {

	public void readFromFile(String filename) throws IOException {
		load(new FileInputStream(filename));
	}
	
	public void writeToFile(String filename) throws IOException {
		store(new FileOutputStream(filename), "written by FileProperties");
	}
	
	public void setValue(String key, String value) {
		setProperty(key, value);
	}
	
	public String getValue(String key) {
		return getProperty(key, "");
	}
	
}
