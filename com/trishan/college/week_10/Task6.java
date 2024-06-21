package com.trishan.college.week_10;

public class Task6 {
  // You are developing a media player application. There is a base class called
  // MediaPlayer, which has methods like
  // play(), pause(), and stop(). The VideoPlayer class inherits from MediaPlayer
  // and adds methods like rewind() and
  // fastForward(). Additionally, there is an interface called Playlist, which
  // defines methods like addSong() and
  // removeSong(). The VideoPlayer class implements the Playlist interface.
  // Implement the classes and demonstrate
  // inheritance with interface by creating objects of the VideoPlayer class and
  // calling its methods as well as the
  // interface methods.
  public static void main(String[] args) {
    VideoPlayer mp4 = new VideoPlayer();
    mp4.play();
    mp4.pause();
    mp4.rewind();
    mp4.fastForward();
    mp4.addSong();
    mp4.removeSong();
    mp4.stop();
  }
}

class MediaPlayer {
  void play() {
    System.out.println("Playing audio...");
  }

  void pause() {
    System.out.println("Audio paused!");
  }

  void stop() {
    System.out.println("Audio stopped!");
  }
}

interface Playlist {
  void addSong();

  void removeSong();
}

class VideoPlayer extends MediaPlayer implements Playlist {
  void rewind() {
    System.out.println("Rewinding the video...");
  }

  void fastForward() {
    System.out.println("Fast-forwarding the video...");
  }

  @Override
  public void addSong() {
    System.out.println("Added this video to playlist!");
  }

  @Override
  public void removeSong() {
    System.out.println("Removed this video from playlist!");
  }
}
