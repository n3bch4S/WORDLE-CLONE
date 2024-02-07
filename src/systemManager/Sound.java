package systemManager;

import javax.sound.sampled.*;
import java.io.*;

public abstract class Sound {

    /*public static final Clip[] SONG = getSounds("audio\\music\\minecraft");*/
    public static Clip getSound(String url) {
        File file = new File(url);
        try ( AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)) {
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            return clip;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;

    }

    /*public static Clip getSound(File file) {
        try (AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)) {
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            return clip;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    
    public static Clip[] getSounds(String folderURL) {
        System.out.println("Loading song...");
        File[] mcSongFile = FileManage.getAllFile(folderURL);
        Clip[] mcSong = new Clip[mcSongFile.length];
        for (int i = 0 ; i < mcSong.length ; i++) {
            mcSong[i] = getSound(mcSongFile[i]);
        }
        System.out.println("Loading complete");
        return mcSong;
    }
    
    public static void randomPlay(Clip[] songList) {
        Random rnd = new Random();
        int num = rnd.nextInt(songList.length);
        songList[num].start();
    }*/
}
