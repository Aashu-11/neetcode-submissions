class MedianFinder {
    List<Integer> list = new ArrayList<>();

    public MedianFinder() {
        this.list = new ArrayList<>();    
    }
    
    public void addNum(int num) {
        list.add(num);
    }
    
    public double findMedian() {       
         Collections.sort(list);

        if(list.size() % 2 != 0){
            return (double)list.get((list.size() / 2));
        }else{
            return (double)(list.get((list.size() / 2)) + list.get((list.size() / 2) - 1)) / 2;
        }
    }
}
