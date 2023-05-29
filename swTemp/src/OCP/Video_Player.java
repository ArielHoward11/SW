package OCP;

public class Video_Player {
	playCodec codec;

	Video_Player() {
		System.out.println("Video_Playe 실행");
	}

	Video_Player(playCodec codec) {
		System.out.println("Video_Playe 실행");
	}

	void setCodec(playCodec codec) {
		this.codec = codec;
		System.out.println("코덱설정");
	}

	void start() {
		codec.play();
	}
}
