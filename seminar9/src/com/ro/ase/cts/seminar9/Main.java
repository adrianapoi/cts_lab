package com.ro.ase.cts.seminar9;

import com.ro.ase.cts.seminar9.flyweight.Model3DFactory;
import com.ro.ase.cts.seminar9.flyweight.ModelFlyweightInterface;
import com.ro.ase.cts.seminar9.flyweight.ModelType;
import com.ro.ase.cts.seminar9.flyweight.ScreenData;
import com.ro.ase.cts.seminar9.proxy.YoutubeLibrary;
import com.ro.ase.cts.seminar9.proxy.YoutubeLibraryInterface;
import com.ro.ase.cts.seminar9.proxy.YoutubeLibraryProxy;

public class Main {

	public static void main(String[] args) {
		YoutubeLibraryInterface youtubeLib = new YoutubeLibrary();
		System.out.println(youtubeLib.listVideo());
		System.out.println(youtubeLib.getVidoeInfo(1));
		System.out.println(youtubeLib.getVidoeInfo(1));
		System.out.println("--------------------------------------------------");
		// with proxy
		YoutubeLibraryInterface youtubeLibProxy = new YoutubeLibraryProxy();
		System.out.println(youtubeLib.listVideo());
		System.out.println(youtubeLib.listVideo());

		System.out.println(youtubeLibProxy.getVidoeInfo(1));
		System.out.println(youtubeLibProxy.getVidoeInfo(1));
		System.out.println(".....................");
		ScreenData dataSet1 = new ScreenData("green", 99, 30, 100);
		ScreenData dataSet2 = new ScreenData("green", 20, 30, 40);

		ModelFlyweightInterface solider1 = Model3DFactory.getModel(ModelType.SOLIDER);
		ModelFlyweightInterface solider2 = Model3DFactory.getModel(ModelType.SOLIDER);

		solider1.display(dataSet1);
		solider1.display(dataSet2);
		solider2.display(dataSet2);

	}

}
