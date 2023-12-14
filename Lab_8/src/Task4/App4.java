package Task4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
/*
Implement a class named Song with the following attributes:
- title (String): Represents the title of the song.
- artist (String): Represents the artist of the song.
- genre (String): Represents the genre of the song.

Implement a class named GenreFilterIterator that implements the Iterator<Song> interface. This iterator should filter songs in a playlist 
based on a specified target genre. Create a constructor that takes a playlist and a target genre as parameters. 
 
The iterator should have the following methods:
- public boolean hasNext(): Returns true if there are more songs in the playlist with the target genre; otherwise, returns false.
- public Song next(): Returns the next song in the playlist with the target genre. Throws a NoSuchElementException if there are no more songs.

In the main method create a playlist of songs. Add a few songs to the playlist with different titles, artists, and genres. Create an 
instance of the GenreFilterIterator, passing the playlist and a target genre as parameters. Use the iterator to print the details of 
songs with the target genre.
*/

class Song {
    private String title;
    private String artist;
    private String genre;

    public Song(String title, String artist, String genre) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }
}

class GenreFilterIterator implements Iterator<Song> {
    private List<Song> playlist;
    private String targetGenre;
    private int currentIndex;

    public GenreFilterIterator(List<Song> playlist, String targetGenre) {
        this.playlist = playlist;
        this.targetGenre = targetGenre;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        while (currentIndex < playlist.size()) {
            if (playlist.get(currentIndex).getGenre().equals(targetGenre)) {
                return true;
            }
            currentIndex++;
        }
        return false;
    }

    @Override
    public Song next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No more songs with the target genre");
        }
        return playlist.get(currentIndex++);
    }
}

public class App4 {
    public static void main(String[] args) {
        // Create a playlist of songs
        List<Song> playlist = new ArrayList<>();
        playlist.add(new Song("Song1", "Artist1", "Pop"));
        playlist.add(new Song("Song2", "Artist2", "Rock"));
        playlist.add(new Song("Song3", "Artist3", "Pop"));
        playlist.add(new Song("Song4", "Artist4", "Hip Hop"));

        // Create an instance of GenreFilterIterator
        String targetGenre = "Pop";
        GenreFilterIterator genreFilterIterator = new GenreFilterIterator(playlist, targetGenre);

        // Use the iterator to print the details of songs with the target genre
        System.out.println("Songs with Genre: " + targetGenre);
        while (genreFilterIterator.hasNext()) {
            Song song = genreFilterIterator.next();
            System.out.println("Title: " + song.getTitle() + ", Artist: " + song.getArtist() + ", Genre: " + song.getGenre());
        }
    }
}