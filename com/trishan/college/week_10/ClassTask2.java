package com.trishan.college.week_10;

public class ClassTask2 {
  public static void main(String[] args) {

  }
}

interface Media {
  void play();

  void pause();

  void next();

  void previous();

  String nowPlaying();
}

interface DigitalMedia extends Media {
  double size();

  double remaining(double current);
}

interface OnlineAsset {
  void download();
}

class Spotify implements DigitalMedia, OnlineAsset {
  @Override
  public void play() {
    System.out.println("Music playing...");
  }

  @Override
  public void pause() {
    System.out.println("Music paused...");
  }

  @Override
  public void next() {
    System.out.println("Playing next music...");
  }

  @Override
  public void previous() {
    System.out.println("Playing previous music...");
  }

  @Override
  public String nowPlaying() {
    return "Hanuman Chalisa";
  }

  @Override
  public double size() {
    return 12.3;
  }

  @Override
  public double remaining(double current) {
    return 12.4 * current;
  }

  @Override
  public void download() {
    System.out.println("Music downloading...");
  }
}
