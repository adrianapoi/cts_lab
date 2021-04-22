package com.ro.ase.cts.seminar9.proxy;

public class YoutubeLibraryProxy implements YoutubeLibraryInterface {

	private YoutubeLibraryInterface libImplementation;

	public YoutubeLibraryProxy() {
		libImplementation = new YoutubeLibrary();
	}

	@Override
	public String listVideo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getVidoeInfo(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
