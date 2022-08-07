import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private LinkedList<Song> songs ;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new LinkedList<Song>();
    }

    public boolean addSongs(String title, double duration){
        Song song = findSong(title);
            if (song == null) {
                this.songs.add(new Song(title, duration));
                return true;
            }
        return false;
    }

    public Song findSong(String title){
        for (Song checkedSong : this.songs) {
            if(checkedSong.getTitle().equals(title) ){
                return checkedSong;
            }
        }
        return null;
    }

    public boolean addToPlaylist(int trackNumber ,  LinkedList<Song> playlist){
        int index = trackNumber -1 ;
        if((index >= 0) && ( index <=this.songs.size())){
            playlist.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track "+trackNumber);
        return false;
    }


    public  boolean addToPlaylist(String title , LinkedList<Song> playList){
        Song checkedSong = findSong(title);
        if(checkedSong != null ){
            playList.add(checkedSong);
            return true;
        }
        System.out.println("This song "+ title + " is not in this album");
        return false;
    }



}
