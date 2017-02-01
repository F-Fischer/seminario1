package ar.edu.uccor.seminario.http.implementations;

import java.io.BufferedReader;
import java.util.Properties;

import ar.edu.uccor.seminario.http.interfaces.HttpRequest;

public class HttpRequestImpl implements HttpRequest {

	public HttpRequestImpl(BufferedReader in, Properties prop) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getPlainMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getQuery() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getVerb() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isVerbAllowed() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getRequestMimeType() {
		// TODO Auto-generated method stub
		return null;
	}

}
