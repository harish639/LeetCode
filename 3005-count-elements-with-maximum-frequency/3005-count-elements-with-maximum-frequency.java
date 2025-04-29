class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int c :nums){
            if(!hm.containsKey(c)){
                hm.put(c,1);
            }
            else{
                hm.put(c,hm.get(c)+1);
            }
        }
        int max=Integer.MIN_VALUE;
        for(int num :hm.values()){
            max=Math.max(num,max);
        }
        int sum=0;
        for(int i:hm.keySet()){
            if(hm.get(i)==max){
                sum=sum+hm.get(i);
            }
        }
        return sum;
    }
}