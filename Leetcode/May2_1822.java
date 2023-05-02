class solution {
    public int arraySign(int[] arr) {
        int neg = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                neg++;
            } else if (arr[i] == 0) {
                return 0;
            }
        }
        if (neg % 2 == 0)
            return 1;
        return -1;
    }

    public static void main(String[] args) {
        solution obj = new solution();
        int[] arr = { 9, 72, 34, 29, -49, -22, -77, -17, -66, -75, -44, -30, -24 };
        System.out.println(obj.arraySign(arr));
    }
}