package ro.ase.cts.seminar9;

import ro.ase.cts.seminar9.flyweight.Model3DFactory;
import ro.ase.cts.seminar9.flyweight.ModelFlyweightInterface;
import ro.ase.cts.seminar9.flyweight.ModelType;
import ro.ase.cts.seminar9.flyweight.ScreenData;
import ro.ase.cts.seminar9.proxy.YoutubeLibrary;
import ro.ase.cts.seminar9.proxy.YoutubeLibraryInterface;
import ro.ase.cts.seminar9.proxy.YoutubeLibraryProxy;

public class Main {

	public static void main(String[] args) {
		//without proxy
		YoutubeLibraryInterface youtubeLib=new YoutubeLibrary();
		System.out.println(youtubeLib.listVideo());
		System.out.println(youtubeLib.getVideoInfo(1));
		System.out.println(youtubeLib.getVideoInfo(1));

		//with proxy
		YoutubeLibraryInterface youtubeProxy=new YoutubeLibraryProxy();
		System.out.println(youtubeProxy.listVideo());
		System.out.println(youtubeProxy.getVideoInfo(1));
		System.out.println(youtubeProxy.getVideoInfo(1));
		System.out.println("------------------------------------");
		ScreenData dataSet1= new ScreenData("green", 99, 30 , 100);
		ScreenData dataSet2= new ScreenData("green", 20, 30, 40);
		
		ModelFlyweightInterface soldier1= Model3DFactory.getModel(ModelType.SOLDIER);
		soldier1.diplay(dataSet1);
		soldier1.diplay(dataSet2);
	}

}
