package khh;

import java.util.*;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42579#qna
 *  
 * @author hyunho
 * @since 2021/08/26 
**/
public class BestAlbum {
    public static void main(String[] args) {
//        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
//        int[] plays = {500, 600, 150, 800, 2500};   //result == [4, 1, 3, 0]

//        String[] genres = {"classic", "pop", "classic", "classic", "classic"};
//        int[] plays = {500, 1000, 400, 300, 200, 100};

        String[] genres = {"classic", "pop", "classic", "pop", "classic", "classic"};
        int[] plays = {400, 600, 150, 600, 500, 500};   // result == [4, 5, 1, 3]
        int[] result = solution(genres, plays);
        for (int i : result) {
            System.out.println(i);
        }

    }

    static public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> genreSumMap = new TreeMap<>();
        List<Song> songList;
        List<Integer> lankList = new ArrayList<>();

        //장르별 합
        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            int play = plays[i];
            genreSumMap.put(genre, genreSumMap.getOrDefault(genre, 0) + play);
        }

        List<String> listKeySet = new ArrayList<>(genreSumMap.keySet());
        Collections.sort(listKeySet, (value1, value2) -> (genreSumMap.get(value2).compareTo(genreSumMap.get(value1))));
        for (String key : listKeySet) {
            System.out.println("Category key == " + key);
            System.out.println("Category sum == " + genreSumMap.get(key));
            songList = new ArrayList<>();
            for (int i = 0; i < genres.length; i++) {
                String genre = genres[i];
                System.out.println("genre == " + genre);
                int play = plays[i];
                if (key.equals(genres[i])) {
                    songList.add(new Song(i, genre, play));
                }
            }
            System.out.println("songList == " + songList.size());
            if (songList.size() > 0) {
                Collections.sort(songList, (o1, o2) -> o2.play - o1.play); // 내림차순 정렬
                if (songList.size() < 2) {
                    lankList.add(songList.get(0).idNumber);
                } else {
                    for (int i = 0; i < 2; i++) {
                        lankList.add(songList.get(i).idNumber);
                    }
                }
            }
        }

        int[] answer = new int[lankList.size()];
        for (int i = 0; i < lankList.size(); i++) {
            answer[i] = lankList.get(i);
        }
        return answer;
    }

    static class Song {
        int idNumber;
        String genre;
        int play;

        public Song(int idNumber, String genre, int play) {
            this.idNumber = idNumber;
            this.genre = genre;
            this.play = play;
        }
    }
}
