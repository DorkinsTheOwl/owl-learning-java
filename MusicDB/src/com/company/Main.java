package com.company;

import com.company.model.Artist;
import com.company.model.Datasource;
import com.company.model.SongArtist;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Datasource datasource = new Datasource();
        if (!datasource.open()) {
            System.out.println("Can't open datasource");
            return;
        }

        List<Artist> artists = datasource.queryArtists(Datasource.ORDER_BY_NONE);
        if (artists == null) {
            System.out.println("No artists!");
            return;
        }

        for (Artist artist : artists) {
            System.out.println("ID = " + artist.getId() + ", Name = " + artist.getName());
        }

        System.out.println("====================================================");
        List<String> albumsForArtists = datasource.queryAlbumsForArtist("Carole King", Datasource.ORDER_BY_ASC);

        for (String album : albumsForArtists) {
            System.out.println(album);
        }

        System.out.println("====================================================");
        List<SongArtist> songArtists = datasource.queryArtistsForSong("Go Your Own Way", Datasource.ORDER_BY_ASC);
        if (songArtists == null) {
            System.out.println("Couldn't find the artist for the song");
            return;
        }

        for (SongArtist artist : songArtists) {
            System.out.println("Artist name = " + artist.getArtistName() + ", Album name = " + artist.getAlbumName() +
                    ", Track = " + artist.getTrack());
        }

        datasource.querySongsMetadata();

        int count = datasource.getCount(Datasource.TABLE_SONGS);
        System.out.printf("Number of songs is: %d\n", count);

        System.out.println("====================================================");
        datasource.createViewForSongArtists();

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a song title: ");
//        String title = scanner.nextLine();
        String title = "Go Your Own Way";

//        songArtists = datasource.querySongInfoView("She's on Fire");
        songArtists = datasource.querySongInfoView(title);
        if (songArtists.isEmpty()) {
            System.out.println("Couldn't find the artist for the song");
            return;
        }

        for (SongArtist artist : songArtists) {
            System.out.println("FROM VIEW - Artist name = " + artist.getArtistName() + ", Album name = " + artist.getAlbumName() +
                    ", Track number = " + artist.getTrack());
        }

        System.out.println("====================================================");
        datasource.insertSong("Bird Dog", "Everly Brothers", "All-Time Greatest Hits", 7);

        datasource.close();
    }
}
