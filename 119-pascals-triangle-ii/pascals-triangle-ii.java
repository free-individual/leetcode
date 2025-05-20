class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> prv = new ArrayList<>();
        prv.add(1);
        int i = 0;
        while(i < rowIndex){
            List<Integer> l = new ArrayList<>();
            int j = 0;
            l.add(1);
            while(j < prv.size() - 1){
                l.add((prv.get(j) + prv.get(j + 1)));
                j++;
            }
            l.add(1);
            prv = l;
            i++;
        }
        return prv;
    }
}