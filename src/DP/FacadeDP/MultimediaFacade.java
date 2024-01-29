package DP.FacadeDP;

public class MultimediaFacade {
    private final AudioPlayer ap = new AudioPlayer();
    private final VideoPlayer vp = new VideoPlayer();
    private final Projector pj = new Projector();

    public void PlayVideo(String video,String audio){
        ap.play(audio);
        vp.play(video);
        pj.projectOnScreen();
    }

}
