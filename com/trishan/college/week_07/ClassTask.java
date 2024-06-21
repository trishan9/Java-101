package com.trishan.college.week_07;

import java.util.Arrays;

public class ClassTask {
  public static void main(String[] args) {
    Song s1 = new Song("Those Eyes Sped Up", 10);
    Song s2 = new Song("Co2", 20);

    s1.setId(1);
    s2.setId(2);

    s1.setArtists(new String[] { "Trishan", "Wagle" });
    s2.setArtists(new String[] { "Albert", "Trishan" });

    s1.album = "Album A";
    s2.album = "New Song Album";

    s1.description = "Song about her beautiful eyessss!";
    s2.description = "Beautiful song!";

    s1.setDuration(30);

    s2.setArtists(new String[] { "New Singer", "New Singer 2" });

    s1.printDetails();
    s2.printDetails();
  }
}

class Song {
  private int id, duration;
  private String title;
  private String[] artists;
  public String album, description;

  Song(String title, int duration) {
    this.title = title;
    this.duration = duration;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setDuration(int dur) {
    this.duration = dur;
  }

  public void setArtists(String[] artists) {
    this.artists = artists;
  }

  public int getId() {
    return this.id;
  }

  public String getTitle() {
    return this.title;
  }

  public int getDuration() {
    return this.duration;
  }

  public String[] getArtists() {
    return this.artists;
  }

  public void printDetails() {
    System.out.printf("Song %d\nTitle: %s\nDuration: %d\nArtists: %s\nAlbum: %s\nDescription: %s\n\n", this.getId(),
        this.getTitle(), this.getDuration(), Arrays.toString(this.getArtists()), this.album, this.description);
  }
}
