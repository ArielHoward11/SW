package OCP;

public class OCPExample {

	public static void main(String[] args) {
		Video_Player player = new Video_Player();
		
		player.setCodec(new MP4());
		player.start();
		
		player.setCodec(new WMV());
		player.start();
		
		player.setCodec(new AVI());
		player.start();
		
		player.setCodec(new MP21());
		player.start();
	}

}
