# Last updated: 15/08/2026, 19:50:54
class Solution:
    def furthestDistanceFromOrigin(self, moves: str) -> int:
        count=0
        ans=0
        for ch in moves:
            if ch=='L':
                ans-=1
            elif ch=='R':
                ans+=1
            else:
                count+=1
        
        return abs(ans)+count



        