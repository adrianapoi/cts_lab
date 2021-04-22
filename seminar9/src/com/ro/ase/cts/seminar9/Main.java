package com.ro.ase.cts.seminar9;

import com.ro.ase.cts.seminar9.proxy.YoutubeLibrary;
import com.ro.ase.cts.seminar9.proxy.YoutubeLibraryInterface;

public class Main {

	public static void main(String[] args) {
		YoutubeLibraryInterface youtubeLib =  new YoutubeLibrary();
		System.out.println(youtubeLib.listVideo());
		System.out.println(youtubeLib.getVidoeInfo(1));

	}

}
