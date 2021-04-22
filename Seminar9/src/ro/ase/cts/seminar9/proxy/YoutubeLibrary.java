package ro.ase.cts.seminar9.proxy;

import java.util.ArrayList;

public class YoutubeLibrary implements YoutubeLibraryInterface{
private VideoDatabase database;
public YoutubeLibrary() {
	this.database=new VideoDatabase();
}
	@Override
	public String listVideo() {
		System.out.println("Fetching video from database...");
		ArrayList<YoutubeVideo> videoList= database.getVideoCollection();
		StringBuilder videoListBuilder = new StringBuilder();
		for(YoutubeVideo video:videoList) {
			videoListBuilder.append(video.getId())
			.append("-")
			.append(video.getTitle())
			.append(video.getDuration())
			.append("/n");
		}
		return videoListBuilder.toString();
	}

	@Override
	public String getVideoInfo(int id) {
		System.out.println("Fetching data info...");
		return database.getVideoInfo(id);
	}

}
