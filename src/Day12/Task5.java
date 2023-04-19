package Day12;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main (String[]args){
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Stalin", 70));
        members1.add(new MusicArtist("Beriy", 65));
        members1.add(new MusicArtist("Gulag", 120));

        MusicBand band1 = new MusicBand("Put Tv Stalina", 1936, members1);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("Maslo", 12));
        members2.add(new MusicArtist("Kartoshka", 1));
        members2.add(new MusicArtist("Sol", 50));

        MusicBand band2 = new MusicBand("Kartoshka Freee", 2001, members2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMemders(band1, band2);

        band1.printMembers();
        band2.printMembers();


    }

}
