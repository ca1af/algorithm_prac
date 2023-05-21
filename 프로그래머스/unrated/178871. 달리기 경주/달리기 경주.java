import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> playerMap = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            playerMap.put(players[i], i);
        }
        
        ArrayList<String> playerList = new ArrayList<>(Arrays.asList(players));

        for (int i = 0; i < callings.length; i++) {
            String calling = callings[i];
            if (playerMap.containsKey(calling)) {
                int j = playerMap.get(calling);
                if (j > 0) {
                    String calledPlayer = playerList.get(j);
                    String previousPlayer = playerList.get(j - 1);

                    playerList.set(j, previousPlayer);
                    playerList.set(j - 1, calledPlayer);
                    
                    playerMap.put(previousPlayer, j);
                    playerMap.put(calledPlayer, j - 1);
                }
            }
        }

        return playerList.toArray(new String[0]);
    }

}