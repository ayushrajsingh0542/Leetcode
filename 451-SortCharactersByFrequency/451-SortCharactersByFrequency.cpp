// Last updated: 15/08/2026, 20:02:19
class Solution {
public:
    string frequencySort(string s) {
     map<char,int>mp;
        for(auto a:s){
            mp[a]++;
        }

        priority_queue<pair<int,char>>pq;
        for(auto i:mp){
        pq.push({i.second,i.first});
        }

        string str="";
        while(!pq.empty()){
            auto i=pq.top();
            pq.pop();
            for(int j=0;j<i.first;j++)
            str+=i.second;
        }
        return str;
    }
};