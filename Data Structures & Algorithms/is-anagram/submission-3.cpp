class Solution {
public:
    bool isAnagram(string s, string t)
    {
     int size1=s.size();
    int size2=t.size();
    //    for(int i=0;i<size1;i++)
    //    {
    //     for(int j=0;j<size2;j++)
    //     {
    //         if(s[i]!=)
    //     }
    //    }   

if(size1!=size2)
{
    return false;
}
    map<char,int>map;
    for(int i=0;i<size1;i++ ){
        map[s[i]]++;
    }
     for(int i=0;i<size2;i++ ){
        map[t[i]]--;
    }
  for(int i=0;i<size1;i++){
    if(map[s[i]]!=0){
        return false;
    }
  }
  
   return true;
    }
};
