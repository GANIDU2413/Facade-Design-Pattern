package DP.FacadeDP;

public class MultimediaFacade {
    void playAudio(String audio){
        new AudioPlayer().play(audio);
    }
    void playVideo(String video){
        new VideoPlayer().play(video);
    }
    void projectOnScreen(){
        new Projector().projectOnScreen();
    }

}
