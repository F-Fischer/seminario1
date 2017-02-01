package ar.edu.uccor.seminario.http.interfaces;

import java.io.IOException;

public interface HttpUtil {

	public byte[] readFile(String virtualPath) throws IOException;

	public boolean fileExists(String virtualPath);
}
