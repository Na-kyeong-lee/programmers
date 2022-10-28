class Solution {
    public int solution(int n) {
        int answer = 0;
        // 다시 풀기
        
        // 0이 될 때까지 반복
        while (n != 0) {
            
            //n을 10으로 나눈 나머지를 answer에 더하고
            answer += n % 10;
            
            n /= 10;
            
        }
        
        
        return answer;
    }
}