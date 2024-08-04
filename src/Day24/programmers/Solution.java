package Day24.programmers;

class Solution {
    static boolean[] visited;
    static int answer = 0;
    public int solution(String begin, String target, String[] words) {
        visited = new boolean[words.length];

        dfs(begin, target, words, 0);

        return answer;
    }

    public void dfs(String begin, String target, String[] words, int cnt) {
        if(begin.equals(target)) {
            answer = cnt;
            return;
        }

        for(int i = 0; i < words.length; i++) {
            if(visited[i]) continue;

            int dif = 0;
            for(int j = 0; j < begin.length(); j++) {
                if(begin.charAt(j) != words[i].charAt(j)) dif++;
            }

            if(dif == 1) {
                visited[i] = true;
                dfs(words[i], target, words, cnt +1);
                visited[i] = false;
            }

        }

    }
}
